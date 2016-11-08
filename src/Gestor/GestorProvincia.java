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
  // Forma de SINGLETON
    private static final GestorProvincia SELF = new GestorProvincia();
    //private V() {}
    public static GestorProvincia get(){
        
          
        return SELF;
    }
    public GestorProvincia() {
    
    }
    
    public List<Provincia> buscarProvincia(){
    
     List<Provincia> retorno_provincia= Dao.get().getSesion().createCriteria(Provincia.class).list();
       
        Dao.get().cerrarConexion(Dao.get().getSesion());
        return retorno_provincia;
    }
    
    /*public void pruebaCriteria(){
    List<Localidad> resultado;
        String nom= null;
        Criteria c1= Dao.get().getSesion().createCriteria(Localidad.class);
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

