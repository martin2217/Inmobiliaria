/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;


/**
 *
 * @author germa
 */
public class ItemCatalogo {
        
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
    private String foto;
    private String lavadero;
    private String aguaCaliente;
    private String telefono;     
    

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ItemCatalogo(String provincia, String localidad, String barrio, String tipoInmueble, String precio, String orientacion, String superficie, String garage, String patio, String aguaCorriente, String cloaca, String gasNatural, String pavimento,String foto) {
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
        this.foto=foto;
        
    }
public ItemCatalogo(Inmueble i){
         this.provincia = i.getBarrio().getLocalidad().getProvincia().getNombre();
        this.localidad = i.getBarrio().getLocalidad().getNombre();
        this.barrio = i.getBarrio().getNombre();
        this.tipoInmueble = i.getTipoInmueble();
        this.precio = i.getPrecio().toString();
        this.orientacion = i.getOrientacion();
        this.superficie = i.getSuperficie().toString();
        this.garage = ((i.getGarage())? "Si":"No");
        this.patio = ((i.getPatio())? "Si":"No");
        this.aguaCorriente = ((i.getAguaCorriente())? "Si":"No");
        this.cloaca = ((i.getCloacas())? "Si":"No");
        this.gasNatural = ((i.getGasNatural())? "Si":"No");
        this.pavimento = ((i.getPavimento())? "Si":"No");
        try {
            
            this.foto=buscarimagenes(i.getIdInmueble());
        }catch(Exception e){
            this.foto=String.valueOf(i.getIdInmueble())+"_0.jpg";
        }
     }
     private String buscarimagenes(int  id) throws IOException{
         String i=String.valueOf(id);
        File ruta=new File("C:\\imagenes\\");
        
        FilenameFilter begin=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(i);
            }
        };
        File[] files=ruta.listFiles(begin);
      return files[0].getName();
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
