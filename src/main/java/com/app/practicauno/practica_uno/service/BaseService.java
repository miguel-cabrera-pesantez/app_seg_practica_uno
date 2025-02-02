package com.app.practicauno.practica_uno.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID extends Serializable> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T entity);

    void deleteById(ID id);

    T update(T t, ID id);

    List<T> saveAll(List<T> detalles);

}
