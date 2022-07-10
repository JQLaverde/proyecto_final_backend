package com.backend_I.proyecto_final.service.implements_int;

import com.backend_I.proyecto_final.entities.Paciente;
import com.backend_I.proyecto_final.repository.IPacienteRepository;
import com.backend_I.proyecto_final.service.interfaces.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> buscarPaciente(Long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public Paciente agregarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente modificarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
}
