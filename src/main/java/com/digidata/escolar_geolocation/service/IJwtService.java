package com.digidata.escolar_geolocation.service;

import com.digidata.escolar_geolocation.model.User;

public interface IJwtService {

    String generateToken(User user);
    String extractUsername(String token);
}
