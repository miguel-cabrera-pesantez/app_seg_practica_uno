package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.PersonaRepository;
import com.app.practicauno.practica_uno.models.Persona;

@Service
public class PersonaImp extends BaseServiceImpl<Persona, Integer> implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    public PersonaImp(BaseRepository<Persona, Integer> baseRepository) {
        super(baseRepository);
    }

}
