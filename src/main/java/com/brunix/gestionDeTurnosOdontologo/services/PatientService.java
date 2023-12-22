package com.brunix.gestionDeTurnosOdontologo.services;

import com.brunix.gestionDeTurnosOdontologo.dto.PatientDto;

import java.util.Set;

public interface PatientService {
    void create(PatientDto patientDto);
    PatientDto getPatient(Long id);
    void update(PatientDto patientDto);
    void delete(Long id);
    Set<PatientDto> getAllPatients();
}
