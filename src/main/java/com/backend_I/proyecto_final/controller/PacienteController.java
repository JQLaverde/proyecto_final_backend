package com.backend_I.proyecto_final.controller;

import com.backend_I.proyecto_final.entities.Paciente;
import com.backend_I.proyecto_final.service.interfaces.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes(){
        return ResponseEntity.ok(pacienteService.listarPacientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPaciente(@PathVariable("id") Long id){

        Optional<Paciente> pacienteBuscado = pacienteService.buscarPaciente(id);

        if (pacienteBuscado.isPresent()) {
            return ResponseEntity.ok(pacienteBuscado.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Paciente> agregarPaciente(@RequestBody Paciente paciente){
        return ResponseEntity.ok(pacienteService.agregarPaciente(paciente));
    }

    @PutMapping
    public ResponseEntity<Paciente> modificarPaciente(@RequestBody Paciente paciente) {
        Optional<Paciente> pacienteParaActualizar = pacienteService.buscarPaciente(paciente.getId());

        if (pacienteParaActualizar.isPresent()){
            return ResponseEntity.ok(pacienteService.modificarPaciente(paciente));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable("id") Long id) {
        Optional<Paciente> pacienteAEliminar = pacienteService.buscarPaciente(id);

        if (pacienteAEliminar.isPresent()) {
            pacienteService.eliminarPaciente(id);
            return ResponseEntity.ok("Se eliminó al paciente con ID = " + id);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
