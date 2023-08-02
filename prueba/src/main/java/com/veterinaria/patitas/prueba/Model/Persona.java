package com.veterinaria.patitas.prueba.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombrePer;
    @Column
    private String apePaterno;
    @Column
    private String apeMaterno;

    public String getNombrePer(){
        return nombrePer;
    }
    public void setNombrePer(String nombrePer){
        this.nombrePer = nombrePer;
    }
    public String getApeMaterno(){
        return apeMaterno;
    }
    public void setApeMaterno(String apeMaterno){
        this.apeMaterno = apeMaterno;
    }
    public String getApePaterno(){
        return apePaterno;
    }
    public void setApePaterno(String apePaterno){
        this.apePaterno = apePaterno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
