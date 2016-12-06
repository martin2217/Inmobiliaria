/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author gabriel
 */
public class ItemReserva {
    private String importe;
    private String vigencia;
    private String fecha_reservado;
    private String precio_fecha_reservado;
    private String idreserva;
    private String cliente;
    private String inmueble;

    public ItemReserva(String importe, String vigencia, String fecha_reservado, String precio_fecha_reservado, String idreserva, String cliente, String inmueble) {
        this.importe = importe;
        this.vigencia = vigencia;
        this.fecha_reservado = fecha_reservado;
        this.precio_fecha_reservado = precio_fecha_reservado;
        this.idreserva = idreserva;
        this.cliente = cliente;
        this.inmueble = inmueble;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getFecha_reservado() {
        return fecha_reservado;
    }

    public void setFecha_reservado(String fecha_reservado) {
        this.fecha_reservado = fecha_reservado;
    }

    public String getPrecio_fecha_reservado() {
        return precio_fecha_reservado;
    }

    public void setPrecio_fecha_reservado(String precio_fecha_reservado) {
        this.precio_fecha_reservado = precio_fecha_reservado;
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getInmueble() {
        return inmueble;
    }

    public void setInmueble(String inmueble) {
        this.inmueble = inmueble;
    }
    
    
}
