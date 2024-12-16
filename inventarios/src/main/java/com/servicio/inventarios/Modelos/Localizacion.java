package com.servicio.inventarios.Modelos;

import jakarta.persistence.*;

@Entity(name = "localizacion")
public class Localizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_Localizacion;
    private String loc_domicilio;

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

}
