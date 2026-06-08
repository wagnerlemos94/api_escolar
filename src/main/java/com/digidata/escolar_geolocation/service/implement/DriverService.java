package com.digidata.escolar_geolocation.service.implement;

import com.digidata.escolar_geolocation.model.Driver;
import com.digidata.escolar_geolocation.service.IDriverService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DriverService implements IDriverService<Driver> {
    @Override
    public Driver findById(UUID id) {
        return null;
    }

    @Override
    public List<Driver> findAll() {
        return List.of();
    }

    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver update(Driver driver, UUID id) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
