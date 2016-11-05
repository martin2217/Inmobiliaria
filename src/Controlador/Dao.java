

package Controlador;

import Modelo.Cliente;
import Modelo.Inmueble;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 
public  final class Dao {

    
    private final  SessionFactory sesion;
    
    
    
    public  Dao(){
    

    // creo y abro la sesion 
        sesion= ConexionUtil.getSessionFactory();
         
    }

    public Session getSesion() {
        return sesion.openSession();
    }
  
    
    public void cerrarConexion(Session sesion_a_cerrar ){
        
        sesion_a_cerrar.close();
    
    }
    
    
    
    
    
    
    
     public void altaCliente(Cliente cli){
        SessionFactory sesion = ConexionUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cli);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"Insertado correctamente.");
    }
    
     
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

