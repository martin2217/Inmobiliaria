/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author germa
 */
public class ListaCatalogo {
        
    private Integer idInmueble;   
    private String provincia;
    private String localidad;
    private String barrio;   
    private String tipoInmueble;
    private Float precio;    
    private String orientacion;    
    private Integer superficie;    
    private Integer montoReserva;
    private Integer cant_dormitorios;
    private Integer banio;
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

    public ListaCatalogo(String provincia, String localidad, String barrio, String tipoInmueble, Float precio, String orientacion, Integer superficie, String garage, String patio, String aguaCorriente, String cloaca, String gasNatural, String pavimento) {
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

    
    public Integer getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Integer idInmueble) {
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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public Integer getMontoReserva() {
        return montoReserva;
    }

    public void setMontoReserva(Integer montoReserva) {
        this.montoReserva = montoReserva;
    }

    public Integer getCant_dormitorios() {
        return cant_dormitorios;
    }

    public void setCant_dormitorios(Integer cant_dormitorios) {
        this.cant_dormitorios = cant_dormitorios;
    }

    public Integer getBanio() {
        return banio;
    }

    public void setBanio(Integer banio) {
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
