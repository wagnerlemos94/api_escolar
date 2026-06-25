package com.digidata.escolar_geolocation.controller;

import br.com.digidata.crud.controller.CrudController;
import br.com.digidata.crud.controller.dto.request.IRequest;
import br.com.digidata.crud.controller.dto.response.IResponse;
import com.digidata.escolar_geolocation.controller.dto.request.UserRequest;
import com.digidata.escolar_geolocation.controller.dto.response.UserResponse;
import com.digidata.escolar_geolocation.model.User;
import com.digidata.escolar_geolocation.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends CrudController<UserRequest, UserResponse, User> {

    public UserController(IUserService<User> service, IRequest<UserRequest, User> request, IResponse<User, UserResponse> response) {
        super(service, request, response);
    }
}
