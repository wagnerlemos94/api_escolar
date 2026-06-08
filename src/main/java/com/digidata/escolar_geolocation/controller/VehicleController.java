package com.digidata.escolar_geolocation.controller;

import com.digidata.escolar_geolocation.controller.dto.request.IRequest;
import com.digidata.escolar_geolocation.controller.dto.request.VehicleRequest;
import com.digidata.escolar_geolocation.controller.dto.response.IResponse;
import com.digidata.escolar_geolocation.controller.dto.response.VehicleResponse;
import com.digidata.escolar_geolocation.model.Vehicle;
import com.digidata.escolar_geolocation.service.IVeichicleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vehicle")
public class VehicleController extends CrudController<VehicleRequest, VehicleResponse, Vehicle> {

    private IVeichicleService<Vehicle> service;

    public VehicleController(IVeichicleService<Vehicle> service, IRequest<VehicleRequest, Vehicle> request, IResponse<Vehicle, VehicleResponse> response) {
        super(service, request, response);
        this.service = service;
    }
}
