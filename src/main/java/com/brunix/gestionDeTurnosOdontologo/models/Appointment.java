package com.brunix.gestionDeTurnosOdontologo.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Appointment {
    private Long id;
    private LocalDateTime dateAndTime;
    private String duration;
    private Dentist assignedDentist;
    private Patient assignedPatient;
    private String additionalNotes;
}
