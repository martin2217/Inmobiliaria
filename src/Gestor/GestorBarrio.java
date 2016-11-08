/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestor;

import Controlador.Dao;
import Modelo.Barrio;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Pc
 */
public   class GestorBarrio {

      // Forma de SINGLETON
    private static final GestorBarrio SELF = new GestorBarrio();
    //private V() {}
    public static GestorBarrio get(){
        
          
        return SELF;
    }
    
    
    public GestorBarrio() {
  
    
    }
    
    
    public String[] buscarBarrioPorCiudad(String localidad){
        
        Query query= Dao.get().getSesion().getNamedQuery("LocalidadesDeUnaLocalidad");
        query.setParameter("nombreBarrio", localidad);
        List<Barrio> barrios=  query.list();
        Dao.get().cerrarConexion(Dao.get().getSesion());
        String[] retorno= new String[barrios.size()+1];
        retorno[0]= "";
        int i=1;
        for(Barrio bar: barrios){
            retorno[i]= bar.getNombre();
            i++;
        }
        
        
        return retorno;
        
        
        
        
        
    }
    
    
    
}
