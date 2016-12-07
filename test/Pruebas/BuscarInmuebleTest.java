package Pruebas;

import Controlador.ConexionUtil;
import Gestor.GestorInmueble;
import Modelo.Inmueble;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BuscarInmuebleTest {
    
        private String provincia;
        private String localidad;
        private String barrio;
        private String tipo_departamento;
        private String cantidad_dormitorio;
        private String precio_minimo;
        private String precio_maximo;
        private String estado;
        private GestorInmueble instance;
        private List<Inmueble> expResult;
    
      private static SessionFactory sesion;
      
      
    public BuscarInmuebleTest() {
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
        
        
       //Datos de prueba
        provincia = "";
        localidad = "";
        barrio = "";
        tipo_departamento = "";
        cantidad_dormitorio = "";
        precio_minimo = "";
        precio_maximo = "";
        estado = "";
        instance = new GestorInmueble();
        expResult = null;
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testBuscarInmuebles() {
        System.out.println("buscarInmuebles");
        
        //Metodo de prueba
        List<Inmueble> result = instance.buscarInmuebles(provincia, localidad,barrio,
                tipo_departamento, cantidad_dormitorio, precio_minimo, precio_maximo, estado);
        
        //Condiciones de prueba
        assertNotEquals(expResult, result);
        
        assertEquals(result.size(),instance.maxIdInmobiliaria()-1);
        
    }
    
}



    
  