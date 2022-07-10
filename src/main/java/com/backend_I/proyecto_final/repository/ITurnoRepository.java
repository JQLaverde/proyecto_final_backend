package com.backend_I.proyecto_final.repository;

import com.backend_I.proyecto_final.entities.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITurnoRepository extends JpaRepository<Turno, Long> {
}
