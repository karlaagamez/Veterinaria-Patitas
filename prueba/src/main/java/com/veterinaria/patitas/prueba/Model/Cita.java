package com.veterinaria.patitas.prueba.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long idPaciente;
    @Column
    private Date fecha;
    @Column
    private Long idVeterinario;

    public long getId() {
        return id;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public Long getIdVeterinario() {
        return idVeterinario;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setIdVeterinario(Long idVeterinario) {
        this.idVeterinario = idVeterinario;
    }
}
