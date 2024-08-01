package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.ProveedorRepository;
import com.app.practicauno.practica_uno.models.Proveedor;

@Service
public class ProveedorImp extends BaseServiceImpl<Proveedor, Integer> implements ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    public ProveedorImp(BaseRepository<Proveedor, Integer> baseRepository) {
        super(baseRepository);
    }

}
