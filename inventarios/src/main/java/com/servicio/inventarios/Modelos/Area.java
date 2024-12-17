package com.servicio.inventarios.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Area;
    private String are_unidadResponsable;
    private String are_unidadPresupuestal;

    @OneToMany(mappedBy = "area")
    @JsonBackReference
    private List<Zona_Area> zonaArea;

    public Area() {
    }

    public Area(String are_unidadResponsable, String are_unidadPresupuestal) {
        this.are_unidadResponsable = are_unidadResponsable;
        this.are_unidadPresupuestal = are_unidadPresupuestal;
    }

    public Long getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Long ID_Area) {
        this.ID_Area = ID_Area;
    }

    public String getAre_unidadResponsable() {
        return are_unidadResponsable;
    }

    public void setAre_unidadResponsable(String are_unidadResponsable) {
        this.are_unidadResponsable = are_unidadResponsable;
    }

    public String getAre_unidadPresupuestal() {
        return are_unidadPresupuestal;
    }

    public void setAre_unidadPresupuestal(String are_unidadPresupuestal) {
        this.are_unidadPresupuestal = are_unidadPresupuestal;
    }

    public List<Zona_Area> getZonaArea() {
        return zonaArea;
    }

    public void setZonaArea(List<Zona_Area> zonaArea) {
        this.zonaArea = zonaArea;
    }

}
