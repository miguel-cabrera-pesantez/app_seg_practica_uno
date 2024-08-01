package com.app.practicauno.practica_uno.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Data
@Table(name = "usuario")
@AllArgsConstructor
public class Usuario implements Serializable, Actualizable<Usuario> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "usuario", unique = true)
    private String user;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;

    @ManyToMany
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
    private Set<Rol> roles;

    @Override
    public void actualizarDatos(Usuario entity) {
        if (entity.getUser() != null) {
            this.setUser(entity.getUser());
        }
        if (entity.getPassword() != null) {
            this.setPassword(entity.getPassword());
        }
    }
}
