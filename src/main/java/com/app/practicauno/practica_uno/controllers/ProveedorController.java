package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.Proveedor;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController extends BaseController<Proveedor> {

    @Autowired
    private ProveedorService service;

    @Override
    protected BaseService<Proveedor, Integer> getService() {
        return service;
    }

}
