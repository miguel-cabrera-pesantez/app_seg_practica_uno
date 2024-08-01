package com.app.practicauno.practica_uno.models;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "rol")
@AllArgsConstructor
public class Rol implements Serializable, Actualizable<Rol> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    private String rol;
    private Boolean estado;

    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;

    @ManyToMany
    @JoinTable(name = "rol_compentecia", joinColumns = @JoinColumn(name = "id_rol"), inverseJoinColumns = @JoinColumn(name = "id_competencia"))
    private Set<Competencia> competencias;

    @Override
    public void actualizarDatos(Rol entity) {
        if (entity.getRol() != null) {
            this.setRol(entity.getRol());
        }
        if (entity.getEstado() != null) {
            this.setEstado(entity.getEstado());
        }
    }

}
