package com.app.practicauno.practica_uno.daos;

import com.app.practicauno.practica_uno.models.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Integer> {

}
