/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Controlador.ConexionUtil;
import Modelo.Inmueble;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Gestor.GestorInmueble;
import Modelo.Barrio;
import Modelo.Cliente;
import Modelo.Propietario;
import java.util.List;

/**
 *
 * @author Martin
 * 
 * Prueba que un inmueble se cree (NO correctamente) --> hacer una prueba que verifique la correcta inserción del inmueble
 * 
 */
public class GestorAltaTest {
    
    private static SessionFactory sesion;
    private int cantidadInmuebles;
    
    public GestorAltaTest() {
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
        // Contar cantidad de inmuebles presentes en la BD, para comparar (hacer metodo, o usar el que consulta por inmuebles)
        List<Inmueble> inmuebles = GestorInmueble.get().buscarInmuebles("", "", "", "", "", "", "", "");
        cantidadInmuebles=inmuebles.size();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of altaInmueble method, of class GestorAlta.
     */
    @Test
    public void testAltaInmueble() {
        
        System.out.println("Alta de Inmueble 1");
        
        // Crear objetos propietario, barrio, cliente, etc para añadir al inmueble
        Cliente cli = new Cliente(1);
        Propietario prop = new Propietario(1);
        Barrio barri = (Barrio) GestorAlta.getBarrio("CENTRO");
        /*
        Inmueble aux = new Inmueble(
                GestorInmueble.get().maxIdInmobiliaria(),
                cli,
                prop,                
                barri,
                "Calle 1",
                Integer.parseInt(jTextNumero.getText()),
                Integer.parseInt(jTextPiso.getText()),
                Integer.parseInt(jTextDepartamento.getText()),
                jComboBox4.getSelectedItem().toString(),
                Float.parseFloat(jTextPrecioVenta.getText()),
                (String)jComboBox5.getSelectedItem(),
                Integer.parseInt(jTextFrente.getText()),
                Integer.parseInt(jTextFondo.getText()),
                Integer.parseInt(jTextSuperficie.getText()),
                "alta",
                Integer.parseInt(jTextMontoReserva.getText()),
                Integer.parseInt(jTextVigencia.getText()),
                Integer.parseInt(jTextPrecioVenta.getText()),
                date2, 
                //se cargan los campos que se agregaron a inmuebles.
                Integer.parseInt(jTextDormitorio.getText()),
                jCheckBoxPropiedadHorizontal.isSelected(),
                Float.parseFloat( jTextAntiguedad.getText()),
                Integer.parseInt(jTextBanio.getText()),
                jCheckBoxGaraje.isSelected(),
                jCheckBoxPatio.isSelected(),
                jCheckBoxAguaCorriente.isSelected(),
                jCheckBoxPiscina.isSelected(),
                jCheckBoxCloaca.isSelected(),
                jCheckBoxGasNatural.isSelected(),
                jCheckBoxPavimento.isSelected(),
                jCheckBoxLavadero.isSelected(),
                jCheckBoxAguaCaliente.isSelected(),
                jTextTelefono.getText(),
                jTextObservaciones.getText()
                );*/
        
        // Agrega a la BD el inmueble
        //GestorAlta.altaInmueble(casa);
        
        // Contar cantidad de inmuebles en la BD (hacer metodo)
        
        // Assert a la cantidad de inmuebles (+1)
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
