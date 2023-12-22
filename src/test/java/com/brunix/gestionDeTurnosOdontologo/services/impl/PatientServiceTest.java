package com.brunix.gestionDeTurnosOdontologo.services.impl;

import com.brunix.gestionDeTurnosOdontologo.dto.PatientDto;
import com.brunix.gestionDeTurnosOdontologo.services.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceTest {

    @Autowired
    private PatientService patientService;
    @Test
    public void testCreatePatient() {
        PatientDto patientDto = new PatientDto();
        patientDto.setFirstName("Bruno");
        patientDto.setLastName("Sturniolo");
        patientDto.setPhone("2665039175");
        patientDto.setDateofbirth(LocalDate.of(1991, Month.NOVEMBER, 13));
        patientService.create(patientDto);

        PatientDto patientBruno = patientService.getPatient(1L);
        assertNotNull(patientBruno);
    }

}