package com.veterinaria.patitas.prueba.Repository;

import com.veterinaria.patitas.prueba.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}
