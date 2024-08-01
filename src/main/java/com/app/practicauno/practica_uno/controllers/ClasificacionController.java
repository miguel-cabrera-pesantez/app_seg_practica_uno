package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.Clasificacion;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clasificacion")
public class ClasificacionController extends BaseController<Clasificacion> {

    @Autowired
    private ClasificacionService service;

    @Override
    protected BaseService<Clasificacion, Integer> getService() {
        return service;
    }

}
