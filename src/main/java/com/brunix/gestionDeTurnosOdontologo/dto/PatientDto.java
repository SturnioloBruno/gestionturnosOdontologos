package com.brunix.gestionDeTurnosOdontologo.dto;

import com.brunix.gestionDeTurnosOdontologo.models.Appointment;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class PatientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateofbirth;
    private String phone;
}
