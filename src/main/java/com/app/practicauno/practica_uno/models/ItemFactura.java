package com.app.practicauno.practica_uno.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "item_factura")
@AllArgsConstructor
public class ItemFactura implements Serializable, Actualizable<ItemFactura> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_factura")
    private Integer idItemFactura;
    private Integer cantidad;
    private Double precio;
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    private Factura factura;

    @Override
    public void actualizarDatos(ItemFactura entity) {
        if (entity.getCantidad() != null) {
            this.setCantidad(entity.getCantidad());
        }
        if (entity.getPrecio() != null) {
            this.setPrecio(entity.getPrecio());
        }
        if (entity.getSubtotal() != null) {
            this.setSubtotal(entity.getSubtotal());
        }
    }

    // TODO: relacion producto,factura
}
