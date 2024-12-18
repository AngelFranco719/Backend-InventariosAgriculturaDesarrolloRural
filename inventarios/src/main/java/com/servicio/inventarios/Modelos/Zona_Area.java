package com.servicio.inventarios.Modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Zona_Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_ZonaArea;
    @ManyToOne
    @JoinColumn(name = "ID_Zona")
    @JsonManagedReference
    private Zona zona;
    @ManyToOne
    @JoinColumn(name = "ID_Area")
    @JsonManagedReference
    private Area area;
    @OneToMany(mappedBy = "bien_zonaArea")
    @JsonManagedReference
    private List<Bienes> ID_Bien;

    public Zona_Area() {
    }

    public Zona_Area(Zona zona, Area area) {
        this.zona = zona;
        this.area = area;
    }

    public Long getID_ZonaArea() {
        return ID_ZonaArea;
    }

    public void setID_ZonaArea(Long ID_ZonaArea) {
        this.ID_ZonaArea = ID_ZonaArea;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Bienes> getID_Bien() {
        return ID_Bien;
    }

    public void setID_Bien(List<Bienes> ID_Bien) {
        this.ID_Bien = ID_Bien;
    }

}
