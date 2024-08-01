package com.app.practicauno.practica_uno.models;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "competencia")
@AllArgsConstructor

public class Competencia implements Serializable, Actualizable<Competencia> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competencia")
    private Integer idCompetencias;
    private String nombre;
    private String descripcion;

    @ManyToMany(mappedBy = "competencias")
    private Set<Rol> roles;

    @Override
    public void actualizarDatos(Competencia entity) {
        if (entity.getNombre() != null) {
            this.setNombre(entity.getNombre());
        }
        if (entity.getDescripcion() != null) {
            this.setDescripcion(entity.getDescripcion());
        }
    }
}
