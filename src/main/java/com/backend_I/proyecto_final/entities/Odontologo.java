package com.backend_I.proyecto_final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="odontologos")
public class Odontologo {

    @Id
    @SequenceGenerator(name="odontologo_sequence", sequenceName="odontologo_sequence")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="odontologo_sequence")
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Integer matricula;

}
