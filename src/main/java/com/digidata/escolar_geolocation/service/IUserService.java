package com.digidata.escolar_geolocation.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface IUserService<T> extends ICrudService<T, UUID>{
}
