package com.digidata.escolar_geolocation.service.implement;

import com.digidata.escolar_geolocation.service.ICrudService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
public class CrudService<T, ID> implements ICrudService<T,ID> {

    private JpaRepository<T, ID> repository;

    @Override
    public T findById(ID id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Recurso não encontrado"));
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T create(T t) {
        return repository.save(t);
    }

    @Override
    public T update(T t, ID id) {
        return repository.save(t);
    }

    @Override
    public void delete(ID id) {

    }
}
