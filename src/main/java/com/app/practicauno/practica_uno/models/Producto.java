package com.app.practicauno.practica_uno.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
@AllArgsConstructor
public class Producto implements Serializable, Actualizable<Producto> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    private Integer stock;
    private Double precioUnitario;
    private String unidad;
    private Boolean iva;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "id_clasificacion", referencedColumnName = "id_clasificacion")
    private Clasificacion clasificacion;

    @JsonIgnore
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
    private List<ItemFactura> itemFacturas;

    @Override
    public void actualizarDatos(Producto entity) {
        if (entity.getStock() != null) {
            this.setStock(entity.getStock());
        }
        if (entity.getPrecioUnitario() != null) {
            this.setPrecioUnitario(entity.getPrecioUnitario());
        }
        if (entity.getUnidad() != null) {
            this.setUnidad(entity.getUnidad());
        }
        if (entity.getIva() != null) {
            this.setIva(entity.getIva());
        }
    }
}
