
package com.example.application.repository;

import com.example.application.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CommonRepository <Persona, Long> {
    
}