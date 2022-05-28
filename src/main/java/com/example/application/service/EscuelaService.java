
package com.example.application.service;

import com.example.application.model.Escuela;
import com.example.application.repository.CommonRepository;
import com.example.application.repository.EscuelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscuelaService extends CommonServiceImpl <Escuela, Long> implements IEscuelaService {

 @Autowired
    private EscuelaRepository escurepo;
    
    public EscuelaService(CommonRepository <Escuela, Long> commonRepository){
        
    super(commonRepository);
    }
    
}