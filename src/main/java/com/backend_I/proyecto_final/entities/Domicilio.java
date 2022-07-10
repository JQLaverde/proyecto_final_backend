package com.backend_I.proyecto_final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="domicilios")
public class Domicilio {

    @Id
    @SequenceGenerator(name="domicilio_sequence", sequenceName="domicilio_sequence")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="domicilio_sequence")
    private Long id;
    @Column
    private String calle;
    @Column
    private Integer numero;
    @Column
    private String localidad;
    @Column
    private String provincia;

}
