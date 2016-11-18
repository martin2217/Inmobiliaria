
package Pruebas;

import Controlador.ConexionUtil;
import Gestor.GestorInmueble;
import Modelo.Inmueble;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BorrarInmuebleTest {
      
    
    private static SessionFactory sesion;
      
      
    public BorrarInmuebleTest() {
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
    public void testBorrarInmueble() {
        System.out.println("borrarInmueble");
        
        
        //Datos de prueba
        int idInmuebleTest = 4;
       
        
        
        
        GestorInmueble instance = new GestorInmueble();

        //Método a probar
        instance.borrarInmueble(idInmuebleTest);
        
        
        
        Inmueble inmuebleBorrado = instance.buscarInmueblePorId(idInmuebleTest);
        
        //Condición de prueba
        assertEquals(inmuebleBorrado,null);

        
    }
}
