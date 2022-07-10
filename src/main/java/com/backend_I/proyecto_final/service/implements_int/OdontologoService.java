package com.backend_I.proyecto_final.service.implements_int;

import com.backend_I.proyecto_final.entities.Odontologo;
import com.backend_I.proyecto_final.repository.IOdontologoRepository;
import com.backend_I.proyecto_final.service.interfaces.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService implements IOdontologoService {


    @Autowired
    IOdontologoRepository odontologoRepository;

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologoRepository.findAll();
    }

    @Override
    public Optional<Odontologo> buscarOdontologo(Long id) {
        return odontologoRepository.findById(id);
    }

    @Override
    public Odontologo agregarOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public Odontologo modificarOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);
    }
}
