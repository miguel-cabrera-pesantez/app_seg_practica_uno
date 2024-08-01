package com.app.practicauno.practica_uno.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@Table(name = "tipo_pago")
@AllArgsConstructor
public class TipoPago implements Serializable, Actualizable<TipoPago> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_pago")
    private Integer idTipoPago;
    private String tipo;
    private String descrip;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoPago", fetch = FetchType.LAZY)
    private List<Factura> facturas;

    @Override
    public void actualizarDatos(TipoPago entity) {
        if (entity.getTipo() != null) {
            this.setTipo(entity.getTipo());
        }
        if (entity.getDescrip() != null) {
            this.setDescrip(entity.getDescrip());
        }
    }
}
