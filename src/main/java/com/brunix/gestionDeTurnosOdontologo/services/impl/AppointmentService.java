package com.brunix.gestionDeTurnosOdontologo.services.impl;

import com.brunix.gestionDeTurnosOdontologo.dao.AppointmentRepository;
import com.brunix.gestionDeTurnosOdontologo.dao.DentistRepository;
import com.brunix.gestionDeTurnosOdontologo.dto.AppointmentDto;
import com.brunix.gestionDeTurnosOdontologo.dto.DentistDto;
import com.brunix.gestionDeTurnosOdontologo.models.Appointment;
import com.brunix.gestionDeTurnosOdontologo.models.Dentist;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AppointmentService implements com.brunix.gestionDeTurnosOdontologo.services.AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    @Autowired
    ObjectMapper mapper;

    private void saveAppointment(AppointmentDto appointmentDto) {
        Appointment appointment = mapper.convertValue(appointmentDto, Appointment.class);
        repository.save(appointment);
    }

    @Override
    public void create(AppointmentDto appointmentDto) {
        saveAppointment(appointmentDto);
    }

    @Override
    public AppointmentDto getAppointment(Long id) {
        Appointment appointment = repository.findById(id).orElseThrow();
        return mapper.convertValue(appointment, AppointmentDto.class);
    }

    @Override
    public void update(AppointmentDto appointmentDto) {
        saveAppointment(appointmentDto);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Set<AppointmentDto> getAllAppointments() {
        Iterable<Appointment> appointments = repository.findAll();
        Set<AppointmentDto> appointmentDtos = new HashSet<>();

        for (Appointment appointment: appointments) {
            appointmentDtos.add(mapper.convertValue(appointment, AppointmentDto.class));
        }

        return appointmentDtos;
    }
}
