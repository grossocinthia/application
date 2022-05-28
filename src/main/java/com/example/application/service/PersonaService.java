
package com.example.application.service;

import com.example.application.model.Persona;
import com.example.application.repository.CommonRepository;
import com.example.application.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends CommonServiceImpl <Persona, Long> implements IPersonaService{

    @Autowired
    private PersonaRepository persorepo;
    
    public PersonaService(CommonRepository <Persona, Long> commonRepository){
        
    super(commonRepository);
    }
}
    