package com.backend_I.proyecto_final.controller;

import com.backend_I.proyecto_final.entities.Odontologo;
import com.backend_I.proyecto_final.service.interfaces.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {


    @Autowired
    private IOdontologoService odontologoService;

    @GetMapping
    public ResponseEntity<List<Odontologo>> listarOdontologos(){
        return ResponseEntity.ok(odontologoService.listarOdontologos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscarOdontologo(@PathVariable("id") Long id){

        Optional<Odontologo> odontologoBuscado = odontologoService.buscarOdontologo(id);

        if (odontologoBuscado.isPresent()) {
            return ResponseEntity.ok(odontologoBuscado.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Odontologo> agregarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.agregarOdontologo(odontologo));
    }

    @PutMapping
    public ResponseEntity<Odontologo> modificarOdontologo(@RequestBody Odontologo odontologo) {
        Optional<Odontologo> odontologoParaActualizar = odontologoService.buscarOdontologo(odontologo.getId());

        if (odontologoParaActualizar.isPresent()){
            return ResponseEntity.ok(odontologoService.modificarOdontologo(odontologo));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable("id") Long id) {
        Optional<Odontologo> odontologoAEliminar = odontologoService.buscarOdontologo(id);

        if (odontologoAEliminar.isPresent()) {
            odontologoService.eliminarOdontologo(id);
            return ResponseEntity.ok("Se eliminó al odontologo con ID = " + id);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
