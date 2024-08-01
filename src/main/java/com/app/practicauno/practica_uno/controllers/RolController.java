package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.Rol;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolController extends BaseController<Rol> {

    @Autowired
    private RolService service;

    @Override
    protected BaseService<Rol, Integer> getService() {
        return service;
    }

}
