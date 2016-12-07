/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestor;

import Modelo.Reserva;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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

/**
 *
 * @author Pc
 */
public class GestorEmail extends Thread{
    int id_reserva;
    String Mensaje = "";
    String To = "";
    String Subject = "";
    private Multipart multiParte;
    
    public GestorEmail(int id){
        id_reserva=id;
    }
    
    @Override
    // implementamos el metodo run() para poder lanzar otro hilo de ejecucion
    public void run(){
        
        try {
            
            Reserva reserva = GestorReserva.get().buscarRerserva(id_reserva);
            // configuramos el correo
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            
            // nos logueamos
            javax.mail.Session session;
            session = javax.mail.Session.getInstance(props,new javax.mail.Authenticator() {     
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication("InmobiliariaUTN.FRSF@gmail.com",
                            "inmobiliariatp");
                }
            });
            
            // completamos el mensaje la direccion de correo y el asunto
            StringBuilder msj = new StringBuilder("Sr/Sra ");
            msj.append(reserva.getCliente().getNombre()); msj.append(" ");
            msj.append(reserva.getCliente().getApellido());
            msj.append(" se ha realizado exitosamente su reserva. \n\n");
            msj.append("Muchas gracias por depositar su confianza en nosotros.\n\n Saludos");
            msj.append(" Atte: Inmobiliaria UTN-FRSF");
            Mensaje=msj.toString();
            
            To =reserva.getCliente().getEmail();
            // aca esta para crear la ruta
            //string parametro= "C:\\Users\\Pc\\Desktop\\"+;
            Subject = "Confirmacion de Reserva";
            BodyPart adjunto = new MimeBodyPart();
            BodyPart texto = new MimeBodyPart();
            try {
                adjunto.setDataHandler(
                        
                        // aca esta la direccion de donde se encuentra el archivo
                        // buscamos el archivo adjunto, creamos el tipo de dato y lo inicializamos
                        new DataHandler(new FileDataSource("C:\\Users\\Pc\\Desktop\\perfil.jpg")));
            } catch (MessagingException ex) {
                Logger.getLogger(GestorEmail.class.getName()).log(Level.SEVERE, null, ex);
            }
           // seteamos los datos al mensaje 
            adjunto.setFileName("Comprobante");
            texto.setText(Mensaje);
            multiParte = new MimeMultipart();
            multiParte.addBodyPart(adjunto);
            multiParte.addBodyPart(texto);
            
            
            try {
                // configuramos el mensaje y lo enviamos
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
            
            
        } catch (MessagingException ex) {
            Logger.getLogger(GestorEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
