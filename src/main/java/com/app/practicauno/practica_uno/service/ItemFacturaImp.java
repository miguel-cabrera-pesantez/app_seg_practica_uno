package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.ItemFacturaRepository;
import com.app.practicauno.practica_uno.models.ItemFactura;

@Service
public class ItemFacturaImp extends BaseServiceImpl<ItemFactura, Integer> implements ItemFacturaService {

    @Autowired
    private ItemFacturaRepository repository;

    public ItemFacturaImp(BaseRepository<ItemFactura, Integer> baseRepository) {
        super(baseRepository);
    }

}
