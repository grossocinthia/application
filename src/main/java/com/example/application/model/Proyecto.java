
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
@Table (name= "proyecto")
public class Proyecto extends Common{
    
   private String imagenProy;
    private String tituloProy;
     @Column (length= 1500)
    private String descripcion;
    private String link;
    
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonProperty(access = Access.WRITE_ONLY )
    private Persona persona;

    public Proyecto(Persona persona) {
        this.persona = persona;
    }
   
     
    public Proyecto(){
    }

    public Proyecto(String imagenProy, String tituloProy, String descripcion, String link) {
        this.imagenProy = imagenProy;
        this.tituloProy = tituloProy;
        this.descripcion = descripcion;
        this.link = link;
      
       
    }
    
   
    
    
}