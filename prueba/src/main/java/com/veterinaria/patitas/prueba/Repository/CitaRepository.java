package com.veterinaria.patitas.prueba.Repository;

import com.veterinaria.patitas.prueba.Model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita,Long> {
}
