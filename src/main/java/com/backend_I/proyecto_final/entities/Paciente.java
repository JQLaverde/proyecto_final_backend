package com.backend_I.proyecto_final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @SequenceGenerator(name="paciente_sequence", sequenceName="paciente_sequence")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paciente_sequence")
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Integer dni;
    @Column
    private LocalDate fechaIngreso;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_direccion", referencedColumnName="id")
    private Domicilio domicilio;
}
