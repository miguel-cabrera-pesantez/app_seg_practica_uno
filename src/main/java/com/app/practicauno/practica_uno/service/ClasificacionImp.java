package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.ClasificacionRepository;
import com.app.practicauno.practica_uno.models.Clasificacion;

@Service
public class ClasificacionImp extends BaseServiceImpl<Clasificacion, Integer> implements ClasificacionService {

    @Autowired
    private ClasificacionRepository repository;

    public ClasificacionImp(BaseRepository<Clasificacion, Integer> baseRepository) {
        super(baseRepository);
    }

}
