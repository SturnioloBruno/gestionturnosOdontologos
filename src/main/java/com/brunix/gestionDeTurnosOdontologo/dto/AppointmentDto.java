package com.brunix.gestionDeTurnosOdontologo.dto;

import com.brunix.gestionDeTurnosOdontologo.models.Dentist;
import com.brunix.gestionDeTurnosOdontologo.models.Patient;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentDto {
    private Long id;
    private LocalDateTime dateAndTime;
    private String duration;
    private Dentist assignedDentist;
    private Patient assignedPatient;
    private String additionalNotes;
}
