package com.brunix.gestionDeTurnosOdontologo.controller;

import com.brunix.gestionDeTurnosOdontologo.dto.AppointmentDto;
import com.brunix.gestionDeTurnosOdontologo.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping
    public ResponseEntity<?> createAppointment(@RequestBody AppointmentDto appointmentDto) {
        service.create(appointmentDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public AppointmentDto getAppointment(@PathVariable Long id) {
        return service.getAppointment(id);
    }

    @PutMapping
    public ResponseEntity<?> updateAppointment(@RequestBody AppointmentDto appointmentDto) {
        service.update(appointmentDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<AppointmentDto> getAllAppointments() {
        return service.getAllAppointments();
    }

}
