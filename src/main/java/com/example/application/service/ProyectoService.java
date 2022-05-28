
package com.example.application.service;

import com.example.application.model.Proyecto;
import com.example.application.repository.CommonRepository;
import com.example.application.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService extends CommonServiceImpl <Proyecto, Long> implements IProyectoService {

 @Autowired
    private ProyectoRepository proyerepo;
    
    public ProyectoService(CommonRepository <Proyecto, Long> commonRepository){
        
    super(commonRepository);
    }
}