 
/*hay que ir a este link --> https://www.google.com/settings/security/lesssecureapps y activarlo. Desde
el correo de la empresa para poder enviar los emails*/
package Gestor;

import Controlador.ConexionUtil;
import Controlador.Dao;
import Modelo.Inmueble;
import Modelo.Reserva;


import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

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

    
    String Mensage = "";
    String To = "";
    String Subject = "";
    private Multipart multiParte;
    
    
    
    
    
     // Forma de SINGLETON
    private static final GestorReserva SELF = new GestorReserva();
   
    
    public static GestorReserva get(){
        
        return SELF;
    }
    
    public GestorReserva() {
    }
    
    
    
    public void actualizarEstado(int id,String importe,String vigencia) throws MessagingException{
        
        // falta agregar la fecha y no se que mas, tambien hay q ver por el tema de la tabla para que solo saque al q reservo
        Reserva nueva_reserva = new Reserva();
        int id_reserva;
        //actualizo el campo reserva del inmueble
        Session sesion;
        sesion=Dao.get().getSesion();
        sesion.beginTransaction();
        // con este obtengo el inmueble
        
        Inmueble inmueble_a_actualizar_estado=(Inmueble)sesion.get(Inmueble.class,id);
        
        
        inmueble_a_actualizar_estado.setEstado("Reservado");
        sesion.update(inmueble_a_actualizar_estado);
        sesion.getTransaction().commit();
        sesion.close();
        
        // seteo y guardo la reserva
        Session sesion1;
        sesion1= Dao.get().getSesion();
        sesion1.beginTransaction();
        id_reserva= maxIdReserva();
        nueva_reserva.setIdReserva(id_reserva);
        nueva_reserva.setCliente(inmueble_a_actualizar_estado.getCliente());
        nueva_reserva.setInmueble(inmueble_a_actualizar_estado);
        nueva_reserva.setFecha_reservado(new Date());
        nueva_reserva.setPrecio_fecha_reservado(Float.valueOf(importe));
        nueva_reserva.setVigencia(Integer.valueOf(vigencia));       
        sesion1.save(nueva_reserva);
        sesion1.getTransaction().commit();
        sesion1.close();
        enviarEmail(id_reserva);
        
    
    }
    
    
    
    public void enviarEmail(int id_reserva) throws MessagingException{
        
        Reserva reserva = buscarRerserva(id_reserva);
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        javax.mail.Session session = javax.mail.Session.getInstance(props,new javax.mail.Authenticator() {
            
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("InmobiliariaUTN.FRSF@gmail.com","inmobiliariatp");
            }
        });
        
        //Se recoge la información y se envía el email
        Mensage = "holaaaaaaaaaaaaaaaaa";
        To =reserva.getCliente().getEmail();
        // aca esta para crear la ruta
        //string parametro= "C:\\Users\\Pc\\Desktop\\"+;
        Subject = "Confirmacion de Reserva";
        BodyPart adjunto = new MimeBodyPart();
        BodyPart texto = new MimeBodyPart();
        adjunto.setDataHandler(
                
                // aca esta la direccion de donde se encuentra el archivo
                
                new DataHandler(new FileDataSource("C:\\Users\\Pc\\Desktop\\perfil.jpg")));
        adjunto.setFileName("Comprobante");
        texto.setText(Mensage);
        multiParte = new MimeMultipart();
        multiParte.addBodyPart(adjunto);
        multiParte.addBodyPart(texto);
        
   
            try {
                
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("InmobiliariaUTN.FRSF@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(To));
                message.setSubject(Subject);
                message.setContent(multiParte);
                Transport.send(message);
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
            
    
    
    
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
    
    
    private Reserva buscarRerserva(int id_reserva){
    
      
        Session sesion;
        sesion=Dao.get().getSesion();
        sesion.beginTransaction();
        Reserva retorno=(Reserva)sesion.get(Reserva.class,id_reserva);
        sesion.getTransaction().commit();
        sesion.close();
        
        
    return retorno;
    }
    
    
    
    
}
