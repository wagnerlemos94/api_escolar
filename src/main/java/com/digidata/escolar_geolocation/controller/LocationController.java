package com.digidata.escolar_geolocation.controller;

import com.digidata.escolar_geolocation.controller.dto.request.LocationRequest;
import com.digidata.escolar_geolocation.controller.dto.response.LocationResponse;
import com.digidata.escolar_geolocation.model.Location;
import com.digidata.escolar_geolocation.service.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("location")
@RequiredArgsConstructor
public class LocationController{

    private final ILocationService<Location> service;
    private final LocationRequest locationRequest = new LocationRequest();
    private final LocationResponse locationResponse = new LocationResponse();

    @GetMapping("/{vehicleId}")
    public LocationResponse getLocation(@PathVariable UUID vehicleId) throws Exception {
        return locationResponse.to(service.findByLocation(vehicleId));
    }

    @PostMapping
    public LocationResponse create(@RequestBody LocationRequest request) throws Exception {
        return locationResponse.to(service.create(locationRequest.to(request)));
    }

}
