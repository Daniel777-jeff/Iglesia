package com.modelo;
// Generated 22/05/2020 9:15:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Nivel generated by hbm2java
 */
public class Nivel  implements java.io.Serializable {


     private int idn;
     private String descripcion;
     private String catequista;
     private String celular;
     private Set<Alumno> alumnos = new HashSet<Alumno>(0);

    public Nivel() {
    }

	
    public Nivel(int idn, String descripcion, String catequista, String celular) {
        this.idn = idn;
        this.descripcion = descripcion;
        this.catequista = catequista;
        this.celular = celular;
    }
    public Nivel(int idn, String descripcion, String catequista, String celular, Set<Alumno> alumnos) {
       this.idn = idn;
       this.descripcion = descripcion;
       this.catequista = catequista;
       this.celular = celular;
       this.alumnos = alumnos;
    }

    public Nivel(String descripcion, String catequista, String celular) {
        this.descripcion = descripcion;
        this.catequista = catequista;
        this.celular = celular;
    }
   
    
    
    public int getIdn() {
        return this.idn;
    }
    
    public void setIdn(int idn) {
        this.idn = idn;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCatequista() {
        return this.catequista;
    }
    
    public void setCatequista(String catequista) {
        this.catequista = catequista;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public Set<Alumno> getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }




}

