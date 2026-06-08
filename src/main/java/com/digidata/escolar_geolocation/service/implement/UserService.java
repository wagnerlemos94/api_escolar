package com.digidata.escolar_geolocation.service.implement;

import com.digidata.escolar_geolocation.enums.Role;
import com.digidata.escolar_geolocation.model.User;
import com.digidata.escolar_geolocation.repository.UserRepository;
import com.digidata.escolar_geolocation.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService extends CrudService<User, UUID> implements IUserService<User>, UserDetailsService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,PasswordEncoder passwordEncoder){
        super(userRepository);
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String cpf)
            throws UsernameNotFoundException {

        return userRepository.findByCpf(cpf)
                .orElseThrow(
                        () -> new UsernameNotFoundException(cpf)
                );
    }

    @Override
    public User create(User user) {
        user = User.builder()
                .cpf(user.getCpf())
                .name(user.getName())
                .password(passwordEncoder.encode(user.getPassword()))
                .role(Role.ADMIN)
                .build();
        return userRepository.save(user);
    }

}
