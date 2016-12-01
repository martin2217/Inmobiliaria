
package Modelo;

import java.util.Date;

/**
 *
 * @author Pc
 * 
 * el motivo porque generamos la clase reserva es porque se puede reservar un inmueble varias veces,
 * es decir la relacion es N a M pero la restriccion es que la fecha de reserva debe ser posterior
 * a la fecha reservada mas la vigencia, si se cumple eso se puede reservar nuevamento o salvo que este en el estado alta
 * 
 * 
 */
public class Reserva implements java.io.Serializable {
    
    
    private Float importe;
    private Integer vigencia;
    private Date fecha_reservado;
    private Float precio_fecha_reservado;
    private int idReserva;
    private Cliente cliente;
    private Inmueble inmueble;
  
    
    public Reserva(){}

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public Date getFecha_reservado() {
        return fecha_reservado;
    }

    public void setFecha_reservado(Date fecha_reservado) {
        this.fecha_reservado = fecha_reservado;
    }

    public Float getPrecio_fecha_reservado() {
        return precio_fecha_reservado;
    }

    public void setPrecio_fecha_reservado(Float precio_fecha_reservado) {
        this.precio_fecha_reservado = precio_fecha_reservado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    
    
}
