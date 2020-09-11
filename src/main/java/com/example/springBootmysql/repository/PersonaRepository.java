package com.example.springBootmysql.repository;

import com.example.springBootmysql.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * El Repository debe extender de la clase JpaRepository, la cual ya implementa el patron Repository
 */
public interface PersonaRepository extends JpaRepository<Persona,Integer> {


}