package com.backend_I.proyecto_final.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name="turnos")
public class Turno {

    @Id
    @SequenceGenerator(name="turno_sequence", sequenceName="turno_sequence")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator ="turno_sequence")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_odontologo")
    private Odontologo odontologo;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
    @Column
    private LocalDate fecha;
    @Column
    private LocalTime hora;

}
