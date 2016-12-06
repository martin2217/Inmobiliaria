/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Modelo.Inmueble;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin
 * 
 * NOOOOO USADOOOOOOOOOOOOO
 * 
 */
public class GestorInmuebleTest {
    
    public GestorInmuebleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get method, of class GestorInmueble.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        GestorInmueble expResult = null;
        GestorInmueble result = GestorInmueble.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarInmuebles method, of class GestorInmueble.
     */
    @Test
    public void testBuscarInmuebles() {
        System.out.println("buscarInmuebles");
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
        List<Inmueble> result = instance.buscarInmuebles(provincia, localidad, barrio, tipo_departamento, cantidad_dormitorio, precio_minimo, precio_maximo, estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarInmueble method, of class GestorInmueble.
     */
    @Test
    public void testBorrarInmueble() {
        System.out.println("borrarInmueble");
        int id = 0;
        GestorInmueble instance = new GestorInmueble();
        instance.borrarInmueble(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
