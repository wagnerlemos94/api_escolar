package com.digidata.escolar_geolocation.controller.dto.response;

import java.util.List;

public interface IResponse<Model, Response>{
    Response to(Model model);
    List<Response> to(List<Model> model);
}
