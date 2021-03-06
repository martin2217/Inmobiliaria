package Modelo;
// Generated 21-oct-2016 15:21:06 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Provincia generated by hbm2java
 */
public class Provincia  implements java.io.Serializable {


     private int idProvincia;
     private String nombre;
     private Set localidads = new HashSet(0);

    public Provincia() {
    }

	
    public Provincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    public Provincia(int idProvincia, String nombre, Set localidads) {
       this.idProvincia = idProvincia;
       this.nombre = nombre;
       this.localidads = localidads;
    }
   
    public int getIdProvincia() {
        return this.idProvincia;
    }
    
    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getLocalidads() {
        return this.localidads;
    }
    
    public void setLocalidads(Set localidads) {
        this.localidads = localidads;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }




}


