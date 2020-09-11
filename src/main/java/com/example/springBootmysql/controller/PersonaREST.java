package com.example.springBootmysql.controller;

import com.example.springBootmysql.model.Persona;
import com.example.springBootmysql.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaREST {

    @Autowired
    PersonaRepository personaRepository;


    @GetMapping("/persona/todos")
    public List<Persona> todos(){
        return personaRepository.findAll();
    }

    @PostMapping("/persona/crear")
    public Persona crear(
            @Param("nombre") String nombre,
            @Param("paterno") String paterno
    ){
        Persona persona=new Persona();
        persona.setNombre(nombre);
        persona.setPaterno(paterno);
        personaRepository.save(persona);
        return persona;
    }
}
