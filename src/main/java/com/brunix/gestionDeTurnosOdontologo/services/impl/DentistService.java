package com.brunix.gestionDeTurnosOdontologo.services.impl;

import com.brunix.gestionDeTurnosOdontologo.dao.DentistRepository;
import com.brunix.gestionDeTurnosOdontologo.dao.PatientRepository;
import com.brunix.gestionDeTurnosOdontologo.dto.DentistDto;
import com.brunix.gestionDeTurnosOdontologo.dto.PatientDto;
import com.brunix.gestionDeTurnosOdontologo.models.Dentist;
import com.brunix.gestionDeTurnosOdontologo.models.Patient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DentistService implements com.brunix.gestionDeTurnosOdontologo.services.DentistService {

    @Autowired
    private DentistRepository repository;

    @Autowired
    ObjectMapper mapper;

    private void saveDentist(DentistDto dentistDto) {
        Dentist dentist = mapper.convertValue(dentistDto, Dentist.class);
        repository.save(dentist);
    }
    @Override
    public void create(DentistDto dentistDto) {
        saveDentist(dentistDto);
    }

    @Override
    public DentistDto getDentist(Long id) {
        Dentist dentist = repository.findById(id).orElseThrow();
        return mapper.convertValue(dentist, DentistDto.class);
    }

    @Override
    public void update(DentistDto dentistDto) {
        saveDentist(dentistDto);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Set<DentistDto> getAllDentists() {
        Iterable<Dentist> dentists = repository.findAll();
        Set<DentistDto> dentistDtos = new HashSet<>();

        for ( Dentist dentist: dentists) {
            dentistDtos.add(mapper.convertValue(dentist, DentistDto.class));
        }

        return dentistDtos;
    }
}
