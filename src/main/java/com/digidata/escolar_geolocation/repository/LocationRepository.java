package com.digidata.escolar_geolocation.repository;

import com.digidata.escolar_geolocation.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> {
    Optional<Location> findTopByVehicleIdOrderByCreatedAtDesc(UUID vehicleId);
}
