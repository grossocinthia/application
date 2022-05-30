
package com.example.application.controller;

import com.example.application.model.Persona;
import com.example.application.service.PersonaService;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://appcinthiagrosso.web.app/")
@RequestMapping (path= "application/persona")
public class PersonaController extends CommonControllerImpl <Persona, PersonaService> {}
    