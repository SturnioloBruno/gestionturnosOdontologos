package com.brunix.gestionDeTurnosOdontologo.dto;

import lombok.Data;

@Data
public class DentistDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String speciality;
    private String licenseNumber;
    private String phone;
}
