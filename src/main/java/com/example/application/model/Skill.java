
package com.example.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name= "skill")
public class Skill  extends Common{ 
    
    private String nombreSkill;
    private String percent;
   
   
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY )
    private Persona persona;

    public Skill(Persona persona) {
        this.persona = persona;
    }

    public Skill() {
    }

    public Skill(String nombreSkill, String percent) {
        this.nombreSkill = nombreSkill;
        this.percent = percent;
    }
    
    

}