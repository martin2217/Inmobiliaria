package Modelo;
// Generated 21-oct-2016 15:21:06 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Inmueble generated by hbm2java
 */
public class Inmueble  implements java.io.Serializable {


     private int idInmueble;
     private Cliente cliente;
     private Propietario propietario;
     private Edificio edificio;
     private Barrio barrio;
     private String calle;
     private Integer nroCalle;
     private Integer piso;
     private Integer depto;
     private String tipoInmueble;
     private Float precio;
     private Integer orientacion;
     private Integer frente;
     private Integer fondo;
     private Integer superficie;
     private String estado;
     private Integer montoReserva;
     private Integer vigenciaReserva;
     private Integer montoVenta;
     private Date fechaAlta;
     private Set consultas = new HashSet(0);

    public Inmueble() {
    }

	
    public Inmueble(int idInmueble, Propietario propietario, Barrio barrio) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
        this.barrio = barrio;
    }
    public Inmueble(int idInmueble, Cliente cliente, Propietario propietario, Edificio edificio, Barrio barrio, String calle, Integer nroCalle, Integer piso, Integer depto, String tipoInmueble, Float precio, Integer orientacion, Integer frente, Integer fondo, Integer superficie, String estado, Integer montoReserva, Integer vigenciaReserva, Integer montoVenta, Date fechaAlta, Set consultas) {
       this.idInmueble = idInmueble;
       this.cliente = cliente;
       this.propietario = propietario;
       this.edificio = edificio;
       this.barrio = barrio;
       this.calle = calle;
       this.nroCalle = nroCalle;
       this.piso = piso;
       this.depto = depto;
       this.tipoInmueble = tipoInmueble;
       this.precio = precio;
       this.orientacion = orientacion;
       this.frente = frente;
       this.fondo = fondo;
       this.superficie = superficie;
       this.estado = estado;
       this.montoReserva = montoReserva;
       this.vigenciaReserva = vigenciaReserva;
       this.montoVenta = montoVenta;
       this.fechaAlta = fechaAlta;
       this.consultas = consultas;
    }
    
    // ESTE ES EL QUE USAMOS
    public Inmueble(int idInmueble, Cliente cliente, Propietario propietario, Edificio edificio, Barrio barrio, String calle, Integer nroCalle, Integer piso, Integer depto, String tipoInmueble, Float precio, Integer orientacion, Integer frente, Integer fondo, Integer superficie, String estado, Integer montoReserva, Integer vigenciaReserva, Integer montoVenta, Date fechaAlta) {
       this.idInmueble = idInmueble;
       this.cliente = cliente;
       this.propietario = propietario;
       this.edificio = edificio;
       this.barrio = barrio;
       this.calle = calle;
       this.nroCalle = nroCalle;
       this.piso = piso;
       this.depto = depto;
       this.tipoInmueble = tipoInmueble;
       this.precio = precio;
       this.orientacion = orientacion;
       this.frente = frente;
       this.fondo = fondo;
       this.superficie = superficie;
       this.estado = estado;
       this.montoReserva = montoReserva;
       this.vigenciaReserva = vigenciaReserva;
       this.montoVenta = montoVenta;
       this.fechaAlta = fechaAlta;
    }
   
    public int getIdInmueble() {
        return this.idInmueble;
    }
    
    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Propietario getPropietario() {
        return this.propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public Edificio getEdificio() {
        return this.edificio;
    }
    
    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
    public Barrio getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Integer getNroCalle() {
        return this.nroCalle;
    }
    
    public void setNroCalle(Integer nroCalle) {
        this.nroCalle = nroCalle;
    }
    public Integer getPiso() {
        return this.piso;
    }
    
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
    public Integer getDepto() {
        return this.depto;
    }
    
    public void setDepto(Integer depto) {
        this.depto = depto;
    }
    public String getTipoInmueble() {
        return this.tipoInmueble;
    }
    
    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }
    public Float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public Integer getOrientacion() {
        return this.orientacion;
    }
    
    public void setOrientacion(Integer orientacion) {
        this.orientacion = orientacion;
    }
    public Integer getFrente() {
        return this.frente;
    }
    
    public void setFrente(Integer frente) {
        this.frente = frente;
    }
    public Integer getFondo() {
        return this.fondo;
    }
    
    public void setFondo(Integer fondo) {
        this.fondo = fondo;
    }
    public Integer getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getMontoReserva() {
        return this.montoReserva;
    }
    
    public void setMontoReserva(Integer montoReserva) {
        this.montoReserva = montoReserva;
    }
    public Integer getVigenciaReserva() {
        return this.vigenciaReserva;
    }
    
    public void setVigenciaReserva(Integer vigenciaReserva) {
        this.vigenciaReserva = vigenciaReserva;
    }
    public Integer getMontoVenta() {
        return this.montoVenta;
    }
    
    public void setMontoVenta(Integer montoVenta) {
        this.montoVenta = montoVenta;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Set getConsultas() {
        return this.consultas;
    }
    
    public void setConsultas(Set consultas) {
        this.consultas = consultas;
    }




}


