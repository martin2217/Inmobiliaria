

package Gestor;

import Controlador.Dao;
import Modelo.Localidad;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Pc
 */
public final class GestorLocalidad {
  // Forma de SINGLETON
    private static final GestorLocalidad SELF = new GestorLocalidad();
    //private V() {}
    public static GestorLocalidad get(){
        
          
        return SELF;
    }
    public GestorLocalidad() {
     
 
    }
     public String[] buscarLocalidadesPorProvincia(String provincia){
         
        Query query= Dao.get().getSesion().getNamedQuery("LocalidadesDeUnaProvincia");
        query.setParameter("nombreLocalidad", provincia);
        List<Localidad> localidades=  query.list();
          Dao.get().cerrarConexion(Dao.get().getSesion());
          String[] retorno= new String[localidades.size()+1];
            retorno[0]= "";
          int i=1;
          for(Localidad loc: localidades){
          retorno[i]= loc.getNombre();
          i++;
          }
          
          
          return retorno;
    }
    
    
}
