package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.FacturaRepository;
import com.app.practicauno.practica_uno.models.Factura;

@Service
public class FacturaImp extends BaseServiceImpl<Factura, Integer> implements FacturaService {

    @Autowired
    private FacturaRepository repository;

    public FacturaImp(BaseRepository<Factura, Integer> baseRepository) {
        super(baseRepository);
    }

}
