package com.veterinaria.patitas.prueba.Model;

import jakarta.persistence.Column;

import java.util.Date;

public class PacienteComp {
    private String nombre;
    private String especie;
    private Date fechaNacimiento;
    private long telefono;
    private String nombrePer;
    private String apePaterno;
    private String apeMaterno;

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
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
}
