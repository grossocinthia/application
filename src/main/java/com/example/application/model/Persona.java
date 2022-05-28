
package com.example.application.model;



import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name= "persona")

public class Persona extends Common{
    
    private String imagen;
    private String nombreCompleto;
    private String backimagen;
    private String titulos;
    private String telefono;
    private String ubicacion;
    @Column (length= 1500)
    private String acerca;
    
  @OneToMany(mappedBy="persona", cascade =CascadeType.ALL)
    private Set<Escuela> escuela = new HashSet<>();
  
  @OneToMany(mappedBy="persona", cascade =CascadeType.ALL)
    private Set<Experiencia> experiencia = new HashSet<>();
  
  @OneToMany(mappedBy="persona", cascade =CascadeType.ALL)
    private Set<Proyecto> proyecto = new HashSet<>();
  
    @OneToMany(mappedBy="persona", cascade =CascadeType.ALL)
    private Set<Skill> skill = new HashSet<>();

 
    public Persona(){
    }
    
    public Persona (String nombreCompleto, String imagen,String backimagen, String titulos, String telefono, String ubicacion, String acerca){
       
        this.backimagen = backimagen;
        this.nombreCompleto = nombreCompleto;
        this.titulos = titulos;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.acerca = acerca;
        this.imagen = imagen;
    }

   
    
    
}