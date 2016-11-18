package Pruebas;

import Controlador.ConexionUtil;
import Gestor.GestorAlta;
import Modelo.Inmueble;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Gestor.GestorInmueble;
import Gestor.GestorInmueble;
import Modelo.Barrio;
import Modelo.Cliente;
import Modelo.Propietario;
import Modelo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;




public class AltaInmuebleTest {
    
    private static SessionFactory sesion;
  
    
    public AltaInmuebleTest() {
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
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testAltaInmueble() throws ParseException {
        
        
        
        System.out.println("Alta de Inmueble");
        
        
        //DATOS DE PRUEBA
        Integer idInmuebleTest1 = GestorInmueble.get().maxIdInmobiliaria();
        Cliente clienteTest1 = new Cliente(1);
        Propietario propietarioTest1 = new Propietario(1);
        Barrio barrioTest1 = (Barrio) GestorAlta.getBarrio("Centro")    ;
        String calle = "San Martin";
        Integer nroCalle = 4030;
        Integer piso = 0;
        Integer depto = 2;
        String tipoInmueble = "Casa";
        Float precio = 500000.00f;
        String orientacion = "Este";
        Integer frente = 20;
        Integer fondo = 40;
        Integer superficie = 800;
        String estado = "Alta";
        Integer montoReserva = 100000;
        Integer vigenciaReserva = 15;
        Integer montoVenta = 500000;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        String dateInString = "2016-10-11";
        Date fechaAlta = formatter.parse(dateInString);
        Integer cant_dormitorios = 4;
        Boolean propiedadHorizontal = true;
        Float antiguedad = 20.00f;
        Integer banios = 2;
        Boolean garage = null;
        Boolean patio = null;
        Boolean aguaCorriente = true;
        Boolean piscina= false;
        Boolean cloacas = null;
        Boolean gasNatural = true;
        Boolean pavimento = null;
        Boolean lavadero = null;
        Boolean aguaCaliente= true;
        String telefono = null;
        String observaciones = null;
        
        
        
        
        Inmueble inmuebleTest1 = new Inmueble(idInmuebleTest1,clienteTest1, propietarioTest1,barrioTest1,calle,nroCalle,
                        piso,depto,tipoInmueble,precio,orientacion,frente,fondo,superficie,estado,montoReserva,vigenciaReserva,
                        montoVenta,fechaAlta,cant_dormitorios,propiedadHorizontal, antiguedad,banios,garage,
                        patio,aguaCorriente,piscina,cloacas,gasNatural,pavimento,lavadero,aguaCaliente,telefono,observaciones);


        //METODO A PROBAR        
        GestorAlta.altaInmueble(inmuebleTest1);
        
        
        
        
        
        
        
        //CONDICIONES DE PRUEBA
        assertNotNull(idInmuebleTest1);
        
        assertNotNull(clienteTest1);
        
        assertNotNull(propietarioTest1);
        
        assertFalse(montoReserva == 0);
        
        assertFalse(vigenciaReserva == 0);
        
        assertFalse(montoVenta == 0);
        
        assertTrue(calle.length() < 30);
       
        assertTrue(nroCalle < 1000000000);
        
        assertFalse(!"Departamento".equals(tipoInmueble) && propiedadHorizontal == false);
        
        assertFalse(montoReserva >= precio);
        
        
        
      
        
    }
    
}
