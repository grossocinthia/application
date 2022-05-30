
package com.example.application.controller;

import com.example.application.model.Common;
import java.io.Serializable;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface CommonController <E extends Common, ID extends Serializable>{
  
    public void agregarE (@RequestBody E e);
    public List <E> verE();
    public E buscarE(@PathVariable ID id); 
    public void borrarE (@PathVariable ID id);
      public E editarE(@PathVariable ID id, @RequestBody E e); 
  
}