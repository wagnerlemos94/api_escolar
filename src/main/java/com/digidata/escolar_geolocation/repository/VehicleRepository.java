package com.digidata.escolar_geolocation.repository;

import com.digidata.escolar_geolocation.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
}
