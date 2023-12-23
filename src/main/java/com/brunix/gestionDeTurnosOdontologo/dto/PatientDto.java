package com.brunix.gestionDeTurnosOdontologo.dto;

import com.brunix.gestionDeTurnosOdontologo.models.Appointment;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class PatientDto {
    private Long id;
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateofbirth;
    private String phone;
}
