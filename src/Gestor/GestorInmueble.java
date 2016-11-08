 

package Gestor;


import Controlador.Dao;
import Modelo.Inmueble;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;



 
public final class GestorInmueble {
  // Forma de SINGLETON
    private static final GestorInmueble SELF = new GestorInmueble();
    //private V() {}
    public static GestorInmueble get(){
        
          
        return SELF;
    }
   
public GestorInmueble() {


}
    
    
    public List<Inmueble> buscarInmuebles( String provincia, String localidad, String barrio,String tipo_departamento
            , String cantidad_dormitorio ,String precio_minimo, String precio_maximo, String estado ){
    // cantidad de dormitorios no existe en ningun ladoooooooooooooooooooooooooooooooooooooooooooooooo
    
        Query query;
     List<Inmueble> retorno_inmueble ;   
     Float pre_min_query;
     Float pre_max_query;
     if(precio_minimo.equals("")) pre_min_query= 0.0F;
     else pre_min_query= Float.parseFloat(precio_minimo);
     if(precio_maximo.equals("")) pre_max_query=99999999999.2F;
     else pre_max_query= Float.parseFloat(precio_maximo);
     
     
        if(!provincia.equals("")){
            if(!localidad.equals("")){
                if(!barrio.equals("")){
                    if(!tipo_departamento.equals("")){
                       if(!estado.equals("")){
                           query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionados");
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
                           query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosEstado");
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
                        if(!estado.equals("")){
                         query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosTipoInmueble");  
                           query.setParameter("nombreProvincia",provincia);
                            query.setParameter("nombreBarrio", barrio);
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           query.setParameter("estado", estado);
                           retorno_inmueble=query.list();
                        }
                        else{
                              query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosTipoInmuebleYEstado");  
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
                    if((!tipo_departamento.equals(""))&&(!estado.equals(""))){
                    query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrio");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nobmreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(!tipo_departamento.equals("")){
                        query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(!estado.equals("")){
                    query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYTipoDepartamento");
                            
                           query.setParameter("nombreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                             query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosBarrioYTipoDepartamentoYEstado");
                            
                           query.setParameter("nombreProvincia",provincia);          
                            query.setParameter("nombreLocalidad", localidad);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                        }
                    
                }
            }
            else{ //este else es si no selecciono una localidad por lo tanto no podra seleccionar un barrio
                
                if((!tipo_departamento.equals(""))&&(!estado.equals(""))){
                    query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETC");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);          
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(!tipo_departamento.equals("")){
                        query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("nombreProvincia",provincia);          
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(!estado.equals("")){
                    query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYTipoDepartamento");
                            
                           query.setParameter("nombreProvincia",provincia);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                           query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosLocalidadETCYTipoDepartamentoYEstado");   
                           query.setParameter("nombreProvincia",provincia);       
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                        }
                    
                
            }
        }
        else{ // este es si no selecciona una provincia por lo tanto no podra seleccionar localidad ni barrio
            
             if((!tipo_departamento.equals(""))&&(!estado.equals(""))){
                    query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETC");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    else if(!tipo_departamento.equals("")){
                        query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYEstado");
                            query.setParameter("tipoInmueble", tipo_departamento);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    
                    }
                    else if(!estado.equals("")){
                    query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYTipoDepartamento");
                            
                           query.setParameter("estado",estado);
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                    }
                    
                    else{
                           query= Dao.get().getSesion().getNamedQuery("TodosLosFiltrosSeleccionadosMenosProvinciaETCYTipoDepartamentoYEstado");   
                           
                           query.setParameter("precioMin", pre_min_query);
                           query.setParameter("precioMax", pre_max_query);
                           retorno_inmueble=query.list();
                        }
             
        }
        
     /*  List<Inmueble> retorno_inmuebles= Dao.get().getSesion().createCriteria(Inmueble.class).list();
       
        Dao.get().cerrarConexion(Dao.get().getSesion());
        return retorno_inmuebles;
    */
    Dao.get().cerrarConexion(Dao.get().getSesion());
        return retorno_inmueble;
    }
    
   public void borrarInmueble(int id){ /* con este metodo borro un objeto de la base de datos debo saber su id y la clase, asi lo busco al objeto y lo borro*/
        Session sesion;
        sesion=Dao.get().getSesion();
          sesion.beginTransaction();
        Inmueble inmueble_a_borrar=(Inmueble)sesion.get(Inmueble.class,id);
        sesion.delete(inmueble_a_borrar);
        sesion.getTransaction().commit();
        sesion.close();
    } 
   
   
    
}
