
package com.example.application.controller;

import com.example.application.model.Experiencia;
import com.example.application.service.ExperienciaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @CrossOrigin(origins = "https://appcinthiagrosso.web.app/")
@RequestMapping (path= "application/experiencia")
public class ExperienciaController extends CommonControllerImpl <Experiencia, ExperienciaService> {
    
}
