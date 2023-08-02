package com.veterinaria.patitas.prueba.Model;

import jakarta.persistence.Column;

public class VeterinarioComp {
    private String nombrePer;
    private String apePaterno;
    private String apeMaterno;
    private String cedula;

    public String getNombrePer() {
        return nombrePer;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
