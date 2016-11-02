

package Gestor;

import Controlador.Dao;
import Modelo.Localidad;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Pc
 */
public class GestorLocalidad {
Dao dao;
    public GestorLocalidad() {
    dao= new Dao();
    
    }
     public String[] buscarLocalidadesPorProvincia(String provincia){
         
        Query query= dao.getSesion().getNamedQuery("LocalidadesDeUnaProvincia");
        query.setString(0, provincia);
        List<Localidad> localidades=  query.list();
          dao.cerrarConexion(dao.getSesion());
          String[] retorno= new String[localidades.size()+1];
            retorno[0]= " ";
          int i=1;
          for(Localidad loc: localidades){
          retorno[i]= loc.getNombre();
          i++;
          }
          
          
          return retorno;
    }
    
    
}
