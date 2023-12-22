package com.brunix.gestionDeTurnosOdontologo.models;

import lombok.Data;

import java.util.Set;

@Data
public class Dentist {
    private Long id;
    private String firstName;
    private String lastName;
    private String speciality;
    private String licenseNumber;
    private String phone;
    private Set<Appointment> appointments;

}
