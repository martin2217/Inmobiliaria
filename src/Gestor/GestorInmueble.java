 

package Gestor;


import Controlador.Dao;
import Modelo.Inmueble;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;



 
public class GestorInmueble {
Dao dao;
   
public GestorInmueble() {
dao= new Dao();
}
    
    
    public List<Inmueble> buscarInmuebles( String provincia, String localidad, String barrio, String tipo_departamento /*, String cantidad_dormitorio*/ ,String precio_minimo, String precio_maximo, String estado ){
    // cantidad de dormitorios no existe en ningun ladoooooooooooooooooooooooooooooooooooooooooooooooo
    
        Query query;
     List<Inmueble> retorno_inmueble ;   
     Float pre_min_query;
     Float pre_max_query;
     if(precio_minimo==null) pre_min_query= 0.0F;
     else pre_min_query= Float.parseFloat(precio_minimo);
     if(precio_maximo==null) pre_max_query=99999999999.2F;
     else pre_max_query= Float.parseFloat(precio_maximo);
     
     
        if(provincia!=null){
            if(localidad!=null){
                if(barrio!=null){
                    if(tipo_departamento!=null){
                       if(estado!=null){
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionados");
                            query.setString(3, tipo_departamento);
                           query.setString(2,provincia);
                            query.setString(0, barrio);
                            query.setString(1, localidad);
                           query.setString(6,estado);
                           query.setFloat(4, pre_min_query);
                           query.setFloat(5, pre_max_query);
                           retorno_inmueble=query.list();
                       
                       }
                       else{
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosEstado");
                            query.setString(3, tipo_departamento);
                           query.setString(2,provincia);
                            query.setString(0, barrio);
                            query.setString(1, localidad);
                           query.setFloat(4, pre_min_query);
                           query.setFloat(5, pre_max_query);
                           
                           retorno_inmueble=query.list();
                           
                       }
                    }
                    else{
                        if(estado!=null){
                         query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosTipoInmueble");  
                           query.setString(2,provincia);
                            query.setString(0, barrio);
                            query.setString(1, localidad);
                           query.setFloat(3, pre_min_query);
                           query.setFloat(4, pre_max_query);
                           query.setString(5, estado);
                           retorno_inmueble=query.list();
                        }
                        else{
                              query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosTipoInmuebleYEstado");  
                           query.setString(2,provincia);
                            query.setString(0, barrio);
                            query.setString(1, localidad);
                           query.setFloat(3, pre_min_query);
                           query.setFloat(4, pre_max_query);
                           retorno_inmueble=query.list();
                            
                            
                        }
                           
                    }
                   
                }
                else{ // este else es si no selecciono un barrio
                    if((tipo_departamento!=null)&&(estado!=null)){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrio");
                            query.setString(2, tipo_departamento);
                           query.setString(1,provincia);          
                            query.setString(0, localidad);
                           query.setString(5,estado);
                           query.setFloat(3, pre_min_query);
                           query.setFloat(4, pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(tipo_departamento!=null){
                        query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYEstado");
                            query.setString(3, tipo_departamento);
                           query.setString(2,provincia);          
                            query.setString(1, localidad);
                           query.setFloat(4, pre_min_query);
                           query.setFloat(5, pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(estado!=null){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYTipoDepartamento");
                            
                           query.setString(1,provincia);          
                            query.setString(0, localidad);
                           query.setString(4,estado);
                           query.setFloat(2, pre_min_query);
                           query.setFloat(3, pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                             query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYTipoDepartamentoYEstado");
                            
                           query.setString(1,provincia);          
                            query.setString(0, localidad);
                           
                           query.setFloat(2, pre_min_query);
                           query.setFloat(3, pre_max_query);
                           retorno_inmueble=query.list();
                        }
                    
                }
            }
            else{ //este else es si no selecciono una localidad por lo tanto no podra seleccionar un barrio
                
                if((tipo_departamento!=null)&&(estado!=null)){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETC");
                            query.setString(1, tipo_departamento);
                           query.setString(0,provincia);          
                           query.setString(4,estado);
                           query.setFloat(2, pre_min_query);
                           query.setFloat(3, pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(tipo_departamento!=null){
                        query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYEstado");
                            query.setString(1, tipo_departamento);
                           query.setString(0,provincia);          
                           query.setFloat(2, pre_min_query);
                           query.setFloat(3, pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(estado!=null){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYTipoDepartamento");
                            
                           query.setString(0,provincia);          
                            
                           query.setString(3,estado);
                           query.setFloat(1, pre_min_query);
                           query.setFloat(2, pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYTipoDepartamentoYEstado");   
                           query.setString(0,provincia);       
                           query.setFloat(1, pre_min_query);
                           query.setFloat(2, pre_max_query);
                           retorno_inmueble=query.list();
                        }
                    
                
            }
        }
        else{ // este es si no selecciona una provincia por lo tanto no podra seleccionar localidad ni barrio
            
             if((tipo_departamento!=null)&&(estado!=null)){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETC");
                            query.setString(0, tipo_departamento);
                                 
                           query.setString(3,estado);
                           query.setFloat(1, pre_min_query);
                           query.setFloat(2, pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(tipo_departamento!=null){
                        query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYEstado");
                            query.setString(0, tipo_departamento);
                           
                           query.setFloat(1, pre_min_query);
                           query.setFloat(2, pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(estado!=null){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYTipoDepartamento");
                            
                           query.setString(2,estado);
                           query.setFloat(0, pre_min_query);
                           query.setFloat(1, pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYTipoDepartamentoYEstado");   
                           
                           query.setFloat(0, pre_min_query);
                           query.setFloat(1, pre_max_query);
                           retorno_inmueble=query.list();
                        }
             
        }
        
     /*  List<Inmueble> retorno_inmuebles= dao.getSesion().createCriteria(Inmueble.class).list();
       
        dao.cerrarConexion(dao.getSesion());
        return retorno_inmuebles;
    */
    dao.cerrarConexion(dao.getSesion());
        return retorno_inmueble;
    }
    
   public void borrarInmueble(int id){ /* con este metodo borro un objeto de la base de datos debo saber su id y la clase, asi lo busco al objeto y lo borro*/
        Session sesion;
        sesion=dao.getSesion();
          sesion.beginTransaction();
        Inmueble inmueble_a_borrar=(Inmueble)sesion.get(Inmueble.class,id);
        sesion.delete(inmueble_a_borrar);
        sesion.getTransaction().commit();
        sesion.close();
    } 
   
   
    
}
