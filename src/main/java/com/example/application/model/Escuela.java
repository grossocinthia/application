
package com.example.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name= "escuela")
public class Escuela extends Common{
    
    private String imagenEd;
    private String institucion;
    @Column (length= 1500)
    private String titulo;
    private String estado;
    private String comienzoEd;
    private String finEd;
    
    
 
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonProperty(access = Access.WRITE_ONLY )
    private Persona persona;
    
 public Escuela(){
    }

    public Escuela(Persona persona) {
        this.persona = persona;
    }

         
    public Escuela(String imagenEd,String institucion, String titulo, String estado, String comienzoEd, String finEd) {
        this.imagenEd = imagenEd;
        this.institucion = institucion;
        this.titulo = titulo;
         this.estado = estado;
        this.comienzoEd = comienzoEd;
        this.finEd = finEd;
      
      
        
        
    }
    
}