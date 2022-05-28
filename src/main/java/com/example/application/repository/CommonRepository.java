
package com.example.application.repository;


import com.example.application.model.Common;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository <E extends Common, ID extends Serializable> extends JpaRepository <E , ID>{
    
}