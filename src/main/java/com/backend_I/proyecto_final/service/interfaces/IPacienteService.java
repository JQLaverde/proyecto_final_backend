package com.backend_I.proyecto_final.service.interfaces;

import com.backend_I.proyecto_final.entities.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {

    List<Paciente> listarPacientes();
    Optional<Paciente> buscarPaciente(Long id);
    Paciente agregarPaciente(Paciente paciente);
    Paciente modificarPaciente(Paciente paciente);
    void eliminarPaciente(Long id);

}
