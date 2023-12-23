package com.brunix.gestionDeTurnosOdontologo.controller;


import com.brunix.gestionDeTurnosOdontologo.dto.DentistDto;
import com.brunix.gestionDeTurnosOdontologo.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/dentists")
public class DentistController {

    @Autowired
    private DentistService service;

    @PostMapping
    public ResponseEntity<?> createDentist(@RequestBody DentistDto dentistDto) {
        service.create(dentistDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public DentistDto getDentist(@PathVariable Long id) {
        return service.getDentist(id);
    }

    @PutMapping
    public ResponseEntity<?> updateDentist(@RequestBody DentistDto dentistDto) {
        service.update(dentistDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDentist(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<DentistDto> getAllDentists() {
        return service.getAllDentists();
    }
}
