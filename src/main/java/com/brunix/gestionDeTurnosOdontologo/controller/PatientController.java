package com.brunix.gestionDeTurnosOdontologo.controller;

import com.brunix.gestionDeTurnosOdontologo.dto.PatientDto;
import com.brunix.gestionDeTurnosOdontologo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientService service;

    @PostMapping
    public ResponseEntity<?> createPatient(@RequestBody PatientDto patientDto) {
        service.create(patientDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PatientDto getPatient(@PathVariable Long id) {
        return service.getPatient(id);
    }

    @PutMapping
    public ResponseEntity<?> updatePatient(@RequestBody PatientDto patientDto){
        service.update(patientDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<PatientDto> getAllPatients() {
        return service.getAllPatients();
    }

}
