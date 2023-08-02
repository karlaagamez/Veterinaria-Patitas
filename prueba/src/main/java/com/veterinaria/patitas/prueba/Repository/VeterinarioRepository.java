package com.veterinaria.patitas.prueba.Repository;

import com.veterinaria.patitas.prueba.Model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario,Long> {
}
