package Modelo;
// Generated 21-oct-2016 15:21:06 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Barrio generated by hbm2java
 */
public class Barrio  implements java.io.Serializable {


     private int idBarrio;
     private Localidad localidad;
     private String nombre;
     private Set vendedors = new HashSet(0);
     private Set inmuebles = new HashSet(0);

    public Barrio() {
    }

	
    public Barrio(int idBarrio, Localidad localidad) {
        this.idBarrio = idBarrio;
        this.localidad = localidad;
    }
    
    public Barrio(int idBarrio) {
        this.idBarrio = idBarrio;      
    }
    
    public Barrio(int idBarrio, Localidad localidad, String nombre, Set vendedors, Set inmuebles) {
       this.idBarrio = idBarrio;
       this.localidad = localidad;
       this.nombre = nombre;
       this.vendedors = vendedors;
       this.inmuebles = inmuebles;
    }
   
    public int getIdBarrio() {
        return this.idBarrio;
    }
    
    public void setIdBarrio(int idBarrio) {
        this.idBarrio = idBarrio;
    }
    public Localidad getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getVendedors() {
        return this.vendedors;
    }
    
    public void setVendedors(Set vendedors) {
        this.vendedors = vendedors;
    }
    public Set getInmuebles() {
        return this.inmuebles;
    }
    
    public void setInmuebles(Set inmuebles) {
        this.inmuebles = inmuebles;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }




}


