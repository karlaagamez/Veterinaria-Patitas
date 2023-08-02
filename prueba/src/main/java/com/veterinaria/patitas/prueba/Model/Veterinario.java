package com.veterinaria.patitas.prueba.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "Veterinario")
public class Veterinario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String cedula;
    @Column
    private long idPersona;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public long getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }
}
