package com.servicio.inventarios.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "localizacion")
public class Localizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Localizacion;
    private String loc_domicilio;

    @OneToMany(mappedBy = "zon_loc")
    @JsonBackReference
    private List<Zona> loc_zon;

    public Localizacion() {
    }

    public Localizacion(String loc_domicilio) {
        this.loc_domicilio = loc_domicilio;
    }

    public Long getID_Localizacion() {
        return ID_Localizacion;
    }

    public void setID_Localizacion(Long ID_Localizacion) {
        this.ID_Localizacion = ID_Localizacion;
    }

    public String getLoc_domicilio() {
        return loc_domicilio;
    }

    public void setLoc_domicilio(String loc_domicilio) {
        this.loc_domicilio = loc_domicilio;
    }

    public List<Zona> getLoc_zon() {
        return loc_zon;
    }

    public void setLoc_zon(List<Zona> loc_zon) {
        this.loc_zon = loc_zon;
    }

}
