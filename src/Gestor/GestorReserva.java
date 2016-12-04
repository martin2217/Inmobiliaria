 

package Gestor;

import Controlador.ConexionUtil;
import Controlador.Dao;
import Modelo.Inmueble;
import Modelo.Reserva;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pc
 * 
 * 
 * 
 */
public final class GestorReserva {

     // Forma de SINGLETON
    private static final GestorReserva SELF = new GestorReserva();
   
    
    public static GestorReserva get(){
        
        return SELF;
    }
    
    public GestorReserva() {
    }
    
    
    
    public void actualizarEstado(int id,String importe,String vigencia){
        
        // falta agregar la fecha y no se que mas, tambien hay q ver por el tema de la tabla para que solo saque al q reservo
        Reserva nueva_reserva = new Reserva();
        
        //actualizo el campo reserva del inmueble
        Session sesion;
        sesion=Dao.get().getSesion();
        sesion.beginTransaction();
        Inmueble inmueble_a_actualizar_estado=(Inmueble)sesion.get(Inmueble.class,id);
        inmueble_a_actualizar_estado.setEstado("Reservado");
        sesion.update(inmueble_a_actualizar_estado);
        sesion.getTransaction().commit();
        sesion.close();
        
        // seteo y guardo la reserva
        Session sesion1;
        sesion1= Dao.get().getSesion();
        sesion1.beginTransaction();
        nueva_reserva.setIdReserva(maxIdReserva());
        nueva_reserva.setCliente(inmueble_a_actualizar_estado.getCliente());
        nueva_reserva.setInmueble(inmueble_a_actualizar_estado);
        nueva_reserva.setFecha_reservado(new Date());
        nueva_reserva.setPrecio_fecha_reservado(Float.valueOf(importe));
        nueva_reserva.setVigencia(Integer.valueOf(vigencia));
        sesion1.save(nueva_reserva);
        sesion1.getTransaction().commit();
        sesion1.close();
        
    
    }
    
    
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
    
    
}
