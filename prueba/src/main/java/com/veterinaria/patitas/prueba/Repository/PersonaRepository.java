package com.veterinaria.patitas.prueba.Repository;

import com.veterinaria.patitas.prueba.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
