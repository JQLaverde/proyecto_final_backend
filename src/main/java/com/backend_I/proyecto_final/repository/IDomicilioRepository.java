package com.backend_I.proyecto_final.repository;

import com.backend_I.proyecto_final.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDomicilioRepository extends JpaRepository<Domicilio, Long> {
}
