package com.brunix.gestionDeTurnosOdontologo.services;

import com.brunix.gestionDeTurnosOdontologo.dto.DentistDto;

import java.util.Set;

public interface DentistService {
    void create(DentistDto dentistDto);
    DentistDto getDentist(Long id);
    void update(DentistDto dentistDto);
    void delete(Long id);
    Set<DentistDto> getAllDentists();
}
