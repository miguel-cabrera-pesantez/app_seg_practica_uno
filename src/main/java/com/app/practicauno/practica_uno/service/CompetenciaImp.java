package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.CompetenciaRepository;
import com.app.practicauno.practica_uno.models.Competencia;

@Service
public class CompetenciaImp extends BaseServiceImpl<Competencia, Integer> implements CompetenciaService {

    @Autowired
    private CompetenciaRepository repository;

    public CompetenciaImp(BaseRepository<Competencia, Integer> baseRepository) {
        super(baseRepository);
    }

}
