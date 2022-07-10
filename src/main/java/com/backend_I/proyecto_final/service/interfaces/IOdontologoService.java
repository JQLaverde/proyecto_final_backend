package com.backend_I.proyecto_final.service.interfaces;


import com.backend_I.proyecto_final.entities.Odontologo;

import java.util.List;
import java.util.Optional;

public interface IOdontologoService {

    List<Odontologo> listarOdontologos();
    Optional<Odontologo> buscarOdontologo(Long id);
    Odontologo agregarOdontologo(Odontologo odontologo);
    Odontologo modificarOdontologo(Odontologo odontologo);
    void eliminarOdontologo(Long id);

}
