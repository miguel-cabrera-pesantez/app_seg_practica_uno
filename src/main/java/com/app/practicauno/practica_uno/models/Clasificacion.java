package com.app.practicauno.practica_uno.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "clasificacion")
@AllArgsConstructor
public class Clasificacion implements Serializable, Actualizable<Clasificacion> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clasificacion")
    private Integer idClasificacion;
    private String grupo;

    @JsonIgnore
    @OneToMany(mappedBy = "clasificacion", fetch = FetchType.LAZY)
    private List<Producto> productos;

    @Override
    public void actualizarDatos(Clasificacion entity) {
        if (entity.getGrupo() != null) {
            this.setGrupo(entity.getGrupo());
        }
    }
}
