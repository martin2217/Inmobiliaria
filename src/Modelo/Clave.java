package Modelo;
// Generated 21-oct-2016 15:21:06 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Clave generated by hbm2java
 */
public class Clave  implements java.io.Serializable {


     private int idClave;
     private String nick;
     private String pass;
     private Set vendedors = new HashSet(0);

    public Clave() {
    }

	
    public Clave(int idClave) {
        this.idClave = idClave;
    }
    public Clave(int idClave, String nick, String pass, Set vendedors) {
       this.idClave = idClave;
       this.nick = nick;
       this.pass = pass;
       this.vendedors = vendedors;
    }
   
    public int getIdClave() {
        return this.idClave;
    }
    
    public void setIdClave(int idClave) {
        this.idClave = idClave;
    }
    public String getNick() {
        return this.nick;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Set getVendedors() {
        return this.vendedors;
    }
    
    public void setVendedors(Set vendedors) {
        this.vendedors = vendedors;
    }




}


