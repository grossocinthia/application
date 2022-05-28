
package com.example.application.controller;

import com.example.application.model.Skill;
import com.example.application.service.SkillService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (path= "application/skill")
public class SkillController extends CommonControllerImpl <Skill, SkillService>{
    
}