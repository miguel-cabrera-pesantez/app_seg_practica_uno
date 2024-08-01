package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.TipoPago;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipopago")
public class TipoPagoController extends BaseController<TipoPago> {

    @Autowired
    private TipoPagoService service;

    @Override
    protected BaseService<TipoPago, Integer> getService() {
        return service;
    }

}
