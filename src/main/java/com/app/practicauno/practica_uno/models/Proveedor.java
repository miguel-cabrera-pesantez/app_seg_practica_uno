package com.app.practicauno.practica_uno.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "proveedor")
@AllArgsConstructor
public class Proveedor implements Serializable, Actualizable<Proveedor> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer idProveedor;
    private String ruc;
    private String telefono;
    private String pais;
    private String correo;
    private String moneda;

    @JsonIgnore
    @OneToMany(mappedBy = "proveedor", fetch = FetchType.LAZY)
    private List<Producto> productos;

    @Override
    public void actualizarDatos(Proveedor entity) {
        if (entity.getRuc() != null) {
            this.setRuc(entity.getRuc());
        }
        if (entity.getTelefono() != null) {
            this.setTelefono(entity.getTelefono());
        }
        if (entity.getPais() != null) {
            this.setPais(entity.getPais());
        }
        if (entity.getCorreo() != null) {
            this.setCorreo(entity.getCorreo());
        }
        if (entity.getMoneda() != null) {
            this.setMoneda(entity.getMoneda());
        }
    }
}
