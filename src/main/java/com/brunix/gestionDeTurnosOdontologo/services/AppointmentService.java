package com.brunix.gestionDeTurnosOdontologo.services;

import com.brunix.gestionDeTurnosOdontologo.dto.AppointmentDto;
import com.brunix.gestionDeTurnosOdontologo.dto.DentistDto;

import java.util.Set;

public interface AppointmentService {
    void create(AppointmentDto appointmentDto);
    AppointmentDto getAppointment(Long id);
    void update(AppointmentDto appointmentDto);
    void delete(Long id);
    Set<AppointmentDto> getAllAppointments();
}
