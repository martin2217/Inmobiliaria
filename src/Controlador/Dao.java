

package Controlador;

import Modelo.Cliente;
import Modelo.Inmueble;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public  final class Dao {

    
      // Forma de SINGLETON
    private static final Dao SELF = new Dao();
    //private V() {}
    public static Dao get(){
        
          
        return SELF;
    }
    
    
    private final  SessionFactory sesion;
    
    
    
    private  Dao(){
    

    // creo y abro la sesion 
        sesion= ConexionUtil.getSessionFactory();
         
    }

    public Session getSesion() {
          Session nueva=   sesion.openSession();
        
      Configuration con= new Configuration();
        con.configure("hibernate.cfg.xml");
        
        
        return nueva;
    }
  
    
    public void cerrarConexion(Session sesion_a_cerrar ){
        
        sesion_a_cerrar.close();
    
    }
    
    
    
    
    
    
    
     public void altaCliente(Cliente cli){
        
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cli);
        tx.commit();
        session.close();
    }
    
     
    public void altaInmueble (Inmueble casa)
    {                
                      
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(casa);
        tx.commit();
        session.close();
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

