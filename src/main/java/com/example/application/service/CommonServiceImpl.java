
package com.example.application.service;

import com.example.application.model.Common;
import com.example.application.repository.CommonRepository;
import java.io.Serializable;
import java.util.List;


public abstract class CommonServiceImpl<E extends Common, ID extends Serializable> implements ICommonService<E, ID> {
    protected CommonRepository<E, ID> commonRepository;
    
    public CommonServiceImpl(CommonRepository<E, ID> commonRepository){
        this.commonRepository = commonRepository;
    } 
   
    @Override
    public List<E> verE() {
    return commonRepository.findAll();    
    }

    @Override
    public void agregarE(E e) {
        commonRepository.save(e);
    }

    @Override
    public void borrarE(ID id) {
        commonRepository.deleteById(id);
    }
    

    @Override
    public  E buscarE(ID id) {
       return commonRepository.findById(id).orElse(null);
   
    }

    @Override
    public E editarE(ID id, E e) {
        commonRepository.findById(id);
        
        commonRepository.save(e);
        return e;
    }
    
}