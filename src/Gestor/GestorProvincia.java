/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestor;

import Controlador.Dao;

import Modelo.Provincia;
import java.util.List;


/**
 *
 * @author Pc
 */
public class GestorProvincia {
Dao dao;
    public GestorProvincia() {
    dao = new Dao();
    }
    
    public List<Provincia> buscarProvincia(){
    
     List<Provincia> retorno_provincia= dao.getSesion().createCriteria(Provincia.class).list();
       
        dao.cerrarConexion(dao.getSesion());
        return retorno_provincia;
    }
    
    /*public void pruebaCriteria(){
    List<Localidad> resultado;
        String nom= null;
        Criteria c1= dao.getSesion().createCriteria(Localidad.class);
    if(nom!=null){
        
        Criteria c2= c1.createCriteria("barrios");
       
        c2.add(Restrictions.eq("nombre", nom));
        resultado= c2.list();}
    else{
     resultado=  c1.list();
    }
                
    for(Localidad p: resultado){
    System.out.print(p.getNombre());
    
    }
    
    }*/
    
}

