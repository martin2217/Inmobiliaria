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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author germa
 */
public class Reportes {
    
    public static void imprimirCatalogo () throws JRException{
        List lista = new ArrayList();
        
        for(int i=0;i<5;i++)
        {            
            ListaCatalogo inmueble_aux = new ListaCatalogo("Santa fe", "Santa fe", "San Telmo", "Depto", Float.parseFloat("120.000"), "Sur", 120, "SI", "SI", "SI", "SI", "SI", "SI");
            lista.add(inmueble_aux);
        }
        
        JasperReport reporte;
        //reporte = (JasperReport)JRLoader.loadObject("catalogo.jasper");
       
        reporte = JasperCompileManager.compileReport("catalogo.jasper");
             
        Map parametro = new HashMap();        
        //parametro.put("cliente", "el que sea");
        JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista) );
        JasperViewer.viewReport(jprint, false);
    }
    
}
