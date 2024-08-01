package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.RolRepository;
import com.app.practicauno.practica_uno.models.Rol;

@Service
public class RolImp extends BaseServiceImpl<Rol, Integer> implements RolService {

    @Autowired
    private RolRepository repository;

    public RolImp(BaseRepository<Rol, Integer> baseRepository) {
        super(baseRepository);
    }

}
