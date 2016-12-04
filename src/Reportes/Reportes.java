/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;


import Modelo.ListaCatalogo;
import static java.sql.JDBCType.NULL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
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
    
    public static void imprimirCatalogo (){
        try {
            
            //JDialog viewer = new JDialog(new JFrame(), "Reporte", true);
            List lista = new ArrayList();
            
            for(int i=0;i<5;i++)
            {
                ListaCatalogo inmueble_aux = new ListaCatalogo("Santa fe", "Santa fe", "San Telmo", "Depto", Float.parseFloat("120.000"), "Sur", 120, "SI", "SI", "SI", "SI", "SI", "SI");
                lista.add(inmueble_aux);
            }
            
            //JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("catologo.jasper");                        
            
            //JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("catologo.jasper");                      
            //JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
            
            
            JasperPrint print = JasperFillManager.fillReport("C:\\Users\\germa\\OneDrive\\Documentos\\NetBeansProjects\\Inmobiliaria\\src\\Reportes\\catologo.jasper", null, new JRBeanCollectionDataSource(lista) );
            JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\germa\\OneDrive\\Documentos\\NetBeansProjects\\Inmobiliaria\\src\\Reportes\\catologo.jasper");
            JasperViewer.viewReport(print, false);
            
            //Map parametro = new HashMap();
            //parametro.put("cliente", "el que sea");
            
            //JasperViewer ver = new JasperViewer(jprint);
            //viewer.setSize(1000, 700);
            //viewer.setLocationRelativeTo(null);                       
            //viewer.getContentPane().add(jviewer);            
            //ver.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
