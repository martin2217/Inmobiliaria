package Pruebas;


import Controlador.ConexionUtil;
import Gestor.GestorAlta;
import Gestor.GestorInmueble;

import Modelo.Inmueble;
import Modelo.Barrio;
import Modelo.Cliente;
import Modelo.Propietario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.SessionFactory;




public class CrearInmuebleTest {
    
  
        private int idInmuebleTest1;
        private Cliente clienteTest1;
        private Propietario propietarioTest1;
        private Barrio barrioTest1;
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
        private Integer cant_dormitorios;
        private Boolean propiedadHorizontal;
        private Float antiguedad;
        private Integer banios;
        private Boolean garage;
        private Boolean patio;
        private Boolean aguaCorriente;
        private Boolean piscina;
        private Boolean cloacas;
        private Boolean gasNatural;
        private Boolean pavimento;
        private Boolean lavadero;
        private Boolean aguaCaliente;
        private String telefono;
        private String observaciones;
        
        private Inmueble inmuebleTest1;
        
        private String provincia;
        private String localidad;
        private String barrio;
        private String tipo_departamento;
        private String cantidad_dormitorio;
        private String precio_minimo;
        private String precio_maximo;
        private String estado1;
        private GestorInmueble instance;
        private List<Inmueble> expResult;
    
         private static SessionFactory sesion;
    
    public CrearInmuebleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        sesion = ConexionUtil.getSessionFactory();
    }
    
    @AfterClass
    public static void tearDownClass() {
        sesion.close();
    }
    
    @Before
    public void setUp() throws ParseException {
        
        
        //DATOS DE PRUEBA
        idInmuebleTest1 = 999;
        clienteTest1 = new Cliente(1);
        propietarioTest1 = new Propietario(1);
        barrioTest1 = (Barrio) GestorAlta.getBarrio("Centro");
        calle = "San Martin";
        nroCalle = 4030;
        piso = 0;
        depto = 2;
        tipoInmueble = "Casa";
        precio = 500000.00f;
        orientacion = "Este";
        frente = 20;
        fondo = 40;
        superficie = 800;
        estado = "Alta";
        montoReserva = 100000;
        vigenciaReserva = 15;
        montoVenta = 500000;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        String dateInString = "2016-10-11";
        fechaAlta = formatter.parse(dateInString);
        cant_dormitorios = 4;
        propiedadHorizontal = true;
        antiguedad = 20.00f;
        banios = 2;
        garage = null;
        patio = null;
        aguaCorriente = true;
        piscina= false;
        cloacas = null;
        gasNatural = true;
        pavimento = null;
        lavadero = null;
        aguaCaliente= true;
        telefono = null;
        observaciones = null;
        
        
        inmuebleTest1 = new Inmueble(idInmuebleTest1,clienteTest1, propietarioTest1,barrioTest1,calle,nroCalle,
                        piso,depto,tipoInmueble,precio,orientacion,frente,fondo,superficie,estado,montoReserva,vigenciaReserva,
                        montoVenta,fechaAlta,cant_dormitorios,propiedadHorizontal, antiguedad,banios,garage,
                        patio,aguaCorriente,piscina,cloacas,gasNatural,pavimento,lavadero,aguaCaliente,telefono,observaciones);
    
        
        //METODO A PROBAR        
        //GestorAlta.altaInmueble(inmuebleTest1);
        
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testCampos1(){
        //CONDICIONES DE PRUEBA
        assertNotNull(inmuebleTest1.getIdInmueble());
        assertEquals(idInmuebleTest1,inmuebleTest1.getIdInmueble());
        assertNotNull(inmuebleTest1.getCliente());
        assertEquals(clienteTest1,inmuebleTest1.getCliente());
        assertEquals(propietarioTest1,inmuebleTest1.getPropietario());
        assertEquals(barrioTest1,inmuebleTest1.getBarrio());
    }
    
    @Test
    public void testCampos2(){
        //CONDICIONES DE PRUEBA
        assertEquals(calle,inmuebleTest1.getCalle());
        assertEquals(nroCalle,inmuebleTest1.getNroCalle());
        assertEquals(piso,inmuebleTest1.getPiso());
        assertEquals(depto,inmuebleTest1.getDepto());
        assertEquals(tipoInmueble,inmuebleTest1.getTipoInmueble());
        assertEquals(precio,inmuebleTest1.getPrecio());
        assertEquals(orientacion,inmuebleTest1.getOrientacion());
        assertEquals(frente,inmuebleTest1.getFrente());
        assertEquals(fondo,inmuebleTest1.getFondo());
        assertEquals(superficie,inmuebleTest1.getSuperficie());
        assertEquals(estado,inmuebleTest1.getEstado());
        assertEquals(montoReserva,inmuebleTest1.getMontoReserva());
        assertEquals(vigenciaReserva,inmuebleTest1.getVigenciaReserva());
    }
    
    @Test
    public void testCampos3(){
        //CONDICIONES DE PRUEBA
        assertEquals(montoVenta,inmuebleTest1.getMontoVenta());
        assertEquals(fechaAlta,inmuebleTest1.getFechaAlta());
        assertEquals(cant_dormitorios,inmuebleTest1.getCant_dormitorios());
        assertEquals(propiedadHorizontal,inmuebleTest1.getPropiedadHorizontal());
        assertEquals(antiguedad,inmuebleTest1.getAntiguedad());
        assertEquals(banios,inmuebleTest1.getBanios());
        assertEquals(garage,inmuebleTest1.getGarage());
        assertEquals(patio,inmuebleTest1.getPatio());
        assertEquals(aguaCorriente,inmuebleTest1.getAguaCorriente());
        assertEquals(piscina,inmuebleTest1.getPiscina());
        assertEquals(cloacas,inmuebleTest1.getCloacas());
        assertEquals(gasNatural,inmuebleTest1.getGasNatural());
        assertEquals(pavimento,inmuebleTest1.getPavimento());
        assertEquals(lavadero,inmuebleTest1.getLavadero());
        assertEquals(aguaCaliente,inmuebleTest1.getAguaCaliente());
        assertEquals(telefono,inmuebleTest1.getTelefono());
        assertEquals(observaciones,inmuebleTest1.getObservaciones());
    }
    
    @Test
    public void testIntegrador4(){
        
        // Prueba que se ingrese el inmueble a la base de datos
        // (independientemente de que se ingrese correctamente)
        instance = new GestorInmueble();
        
        // Se buscan todos los inmuebles
        List<Inmueble> result1 = instance.buscarInmuebles("", "","",
                "", "", "", "", "");
        
        // Dando alta del inmueble en BD
        GestorAlta.altaInmueble(inmuebleTest1);
        
        // Se buscan todos los inmuebles
        List<Inmueble> result2 = instance.buscarInmuebles("", "","",
                "", "", "", "", "");
        
        // Comparación de cantidades
        assertEquals(result1.size()+1, result2.size());
        
        // Borrado fisico del inmueble
        instance.borrarInmueble(idInmuebleTest1);
        
    }
    
}