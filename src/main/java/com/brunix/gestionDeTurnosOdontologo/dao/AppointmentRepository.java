package com.brunix.gestionDeTurnosOdontologo.dao;

import com.brunix.gestionDeTurnosOdontologo.models.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
