package com.ciafa.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String trabajo;
    private String imagen;
    private String puesto;
    private String fechaInicio;
    private String fechaFinal;
    
    public Experiencia(){
}
    public Experiencia( Long id,
                    String trabajo,
                    String imagen,
                    String puesto,
                    String fechaInicio,
                    String fechaFinal
                    ){
    this.id = id;
    this.trabajo = trabajo;
    this.imagen = imagen;
    this.puesto = puesto;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
}
}