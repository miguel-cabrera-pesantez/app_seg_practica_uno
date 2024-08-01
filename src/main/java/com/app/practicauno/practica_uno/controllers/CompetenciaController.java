package com.app.practicauno.practica_uno.controllers;

import com.app.practicauno.practica_uno.models.Competencia;
import com.app.practicauno.practica_uno.service.BaseService;
import com.app.practicauno.practica_uno.service.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competencia")
public class CompetenciaController extends BaseController<Competencia> {

    @Autowired
    private CompetenciaService service;

    @Override
    protected BaseService<Competencia, Integer> getService() {
        return service;
    }

}
