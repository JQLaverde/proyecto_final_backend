package com.backend_I.proyecto_final.repository;

import com.backend_I.proyecto_final.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
}
