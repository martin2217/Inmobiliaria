package Modelo;
// Generated 21-oct-2016 15:21:06 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Vendedor generated by hbm2java
 */
public class Vendedor  implements java.io.Serializable {


     private int idVendedor;
     private TipoDoc tipoDoc;
     private Barrio barrio;
     private Clave clave;
     private String nombre;
     private String apellido;
     private Integer telefono;
     private String email;
     private Integer nroDoc;
     private String direccion;
     private Set clientes = new HashSet(0);

    public Vendedor() {
    }

	
    public Vendedor(int idVendedor, TipoDoc tipoDoc, Barrio barrio, Clave clave) {
        this.idVendedor = idVendedor;
        this.tipoDoc = tipoDoc;
        this.barrio = barrio;
        this.clave = clave;
    }
    public Vendedor(int idVendedor, TipoDoc tipoDoc, Barrio barrio, Clave clave, String nombre, String apellido, Integer telefono, String email, Integer nroDoc, String direccion, Set clientes) {
       this.idVendedor = idVendedor;
       this.tipoDoc = tipoDoc;
       this.barrio = barrio;
       this.clave = clave;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.email = email;
       this.nroDoc = nroDoc;
       this.direccion = direccion;
       this.clientes = clientes;
    }
   
    public int getIdVendedor() {
        return this.idVendedor;
    }
    
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    public TipoDoc getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(TipoDoc tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public Barrio getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    public Clave getClave() {
        return this.clave;
    }
    
    public void setClave(Clave clave) {
        this.clave = clave;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getNroDoc() {
        return this.nroDoc;
    }
    
    public void setNroDoc(Integer nroDoc) {
        this.nroDoc = nroDoc;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


