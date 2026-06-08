package com.digidata.escolar_geolocation.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ICrudService<T, ID> {

    T findById(ID id) throws Exception;
    List<T> findAll();
    T create(T t);
    T update(T t, ID id);
    void delete(ID id);
}
