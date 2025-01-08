package com.servicio.inventarios.Modelos;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCTO")
    private Long ID_Producto;
    private String prod_partida;
    private String prod_descripcion;
    private String prod_marca;
    private String prod_modelo;
    private float prod_monto;

    @OneToMany(mappedBy = "bien_prod")
    private List<Bienes> prod_bien;

    public Producto() {
    }

    public Producto(String prod_partida, String prod_descripcion, String prod_marca, String prod_modelo, float prod_monto) {
        this.prod_partida = prod_partida;
        this.prod_descripcion = prod_descripcion;
        this.prod_marca = prod_marca;
        this.prod_modelo = prod_modelo;
        this.prod_monto = prod_monto;
    }

    public Long getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(Long ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getProd_partida() {
        return prod_partida;
    }

    public void setProd_partida(String prod_partida) {
        this.prod_partida = prod_partida;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public String getProd_marca() {
        return prod_marca;
    }

    public void setProd_marca(String prod_marca) {
        this.prod_marca = prod_marca;
    }

    public String getProd_modelo() {
        return prod_modelo;
    }

    public void setProd_modelo(String prod_modelo) {
        this.prod_modelo = prod_modelo;
    }

    public float getProd_monto() {
        return prod_monto;
    }

    public void setProd_monto(float prod_monto) {
        this.prod_monto = prod_monto;
    }

}
