package com.servicio.inventarios.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity(name = "bienes")
public class Bienes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Bien;
    private String bien_inventario;
    private String bien_serie;
    private String bien_estado;
    private String bien_color;
    private String bien_material;
    private String bien_patrimoniable;

    @ManyToOne
    @JoinColumn(name = "ID_Responsable")
    private Responsable bien_resp;
    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Producto bien_prod;
    @ManyToOne
    @JoinColumn(name = "ID_Adquisicion")
    private Adquisicion bien_adq;
    @ManyToOne
    @JoinColumn(name = "ID_ZonaArea")
    @JsonManagedReference
    private Zona_Area bien_zonaArea;

    public Bienes() {
    }

    public Bienes(String bien_inventario, String bien_estado, String bien_color, String bien_material, String bien_patrimoniable, Responsable ID_Responsable, Producto ID_Producto, Adquisicion ID_Adquisicion, Zona_Area ID_ZonaArea) {
        this.bien_inventario = bien_inventario;
        this.bien_estado = bien_estado;
        this.bien_color = bien_color;
        this.bien_material = bien_material;
        this.bien_patrimoniable = bien_patrimoniable;
        this.bien_resp = ID_Responsable;
        this.bien_prod = ID_Producto;
        this.bien_adq = ID_Adquisicion;
        this.bien_zonaArea = ID_ZonaArea;
    }

    public Long getID_Bien() {
        return ID_Bien;
    }

    public void setID_Bienes(Long ID_Bienes) {
        this.ID_Bien = ID_Bienes;
    }

    public String getBien_inventario() {
        return bien_inventario;
    }

    public void setBien_inventario(String bien_inventario) {
        this.bien_inventario = bien_inventario;
    }
    
    public String getBien_serie() {
        return bien_serie;
    }

    public void setBien_serie(String bien_serie) {
        this.bien_serie = bien_serie;
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

    public Responsable getBienResponsable() {
        return bien_resp;
    }

    public void setBienResponsable(Responsable bien_resp) {
        this.bien_resp = bien_resp;
    }

    public Producto getBienProducto() {
        return bien_prod;
    }

    public void setBien_Producto(Producto ID_Producto) {
        this.bien_prod = ID_Producto;
    }

    public Adquisicion getBienAdq() {
        return bien_adq;
    }

    public void setBienAdq(Adquisicion ID_Adquisicion) {
        this.bien_adq = ID_Adquisicion;
    }

    public Zona_Area getBien_zonaArea() {
        return bien_zonaArea;
    }

    public void setBien_zonaArea(Zona_Area ID_ZonaArea) {
        this.bien_zonaArea = ID_ZonaArea;
    }

}
