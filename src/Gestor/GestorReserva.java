 
/*hay que ir a este link --> https://www.google.com/settings/security/lesssecureapps y activarlo. Desde
el correo de la empresa para poder enviar los emails*/
package Gestor;

import Controlador.ConexionUtil;
import Controlador.Dao;
import Modelo.Inmueble;
import Modelo.Reserva;
import java.util.Date;
import javax.mail.MessagingException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public final class GestorReserva  extends Thread{

    
    String Mensage = "";
    String To = "";
    String Subject = "";
    
     // Forma de SINGLETON
    private static final GestorReserva SELF = new GestorReserva();
    
    public static GestorReserva get(){
        return SELF;
    }
    
    public GestorReserva() {
    }
    
    public void actualizarEstado(int id,String importe,String vigencia) throws MessagingException {
        // Creación de reserva y actualización de estado
        Reserva nueva_reserva = new Reserva();
        int  id_reserva= maxIdReserva();
        
        Session sesion;
        sesion=Dao.get().getSesion();
        sesion.beginTransaction();
        
        //Obtenemos el inmueble para actualizar su estado mediante el parametro id
        Inmueble inmueble_a_actualizar_estado=(Inmueble)sesion.get(Inmueble.class,id);
        // seteamos y actualizamos el objeto Inmueble
        inmueble_a_actualizar_estado.setEstado("Reservado");
        sesion.update(inmueble_a_actualizar_estado);
        
        //seteamos la nueva reserva y la guardamos
        nueva_reserva.setIdReserva(id_reserva);
        nueva_reserva.setCliente(inmueble_a_actualizar_estado.getCliente());
        nueva_reserva.setInmueble(inmueble_a_actualizar_estado);
        nueva_reserva.setFecha_reservado(new Date());
        nueva_reserva.setPrecio_fecha_reservado(Float.valueOf(importe));
        nueva_reserva.setVigencia(Integer.valueOf(vigencia));
        sesion.save(nueva_reserva);
        sesion.getTransaction().commit();
        sesion.close();
        // Iniciamos otro hilo de ejecucion el cual envia el email de confirmacion
        GestorEmail nuevo = new GestorEmail(id_reserva);
        nuevo.start();
    }
    
    // obtenemos el id para el proximo objeto Reserva
    public int maxIdReserva (){
        Session session;
        session=ConexionUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Reserva.class);
        criteria.add(Restrictions.isNotNull("idReserva"));
        criteria.setProjection(
                Projections.projectionList()
                        .add(Projections.max("idReserva")
                        )
        );
        
        if (criteria.list().get(0) != null){
            return  (int) criteria.list().get(0) + 1;
        }
        else
            return 1;
        
    }
    
    // buscamos la reserva por su id
    public Reserva buscarRerserva(int id_reserva){
   
        Session sesion;
        sesion=Dao.get().getSesion();
        sesion.beginTransaction();
        Reserva retorno=(Reserva)sesion.get(Reserva.class,id_reserva);
        sesion.getTransaction().commit();
        sesion.close();
        
    return retorno;
    }
    
}
