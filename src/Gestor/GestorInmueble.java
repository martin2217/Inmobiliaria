 

package Gestor;


import Controlador.Dao;
import Modelo.Inmueble;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;



 
public final class GestorInmueble {
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
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);
                            query.setParameter("nombreBarrio", barrio);
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                       
                       }
                       else{
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);
                            query.setParameter("nombreBarrio", barrio);
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           
                           retorno_inmueble=query.list();
                           
                       }
                    }
                    else{
                        if(estado!=null){
                         query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosTipoInmueble");  
                           query.setParameter("nombreProvincia",provincia);
                            query.setParameter("nombreBarrio", barrio);
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           query.setParameter("estado", estado);
                           retorno_inmueble=query.list();
                        }
                        else{
                              query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosTipoInmuebleYEstado");  
                           query.setParameter("nombreProvincia",provincia);
                            query.setParameter("nombreBarrio", barrio);
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                            
                            
                        }
                           
                    }
                   
                }
                else{ // este else es si no selecciono un barrio
                    if((tipo_departamento!=null)&&(estado!=null)){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrio");
                            query.setString("tipoInmueble", tipo_departamento);
                           query.setParameter("nobmreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(tipo_departamento!=null){
                        query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(estado!=null){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYTipoDepartamento");
                            
                           query.setParameter("nombreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                             query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYTipoDepartamentoYEstado");
                            
                           query.setParameter("nombreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                        }
                    
                }
            }
            else{ //este else es si no selecciono una localidad por lo tanto no podra seleccionar un barrio
                
                if((tipo_departamento!=null)&&(estado!=null)){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETC");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);          
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(tipo_departamento!=null){
                        query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);          
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(estado!=null){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYTipoDepartamento");
                            
                           query.setParameter("nombreProvincia",provincia);
                           query.setParameter("estadp",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYTipoDepartamentoYEstado");   
                           query.setString("nombreProvincia",provincia);       
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                        }
                    
                
            }
        }
        else{ // este es si no selecciona una provincia por lo tanto no podra seleccionar localidad ni barrio
            
             if((tipo_departamento!=null)&&(estado!=null)){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETC");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(tipo_departamento!=null){
                        query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(estado!=null){
                    query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYTipoDepartamento");
                            
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                           query= dao.getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYTipoDepartamentoYEstado");   
                           
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
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
