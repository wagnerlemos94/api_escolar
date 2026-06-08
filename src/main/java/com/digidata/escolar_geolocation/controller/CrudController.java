package com.digidata.escolar_geolocation.controller;

import com.digidata.escolar_geolocation.controller.dto.request.IRequest;
import com.digidata.escolar_geolocation.controller.dto.response.IResponse;
import com.digidata.escolar_geolocation.service.ICrudService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class CrudController<Request , Response, Model> implements ICrudController<Request, Response>{

    public final ICrudService<Model, UUID> service;

    public final IRequest<Request, Model> request;

    public final IResponse<Model, Response> response;

    @Override
    public Response create(Request request) {
        return response.to(service.create(this.request.to(request)));
    }

    @Override
    public Response update(Request request, UUID id) {
        return response.to(service.update(this.request.to(request), id));
    }

    @Override
    public List<Response> list() {
        return response.to(service.findAll());
    }

    @Override
    public Response findById(String id) throws Exception {
        return response.to(service.findById(UUID.fromString(id)));
    }

    @Override
    public void delete(UUID id) {
        service.delete(id);
    }
}
