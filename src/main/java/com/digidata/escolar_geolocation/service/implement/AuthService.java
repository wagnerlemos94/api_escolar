package com.digidata.escolar_geolocation.service.implement;

import com.digidata.escolar_geolocation.controller.dto.request.LoginRequest;
import com.digidata.escolar_geolocation.controller.dto.response.LoginResponse;
import com.digidata.escolar_geolocation.model.User;
import com.digidata.escolar_geolocation.repository.UserRepository;
import com.digidata.escolar_geolocation.service.IAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements IAuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository repository;
    private final JwtService jwtService;

    public LoginResponse login(LoginRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.cpf(),
                        request.password()
                )
        );

        User user = repository.findByCpf(request.cpf())
                .orElseThrow();

        String token = jwtService.generateToken(user);

        return new LoginResponse(token, "",user.getName(), user.getCpf());
    }
}