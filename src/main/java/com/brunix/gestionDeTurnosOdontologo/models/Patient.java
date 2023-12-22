package com.brunix.gestionDeTurnosOdontologo.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class Patient {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateofbirth;
    private String phone;
    private Set<Appointment> appointments;
}
