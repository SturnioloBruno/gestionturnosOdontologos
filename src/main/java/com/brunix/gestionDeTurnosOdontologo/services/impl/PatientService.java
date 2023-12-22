package com.brunix.gestionDeTurnosOdontologo.services.impl;

import com.brunix.gestionDeTurnosOdontologo.dao.PatientRepository;
import com.brunix.gestionDeTurnosOdontologo.dto.PatientDto;
import com.brunix.gestionDeTurnosOdontologo.models.Patient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientService implements com.brunix.gestionDeTurnosOdontologo.services.PatientService {
    @Autowired
    private PatientRepository repository;

    @Autowired
    ObjectMapper mapper;

    private void savePatient(PatientDto patientDto) {
        Patient patient = mapper.convertValue(patientDto, Patient.class);
        repository.save(patient);
    }

    @Override
    public void create(PatientDto patientDto) {
        savePatient(patientDto);
    }

    @Override
    public PatientDto getPatient(Long id) {
        Patient patient = repository.findById(id).orElseThrow();
        return mapper.convertValue(patient, PatientDto.class);
    }

    @Override
    public void update(PatientDto patientDto) {
        savePatient(patientDto);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Set<PatientDto> getAllPatients() {
        Iterable<Patient> patients = repository.findAll();
        Set<PatientDto> patientDtos = new HashSet<>();

        for ( Patient patient: patients) {
            patientDtos.add(mapper.convertValue(patient, PatientDto.class));
        }

        return patientDtos;
    }
}
