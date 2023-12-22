package com.brunix.gestionDeTurnosOdontologo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateofbirth;
    private String phone;
    @OneToMany(mappedBy = "assignedPatient")
    @JsonIgnore
    private Set<Appointment> appointments;
}
