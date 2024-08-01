package com.app.practicauno.practica_uno.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Data
@Table(name = "factura")
@AllArgsConstructor
public class Factura implements Serializable, Actualizable<Factura> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer idFactura;
    private String ruc;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    private Double descuento;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", referencedColumnName = "id_tipo_pago")
    private TipoPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;

    @Override
    public void actualizarDatos(Factura entity) {
        if (entity.getRuc() != null) {
            this.setRuc(entity.getRuc());
        }
        if (entity.getFecha() != null) {
            this.setFecha(entity.getFecha());
        }
        if (entity.getDescuento() != null) {
            this.setDescuento(entity.getDescuento());
        }
        if (entity.getTotal() != null) {
            this.setTotal(entity.getTotal());
        }
    }
}