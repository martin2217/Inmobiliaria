/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Inmueble;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author germa
 */
public class OpeAlta {
    

    public void altaInmueble (Inmueble casa)
    {                
        SessionFactory sesion = ConexionUtil.getSessionFactory();                
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(casa);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"Alta Inmueble correctamente.");
    }
    
     

        

}
