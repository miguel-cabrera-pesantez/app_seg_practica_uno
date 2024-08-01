package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.ProductoRepository;
import com.app.practicauno.practica_uno.models.Producto;

@Service
public class ProductoImp extends BaseServiceImpl<Producto, Integer> implements ProductoService {

    @Autowired
    private ProductoRepository repository;

    public ProductoImp(BaseRepository<Producto, Integer> baseRepository) {
        super(baseRepository);
    }

}
