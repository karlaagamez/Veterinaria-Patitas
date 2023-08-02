package com.veterinaria.patitas.prueba.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private String especie;
    @Column
    private Date fechaNacimiento;
    @Column
    private long telefono;
    @Column
    private long idPersona;

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(long id) {
        this.id = id;
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
    public long getTelefono() {
        return telefono;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }
}
