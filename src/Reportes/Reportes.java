/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;


import Modelo.ListaCatalogo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author: todo el grupo
 */
public class Reportes {

private static JasperReport report;
private static JasperPrint reportFilled;
private static JasperViewer viewer;    
    
    public static void imprimirCatalogo (){
        try {
            List lista = new ArrayList();
            
            for(int i=0;i<5;i++)
            {
                ListaCatalogo inmueble_aux = new ListaCatalogo("Santa fe_" + i, "Santa fe", "San Telmo", "Depto", "120.000", "Sur", "120", "SI", "SI", "SI", "SI", "SI", "SI");
                lista.add(inmueble_aux);
            }                            
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("Cliente", "Pogliani, Germán");
            parametros.put("Telefono","0342 - 155 024 405");            
            report = (JasperReport) JRLoader.loadObjectFromFile("./src/Reportes/miReporte3.jasper");            
            reportFilled = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(lista));                                    
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void verVisor()
    {
    viewer = new JasperViewer(reportFilled, false);
    viewer.setTitle("Catálogo de Inmuebles");
    viewer.setVisible(true);
    }
    
    
    public static void crearCatalogo(String ruta, Map parametros){
        try
        {
            List lista = new ArrayList();            
            for(int i=0;i<5;i++)
            {
                //Falta el temita de las fotos que es de sonia
                //hay que referenciar las fotos en la clase LISTACATALOGO.JAVA
                
                ListaCatalogo inmueble_aux = new ListaCatalogo("Santa fe_" + i, "Santa fe_" + i, "San Telmo_" + i, "Depto", "120.000", "Sur_" + i, "120", "SI", "SI", "SI", "SI", "SI", "SI");
                lista.add(inmueble_aux);
            }
            report = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reportFilled = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(lista));
        } catch (JRException e)
        {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
