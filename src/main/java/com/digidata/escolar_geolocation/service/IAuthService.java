package com.digidata.escolar_geolocation.service;

import com.digidata.escolar_geolocation.controller.dto.request.LoginRequest;
import com.digidata.escolar_geolocation.controller.dto.response.LoginResponse;

public interface IAuthService {
    LoginResponse login(LoginRequest request);
}
