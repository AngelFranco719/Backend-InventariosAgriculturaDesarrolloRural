package com.servicio.inventarios.Modelos;

import jakarta.persistence.*;

@Entity(name = "bienes")
public class Bienes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_Bienes;
    private String bien_inventario;
    private String bien_estado;
    private String bien_color;
    private String bien_material;
    private String bien_patrimoniable;

    @ManyToOne
    @JoinColumn(name = "ID_Responsable")
    private Responsable ID_Responsable;
    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Producto ID_Producto;
    @ManyToOne
    @JoinColumn(name = "ID_Adquisicion")
    private Adquisicion ID_Adquisicion;
    @ManyToOne
    @JoinColumn(name = "ID_ZonaArea")
    private Zona_Area ID_ZonaArea;

    public Bienes() {
    }

    public Bienes(String bien_inventario, String bien_estado, String bien_color, String bien_material, String bien_patrimoniable, Responsable ID_Responsable, Producto ID_Producto, Adquisicion ID_Adquisicion, Zona_Area ID_ZonaArea) {
        this.bien_inventario = bien_inventario;
        this.bien_estado = bien_estado;
        this.bien_color = bien_color;
        this.bien_material = bien_material;
        this.bien_patrimoniable = bien_patrimoniable;
        this.ID_Responsable = ID_Responsable;
        this.ID_Producto = ID_Producto;
        this.ID_Adquisicion = ID_Adquisicion;
        this.ID_ZonaArea = ID_ZonaArea;
    }

    public Long getID_Bienes() {
        return ID_Bienes;
    }

    public void setID_Bienes(Long ID_Bienes) {
        this.ID_Bienes = ID_Bienes;
    }

    public String getBien_inventario() {
        return bien_inventario;
    }

    public void setBien_inventario(String bien_inventario) {
        this.bien_inventario = bien_inventario;
    }

    public String getBien_estado() {
        return bien_estado;
    }

    public void setBien_estado(String bien_estado) {
        this.bien_estado = bien_estado;
    }

    public String getBien_color() {
        return bien_color;
    }

    public void setBien_color(String bien_color) {
        this.bien_color = bien_color;
    }

    public String getBien_material() {
        return bien_material;
    }

    public void setBien_material(String bien_material) {
        this.bien_material = bien_material;
    }

    public String getBien_patrimoniable() {
        return bien_patrimoniable;
    }

    public void setBien_patrimoniable(String bien_patrimoniable) {
        this.bien_patrimoniable = bien_patrimoniable;
    }

    public Responsable getID_Responsable() {
        return ID_Responsable;
    }

    public void setID_Responsable(Responsable ID_Responsable) {
        this.ID_Responsable = ID_Responsable;
    }

    public Producto getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(Producto ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public Adquisicion getID_Adquisicion() {
        return ID_Adquisicion;
    }

    public void setID_Adquisicion(Adquisicion ID_Adquisicion) {
        this.ID_Adquisicion = ID_Adquisicion;
    }

    public Zona_Area getID_ZonaArea() {
        return ID_ZonaArea;
    }

    public void setID_ZonaArea(Zona_Area ID_ZonaArea) {
        this.ID_ZonaArea = ID_ZonaArea;
    }

}
