package com.digidata.escolar_geolocation.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public interface ICrudController<Request, Response> {
    @PostMapping
    Response create(@RequestBody Request request);
    @PutMapping
    Response update(@RequestBody Request request, @RequestParam UUID id);
    @GetMapping
    List<Response> list();
    @GetMapping("{id}")
    Response findById(@PathVariable String id) throws Exception;
    @DeleteMapping
    void delete(@RequestParam UUID id);
}
