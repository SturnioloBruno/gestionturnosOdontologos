package com.brunix.gestionDeTurnosOdontologo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Dentist {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String speciality;
    private String licenseNumber;
    private String phone;
    @OneToMany(mappedBy = "assignedDentist")
    @JsonIgnore
    private Set<Appointment> appointments;

}
