package com.app.practicauno.practica_uno.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@Table(name = "persona")
@AllArgsConstructor
public class Persona implements Serializable, Actualizable<Persona> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String dni;
    private String celular;
    private String correo;

    @JsonIgnore
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<Factura> facturas;

    @JsonIgnore
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<Usuario> usuarios;

    @Override
    public void actualizarDatos(Persona entity) {
        if (entity.getDni() != null) {
            this.setDni(entity.getDni());
        }
        if (entity.getNombre() != null) {
            this.setNombre(entity.getNombre());
        }
        if (entity.getApellido() != null) {
            this.setApellido(entity.getApellido());
        }
        if (entity.getCelular() != null) {
            this.setCelular(entity.getCelular());
        }
        if (entity.getCorreo() != null) {
            this.setCorreo(entity.getCorreo());
        }
    }
}
