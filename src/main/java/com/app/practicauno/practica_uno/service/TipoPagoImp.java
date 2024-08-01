package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.TipoPagoRepository;
import com.app.practicauno.practica_uno.models.TipoPago;

@Service
public class TipoPagoImp extends BaseServiceImpl<TipoPago, Integer> implements TipoPagoService {

    @Autowired
    private TipoPagoRepository repository;

    public TipoPagoImp(BaseRepository<TipoPago, Integer> baseRepository) {
        super(baseRepository);
    }

}
