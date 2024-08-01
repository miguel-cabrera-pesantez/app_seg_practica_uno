package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.Producto;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController extends BaseController<Producto> {

    @Autowired
    private ProductoService service;

    @Override
    protected BaseService<Producto, Integer> getService() {
        return service;
    }

}
