package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.ItemFactura;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemfactura")
public class ItemFacturaController extends BaseController<ItemFactura> {

    @Autowired
    private ItemFacturaService service;

    @Override
    protected BaseService<ItemFactura, Integer> getService() {
        return service;
    }

}
