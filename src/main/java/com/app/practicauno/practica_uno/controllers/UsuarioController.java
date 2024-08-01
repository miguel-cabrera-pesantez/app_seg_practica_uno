package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.Usuario;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseController<Usuario> {

    @Autowired
    private UsuarioService service;

    @Override
    protected BaseService<Usuario, Integer> getService() {
        return service;
    }

}
