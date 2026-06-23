package com.digidata.escolar_geolocation.service.implement;

import br.com.digidata.crud.service.CrudService;
import com.digidata.escolar_geolocation.model.Vehicle;
import com.digidata.escolar_geolocation.repository.VehicleRepository;
import com.digidata.escolar_geolocation.service.IVeichicleService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleService extends CrudService<Vehicle, UUID> implements IVeichicleService<Vehicle> {

    private VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        super(repository);
        this.repository = repository;
    }

}
