package com.digidata.escolar_geolocation.service.implement;

import br.com.digidata.crud.service.CrudService;
import com.digidata.escolar_geolocation.model.Driver;
import com.digidata.escolar_geolocation.service.IDriverService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DriverService extends CrudService<Driver, UUID> implements IDriverService<Driver> {

    public DriverService(JpaRepository<Driver, UUID> repository) {
        super(repository);
    }
}
