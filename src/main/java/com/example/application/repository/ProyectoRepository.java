
package com.example.application.repository;

import com.example.application.model.Proyecto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends CommonRepository <Proyecto, Long> {
    
}