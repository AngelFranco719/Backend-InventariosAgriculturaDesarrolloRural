package com.servicio.inventarios.Modelos;

import jakarta.persistence.*;

@Entity(name = "zona_area")
public class Zona_Area {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_ZonaArea;
    @ManyToOne
    @JoinColumn(name = "ID_Zona")
    private Zona ID_Zona;
    @ManyToOne
    @JoinColumn(name = "ID_Area")
    private Area ID_Area;

    public Zona_Area() {
    }

    public Zona_Area(Zona ID_Zona, Area ID_Area) {
        this.ID_Zona = ID_Zona;
        this.ID_Area = ID_Area;
    }

    public Long getID_ZonaArea() {
        return ID_ZonaArea;
    }

    public void setID_ZonaArea(Long ID_ZonaArea) {
        this.ID_ZonaArea = ID_ZonaArea;
    }

    public Zona getID_Zona() {
        return ID_Zona;
    }

    public void setID_Zona(Zona ID_Zona) {
        this.ID_Zona = ID_Zona;
    }

    public Area getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Area ID_Area) {
        this.ID_Area = ID_Area;
    }

}
