
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

    }
    
    @After
    public void tearDown() {
    }

  


    @Test
    public void testBuscarInmuebles() {
        System.out.println("buscarInmuebles");
        
        //Datos de prueba
        String provincia = "";
        String localidad = "";
        String barrio = "";
        String tipo_departamento = "";
        String cantidad_dormitorio = "";
        String precio_minimo = "";
        String precio_maximo = "";
        String estado = "";
        GestorInmueble instance = new GestorInmueble();
        List<Inmueble> expResult = null;
        
        //Metodo de prueba
        List<Inmueble> result = instance.buscarInmuebles(provincia, localidad, barrio, tipo_departamento, cantidad_dormitorio, precio_minimo, precio_maximo, estado);
        
        
        //Condiciones de prueba
        assertNotEquals(expResult, result);
        
        assertEquals(result.size(),instance.maxIdInmobiliaria()-1);
        
        
       
       
    }



    
  
}