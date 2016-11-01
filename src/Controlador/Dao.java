

package Controlador;

import Modelo.Cliente;
import Modelo.Inmueble;
import Modelo.Provincia;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Dao {

  
    
     public static void altaCliente(Cliente cli){
        SessionFactory sesion = ConexionUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cli);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"Insertado correctamente.");
    }
    
     
         /*public DefaultListModel mostrarProvincias()
    {
        SessionFactory sesion = NuevaConexionUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Provincia");
        List<Provincia> lista = q.list();
        Iterator<Provincia> iter=lista.iterator();
        tx.commit();
        session.close();
        
        DefaultListModel modelo = new DefaultListModel();
        
        while(iter.hasNext())
        {
            Provincia prov = (Provincia) iter.next();
            modelo.addElement(prov.getNombre());
        }
        return modelo;
    }
    */
}

