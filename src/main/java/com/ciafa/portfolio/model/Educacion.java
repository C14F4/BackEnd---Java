package com.ciafa.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String instituto;
    private String imagen;
    private String titulo;
    private String fechaInicio;
    private String fechaFinal;
    
    public Educacion(){
}
    public Educacion( Long id,
                    String instituto,
                    String imagen,
                    String titulo,
                    String fechaInicio,
                    String fechaFinal
                    ){
    this.id = id;
    this.instituto = instituto;
    this.imagen = imagen;
    this.titulo = titulo;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
}
}
