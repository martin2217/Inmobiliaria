/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;


/**
 *
 * @author germa
 */
public class ListaCatalogo {
        
    private String idInmueble;   
    private String provincia;
    private String localidad;
    private String barrio;   
    private String tipoInmueble;
    private String precio;    
    private String orientacion;    
    private String superficie;    
    private String montoReserva;
    private String cant_dormitorios;
    private String banio;
    private String garage;
    private String patio;
    private String aguaCorriente;
    private String piscina;
    private String cloaca;
    private String gasNatural;
    private String pavimento;
    private String lavadero;
    private String aguaCaliente;
    private String telefono; 
    //si son mas imagenes no se como seria ???
    private Image imagen;

    public ListaCatalogo(String provincia, String localidad, String barrio, String tipoInmueble, String precio, String orientacion, String superficie, String garage, String patio, String aguaCorriente, String cloaca, String gasNatural, String pavimento) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.barrio = barrio;
        this.tipoInmueble = tipoInmueble;
        this.precio = precio;
        this.orientacion = orientacion;
        this.superficie = superficie;
        this.garage = garage;
        this.patio = patio;
        this.aguaCorriente = aguaCorriente;
        this.cloaca = cloaca;
        this.gasNatural = gasNatural;
        this.pavimento = pavimento;
    }

    
    public String getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(String idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getMontoReserva() {
        return montoReserva;
    }

    public void setMontoReserva(String montoReserva) {
        this.montoReserva = montoReserva;
    }

    public String getCant_dormitorios() {
        return cant_dormitorios;
    }

    public void setCant_dormitorios(String cant_dormitorios) {
        this.cant_dormitorios = cant_dormitorios;
    }

    public String getBanio() {
        return banio;
    }

    public void setBanio(String banio) {
        this.banio = banio;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getAguaCorriente() {
        return aguaCorriente;
    }

    public void setAguaCorriente(String aguaCorriente) {
        this.aguaCorriente = aguaCorriente;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public String getCloaca() {
        return cloaca;
    }

    public void setCloaca(String cloaca) {
        this.cloaca = cloaca;
    }

    public String getGasNatural() {
        return gasNatural;
    }

    public void setGasNatural(String gasNatural) {
        this.gasNatural = gasNatural;
    }

    public String getPavimento() {
        return pavimento;
    }

    public void setPavimento(String pavimento) {
        this.pavimento = pavimento;
    }

    public String getLavadero() {
        return lavadero;
    }

    public void setLavadero(String lavadero) {
        this.lavadero = lavadero;
    }

    public String getAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(String aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
