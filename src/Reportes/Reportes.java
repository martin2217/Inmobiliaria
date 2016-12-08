/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Modelo.Reserva;
import Modelo.ItemCatalogo;
import Modelo.ItemReserva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
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

    //setea los datos del reporte.
    public static void imprimirCatalogo (){
        try {
            List lista = new ArrayList();
            
            for(int i=0;i<5;i++)
            {
                
                ItemCatalogo inmueble_aux = new ItemCatalogo("Santa fe_" + i, "Santa fe", "San Telmo", "Depto", "120.000", "Sur", "120", "SI", "SI", "SI", "SI", "SI", "SI",i+"_1");
                lista.add(inmueble_aux);
            }      
            
            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("Cliente", "Pogliani, Germán");
            parametros.put("Telefono","0342 - 155 024 405");            
            report = (JasperReport) JRLoader.loadObjectFromFile("./src/Reportes/miReporte3.jasper");            
            reportFilled = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(lista));                                    
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void imprimirReserva (){
        try {                
            List lista = new ArrayList();
            
            ItemReserva reserva = new ItemReserva("2500","3 dias","21/04/99","5000","4","pepito","marbella");
            lista.add(reserva);
            
            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("Cliente", "Pogliani, Germán");
            parametros.put("Telefono","0342 - 155 024 405");            
            report = (JasperReport) JRLoader.loadObjectFromFile("./src/Reportes/miReporte4.jasper");            
            reportFilled = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(lista));                                    
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //muestra el reporte 
    public static void verVisor(String titulo)
    {
        viewer = new JasperViewer(reportFilled, false);
        viewer.setTitle(titulo);
        viewer.setVisible(true);
    }
    
    //este metodo sirve para lanzar el catalogo en donde items son todos 
    //los registros devueltos por la consulta. Items reemplazaria a lista.
    public static void crearCatalogo(String ruta, Map parametros, List items){
        try
        {
            List lista = new ArrayList();            
            for(int i=0;i<5;i++)
            {
                //Falta el temita de las fotos que es de sonia
                //hay que referenciar las fotos en la clase ITEMCATALOGO.JAVA
                
                ItemCatalogo inmueble_aux = new ItemCatalogo("Santa fe_" + i, "Santa fe_" + i, "San Telmo_" + i, "Depto", "120.000", "Sur_" + i, "120", "SI", "SI", "SI", "SI", "SI", "SI",i+"_1");
                lista.add(inmueble_aux);
            }
            report = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reportFilled = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(lista));
        } catch (JRException e)
        {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //este metodo sirve para lanzar la reserva en donde items son todos
    //los registros devueltos por la consulta. Items reemplazaria a lista.
    
    /*public static void crearReserva(String ruta, Map parametros, List items){
        try
        {
            List lista = new ArrayList();            
            for(int i=0;i<5;i++)
            {                
                ItemReserva inmueble_aux = new ItemCatalogo("Santa fe_" + i, "Santa fe_" + i, "San Telmo_" + i, "Depto", "120.000", "Sur_" + i, "120", "SI", "SI", "SI", "SI", "SI", "SI",i+"_1");
                lista.add(inmueble_aux);
            }
            report = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reportFilled = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(lista));
        } catch (JRException e)
        {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, e);
        }
    }*/
    
    public static void generarPDF (Reserva auxReserva){
        try {
            List lista = new ArrayList();
            String auxNomCliente = auxReserva.getCliente().getApellido() + ", " + auxReserva.getCliente().getNombre();
            String auxNomReporte = "reportePDF_" + String.valueOf(auxReserva.getIdReserva()) + ".pdf";
            String auxStringFile = "C\\reporte\\" + auxNomReporte;
            
            ItemReserva auxItem = new ItemReserva(
                    auxReserva.getImporte().toString(),
                    auxReserva.getVigencia().toString(),
                    auxReserva.getFecha_reservado().toString(),
                    auxReserva.getPrecio_fecha_reservado().toString(),
                    String.valueOf(auxReserva.getIdReserva()),
                    auxNomCliente,
                    String.valueOf(auxReserva.getInmueble().getIdInmueble()));
            
            //++++++++++++++++++++++++++++++++++++
            //convertir auxReserva a ItemReserva
            
            
            //++++++++++++++++++++++++++++++++++++
            lista.add(auxItem);
            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("Cliente", auxNomCliente);
            parametros.put("Telefono",auxReserva.getCliente().getTelefono());
            
            report = (JasperReport) JRLoader.loadObjectFromFile("./src/Reportes/miReporte4.jasper");
            reportFilled = JasperFillManager.fillReport(report,
                    parametros, new JRBeanCollectionDataSource(lista));
            
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, reportFilled);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(auxStringFile));
            exporter.exportReport();
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void imprimirCatalogo (List<ItemCatalogo> lista,String cliente,String telefono){
        try {
            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("Cliente", cliente);
            parametros.put("Telefono",telefono);            
            report = (JasperReport) JRLoader.loadObjectFromFile("./src/Reportes/miReporte3.jasper");            
            reportFilled = JasperFillManager.fillReport(report,
                    parametros, new JRBeanCollectionDataSource(lista));                                    
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex) ;
        }
    }
}
