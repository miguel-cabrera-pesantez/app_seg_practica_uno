package com.app.practicauno.practica_uno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.practicauno.practica_uno.daos.BaseRepository;
import com.app.practicauno.practica_uno.daos.UsuarioRepository;
import com.app.practicauno.practica_uno.models.Usuario;

@Service
public class UsuarioImp extends BaseServiceImpl<Usuario, Integer> implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioImp(BaseRepository<Usuario, Integer> baseRepository) {
        super(baseRepository);
    }

}
