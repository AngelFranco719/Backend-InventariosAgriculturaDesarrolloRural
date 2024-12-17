package com.servicio.inventarios.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Zona;
    private String zon_nivel;
    private String zon_local;
    @ManyToOne
    @JoinColumn(name = "ID_Localizacion")
    @JsonManagedReference
    private Localizacion zon_loc;
    @OneToMany(mappedBy = "zona")
    @JsonBackReference
    private List<Zona_Area> zonaArea;

    public Zona() {
    }

    public Zona(String zon_nivel, String zon_local, Localizacion zon_loc) {
        this.zon_nivel = zon_nivel;
        this.zon_local = zon_local;
        this.zon_loc = zon_loc;
    }

    public Long getID_Zona() {
        return ID_Zona;
    }

    public void setID_Zona(Long ID_Zona) {
        this.ID_Zona = ID_Zona;
    }

    public String getZon_nivel() {
        return zon_nivel;
    }

    public void setZon_nivel(String zon_nivel) {
        this.zon_nivel = zon_nivel;
    }

    public String getZon_local() {
        return zon_local;
    }

    public void setZon_local(String zon_local) {
        this.zon_local = zon_local;
    }

    public Localizacion getZon_loc() {
        return zon_loc;
    }

    public void setZon_loc(Localizacion zon_loc) {
        this.zon_loc = zon_loc;
    }

    public List<Zona_Area> getZonaArea() {
        return zonaArea;
    }

    public void setZonaArea(List<Zona_Area> zonaArea) {
        this.zonaArea = zonaArea;
    }

}
