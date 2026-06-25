package com.digidata.escolar_geolocation.service.implement;

import br.com.digidata.crud.exception.ResourceNotFoundException;
import com.digidata.escolar_geolocation.model.Location;
import com.digidata.escolar_geolocation.model.Vehicle;
import com.digidata.escolar_geolocation.repository.LocationRepository;
import com.digidata.escolar_geolocation.service.ILocationService;
import com.digidata.escolar_geolocation.service.IVeichicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LocationService implements ILocationService<Location> {

    private final LocationRepository repository;
    private final IVeichicleService<Vehicle> veichicleService;

    public Location findByLocation(UUID vehicleId){
        return repository.findTopByVehicleIdOrderByCreatedAtDesc(vehicleId).orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada para o veiculo"));
    }

    @Override
    public Location create(Location location){
        veichicleService.findById(location.getVehicleId());
        return repository.save(location);
    }

}
