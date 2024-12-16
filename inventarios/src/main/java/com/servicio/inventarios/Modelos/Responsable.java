package com.servicio.inventarios.Modelos;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name = "responsable")
public class Responsable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_Responsable;
    private String res_rfc;
    private String res_nombre;
    private Date res_fechaResguardo;
    private String res_motivoNoAsigno;

    public Responsable() {
    }

    public Responsable(String res_rfc, String res_nombre, Date res_fechaResguardo, String res_motivoNoAsigno) {
        this.res_rfc = res_rfc;
        this.res_nombre = res_nombre;
        this.res_fechaResguardo = res_fechaResguardo;
        this.res_motivoNoAsigno = res_motivoNoAsigno;
    }

    public Long getID_Responsable() {
        return ID_Responsable;
    }

    public void setID_Responsable(Long ID_Responsable) {
        this.ID_Responsable = ID_Responsable;
    }

    public String getRes_rfc() {
        return res_rfc;
    }

    public void setRes_rfc(String res_rfc) {
        this.res_rfc = res_rfc;
    }

    public String getRes_nombre() {
        return res_nombre;
    }

    public void setRes_nombre(String res_nombre) {
        this.res_nombre = res_nombre;
    }

    public Date getRes_fechaResguardo() {
        return res_fechaResguardo;
    }

    public void setRes_fechaResguardo(Date res_fechaResguardo) {
        this.res_fechaResguardo = res_fechaResguardo;
    }

    public String getRes_motivoNoAsigno() {
        return res_motivoNoAsigno;
    }

    public void setRes_motivoNoAsigno(String res_motivoNoAsigno) {
        this.res_motivoNoAsigno = res_motivoNoAsigno;
    }

}
