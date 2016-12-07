package Modelo;
// Generated 21-oct-2016 15:21:06 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import static javassist.CtMethod.ConstParameter.integer;

/**
 * Inmueble generated by hbm2java
 */
public class Inmueble  implements java.io.Serializable {
    
    
    private int idInmueble;
    private Cliente cliente;
    private Propietario propietario;
    
    private Barrio barrio;
    private String calle;
    private Integer nroCalle;
    private Integer piso;
    private Integer depto;
    private String tipoInmueble;
    private Float precio;
    private String orientacion;
    private Integer frente;
    private Integer fondo;
    private Integer superficie;
    private String estado;
    private Integer montoReserva;
    private Integer vigenciaReserva;
    private Integer montoVenta;
    private Date fechaAlta;
    private Set consultas = new HashSet(0);
    
    // estas dos propiedades faltaban y aca las agrego
     private Boolean estado_vendido=false;
     private Integer cant_dormitorios;

   
     
     // estas son las propiedades agregadas de edificio a inmueble
     private Boolean propiedadHorizontal=false;
     private Float antiguedad;
     // no va esta repetida private Integer superficie;
     private Integer banios;
     private Boolean garage=false;
     private Boolean patio=false;
     private Boolean aguaCorriente=false;
     private Boolean piscina=false;
     private Boolean cloacas=false;
     private Boolean gasNatural=false;
     private Boolean pavimento=false;
     private Boolean lavadero=false;
     private Boolean aguaCaliente=false;
     private String telefono;
     private String observaciones;
     
      
    public Inmueble() {
    }
    
    
    public Inmueble(int idInmueble, Propietario propietario, Barrio barrio) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
        this.barrio = barrio;
    }
    public Inmueble(int idInmueble, Cliente cliente, Propietario propietario,  Barrio barrio, String calle, Integer nroCalle, Integer piso, Integer depto, String tipoInmueble, Float precio, String orientacion, Integer frente, Integer fondo, Integer superficie, String estado, Integer montoReserva, Integer vigenciaReserva, Integer montoVenta, Date fechaAlta, Set consultas) {
        this.idInmueble = idInmueble;
        this.cliente = cliente;
       this.propietario = propietario;
        
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
    public Inmueble(Integer idInmueble, Cliente cliente, Propietario propietario, 
            Barrio barrio, String calle, Integer nroCalle, Integer piso, 
            Integer depto, String tipoInmueble, Float precio, String orientacion, 
            Integer frente, Integer fondo, Integer superficie, String estado, 
            Integer montoReserva, Integer vigenciaReserva, Integer montoVenta, 
            Date fechaAlta, Integer dormitorios, Boolean prophori, Float antiguedad,
            Integer banios, Boolean garage, Boolean patio, Boolean aguacorriente,
            Boolean piscina, Boolean cloaca, Boolean gas, Boolean pavi,
            Boolean lava, Boolean aguacali, String tel, String obs) {
       this.idInmueble = idInmueble;
       this.cliente = cliente;
       this.propietario = propietario;       
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
       this.estado_vendido = false;
       
           
       // nuevos atributos.............
       this.cant_dormitorios = dormitorios;
       this.propiedadHorizontal = prophori;
       this.antiguedad = antiguedad;
       this.banios = banios;
       this.garage = garage;
       this.patio = patio;
       this.aguaCorriente = aguacorriente;
       this.piscina = piscina;
       this.cloacas = cloaca;
       this.gasNatural = gas;
       this.pavimento = pavi;
       this.lavadero = lava;
       this.aguaCaliente = aguacali;
       this.telefono = tel;
       this.observaciones = obs;
    }

    public Boolean getEstado_vendido() {
        return estado_vendido;
    }

    public Boolean getPropiedadHorizontal() {
        return propiedadHorizontal;
    }

    public Boolean getGarage() {
        return garage;
    }

    public Boolean getPatio() {
        return patio;
    }

    public Boolean getAguaCorriente() {
        return aguaCorriente;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public Boolean getCloacas() {
        return cloacas;
    }

    public Boolean getGasNatural() {
        return gasNatural;
    }

    public Boolean getPavimento() {
        return pavimento;
    }

    public Boolean getLavadero() {
        return lavadero;
    }

    public Boolean getAguaCaliente() {
        return aguaCaliente;
    }

    public Inmueble(int parseInt, Cliente cli, Propietario prop, Object object, Barrio barri, String text, int parseInt0, int parseInt1, int parseInt2, String toString, float parseFloat, int selectedIndex, int parseInt3, int parseInt4, int parseInt5, String alta, int parseInt6, int parseInt7, int i, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Inmueble(int parseInt, Cliente cli, Propietario prop, Object object, Barrio barri, String text, int parseInt0, int parseInt1, int parseInt2, String toString, float parseFloat, int selectedIndex, int parseInt3, int parseInt4, int parseInt5, String alta, int parseInt6, int parseInt7, String text0, String format, String text1, boolean selected, float parseFloat0, int parseInt8, boolean selected0, boolean selected1, boolean selected2, boolean selected3, boolean selected4, boolean selected5, boolean selected6, boolean selected7, boolean selected8, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getDireccion(){ 
    return this.getCalle()+" "+this.getNroCalle();
    }

    public Boolean isEstado_vendido() {
        return estado_vendido;
    }

    public void setEstado_vendido(Boolean estado_vendido) {
        this.estado_vendido = estado_vendido;
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
    public String getOrientacion() {
        return this.orientacion;
    }
    
    public void setOrientacion(String orientacion) {
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

 public Boolean isPropiedadHorizontal() {
        return propiedadHorizontal;
    }

    public void setPropiedadHorizontal(Boolean propiedadHorizontal) {
        this.propiedadHorizontal = propiedadHorizontal;
    }

    public Float getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Float antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public Boolean isGarage() {
        return garage;
    }

    public void setGarage(Boolean garage) {
        this.garage = garage;
    }

    public Boolean isPatio() {
        return patio;
    }

    public void setPatio(Boolean patio) {
        this.patio = patio;
    }

    public Boolean isAguaCorriente() {
        return aguaCorriente;
    }

    public void setAguaCorriente(Boolean aguaCorriente) {
        this.aguaCorriente = aguaCorriente;
    }

    public Boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }

    public Boolean isCloacas() {
        return cloacas;
    }

    public void setCloacas(Boolean cloacas) {
        this.cloacas = cloacas;
    }

    public Boolean isGasNatural() {
        return gasNatural;
    }

    public void setGasNatural(Boolean gasNatural) {
        this.gasNatural = gasNatural;
    }

    public Boolean isPavimento() {
        return pavimento;
    }

    public void setPavimento(Boolean pavimento) {
        this.pavimento = pavimento;
    }

    public Boolean isLavadero() {
        return lavadero;
    }

    public void setLavadero(Boolean lavadero) {
        this.lavadero = lavadero;
    }

    public Boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(Boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstado_vendido(boolean estado_vendido) {
        this.estado_vendido = estado_vendido;
    }

    public Integer getCant_dormitorios() {
        return cant_dormitorios;
    }

    public void setCant_dormitorios(Integer cant_dormitorios) {
        this.cant_dormitorios = cant_dormitorios;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}


