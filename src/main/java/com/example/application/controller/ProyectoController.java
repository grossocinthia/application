
package com.example.application.controller;

import com.example.application.model.Proyecto;
import com.example.application.service.ProyectoService;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @CrossOrigin(origins = "*")
@RequestMapping (path= "application/proyecto")
   
public class ProyectoController extends CommonControllerImpl <Proyecto, ProyectoService> {
    
}