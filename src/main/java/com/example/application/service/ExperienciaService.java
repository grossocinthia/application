
package com.example.application.service;

import com.example.application.model.Experiencia;
import com.example.application.repository.CommonRepository;
import com.example.application.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService extends CommonServiceImpl <Experiencia, Long> implements IExperienciaService{

 @Autowired
    private ExperienciaRepository experienciarepository;
    
    public ExperienciaService(CommonRepository <Experiencia, Long> commonRepository){
        
    super(commonRepository);
    }
}
