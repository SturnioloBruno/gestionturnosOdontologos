package com.brunix.gestionDeTurnosOdontologo.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CurrentTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime dateAndTime;
    private String duration;
    @ManyToOne
    @JoinColumn(name = "id_dentist", nullable = false)
    private Dentist assignedDentist;
    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient assignedPatient;
    private String additionalNotes;
}
