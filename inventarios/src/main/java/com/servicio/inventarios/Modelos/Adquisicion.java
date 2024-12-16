package com.servicio.inventarios.Modelos;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name = "adquisicion")
public class Adquisicion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_Adquisicion; 
    private String adq_folioFiscal; 
    private Date adq_fecha; 
    private String adq_claveArmonizada; 
    private String adq_factura; 
    
    public void Adquisicion(){
    }

    public Adquisicion(String adq_folioFiscal, Date adq_fecha, String adq_claveArmonizada, String adq_factura) {
        this.adq_folioFiscal = adq_folioFiscal;
        this.adq_fecha = adq_fecha;
        this.adq_claveArmonizada = adq_claveArmonizada;
        this.adq_factura = adq_factura;
    }

    public Long getID_Adquisicion() {
        return ID_Adquisicion;
    }

    public void setID_Adquisicion(Long ID_Adquisicion) {
        this.ID_Adquisicion = ID_Adquisicion;
    }

    public String getAdq_folioFiscal() {
        return adq_folioFiscal;
    }

    public void setAdq_folioFiscal(String adq_folioFiscal) {
        this.adq_folioFiscal = adq_folioFiscal;
    }

    public Date getAdq_fecha() {
        return adq_fecha;
    }

    public void setAdq_fecha(Date adq_fecha) {
        this.adq_fecha = adq_fecha;
    }

    public String getAdq_claveArmonizada() {
        return adq_claveArmonizada;
    }

    public void setAdq_claveArmonizada(String adq_claveArmonizada) {
        this.adq_claveArmonizada = adq_claveArmonizada;
    }

    public String getAdq_factura() {
        return adq_factura;
    }

    public void setAdq_factura(String adq_factura) {
        this.adq_factura = adq_factura;
    }
    
}
