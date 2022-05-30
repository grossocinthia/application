
package com.example.application.controller;

import com.example.application.model.Escuela;
import com.example.application.service.EscuelaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://appcinthiagrosso.web.app/")
@RequestMapping (path= "application/escuela")
public class EscuelaController extends CommonControllerImpl <Escuela, EscuelaService> {
    
    
}