
package com.example.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table (name= "experiencia")
public class Experiencia extends Common{
    
    private String imagenEx;
    private String empresa;
    @Column (length= 1500)
    private String posicion;
    private String tipoEmpleo;
    private String comienzoEx;
    private String finEx;
    
   
    
    
   
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY )
    private Persona persona;

    public Experiencia(Persona persona) {
        this.persona = persona;
    }
    
    
public Experiencia(){
    }

    public Experiencia(String imagenEx, String empresa,  String posicion, String tipoEmpleo, String comienzoEx, String finEx) {
        this.imagenEx = imagenEx;
        this.empresa = empresa;
        this.posicion = posicion;
        this.tipoEmpleo = tipoEmpleo;
        this.comienzoEx = comienzoEx;
        this.finEx = finEx;
        
        
        
    }
}