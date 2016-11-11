/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Controlador.ConexionUtil;
import Controlador.Dao;
import Modelo.Barrio;
import Modelo.Inmueble;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author germa
 */
public class GestorAlta {
 
    public static void altaInmueble (Inmueble casa)
    {                
        SessionFactory sesion = ConexionUtil.getSessionFactory();                
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(casa);
        tx.commit();
        session.close();
    }
    
    public static Barrio getBarrio (String name){
        Query query;
        query= Dao.get().getSesion().
                createQuery("from Barrio where nombre=:name");
        query.setParameter("name", name);
        Barrio barrio = (Barrio) query.uniqueResult();

        return barrio;
    }
}
