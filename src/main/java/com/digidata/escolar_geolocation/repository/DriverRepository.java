package com.digidata.escolar_geolocation.repository;

import com.digidata.escolar_geolocation.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DriverRepository extends JpaRepository<Driver, UUID> {
}
