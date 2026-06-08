package com.digidata.escolar_geolocation.controller.dto.request;

import com.digidata.escolar_geolocation.model.Vehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Component
public class VehicleRequest implements IRequest<VehicleRequest, Vehicle> {

    private UUID id;

    private String plate;

    private String model;

    private Integer capacity;

    private Boolean active;

    @Override
    public Vehicle to(VehicleRequest vehicleRequest) {
        return Vehicle.builder().active(vehicleRequest.getActive()).capacity(vehicleRequest.getCapacity()).plate(vehicleRequest.getPlate()).model(vehicleRequest.getModel()).id(vehicleRequest.getId()).build();
    }

    @Override
    public List<Vehicle> to(List<VehicleRequest> vehicleRequests) {
        return vehicleRequests.stream().map(this::to).toList();
    }
}
