package com.brunix.gestionDeTurnosOdontologo.dao;

import com.brunix.gestionDeTurnosOdontologo.models.Dentist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends CrudRepository<Dentist, Long> {
}
