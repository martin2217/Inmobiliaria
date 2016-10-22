/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Martin
 */
public class GestorVentanas extends javax.swing.JFrame {
   
    // Forma de SINGLETON
    private static final GestorVentanas SELF = new GestorVentanas();
    //private V() {}
    public static GestorVentanas get(){
        return SELF;
    }
    
    /**
     * Creates new form VentanaPrincipal
     */
    private GestorVentanas() {
        initComponents();
    }
    
    private JPanel menu;
    private JPanel consultaInmueble;
    private JPanel altaInmueble;
    private JPanel aux;
    
    
    // No usado aún
    public void limpiar(){
        //SELF.removeAll(); NOOOO, elimina nose que masss
        remove(aux);
    }
    
    public void menu(){
        menu = new Menu();
        add(menu);
        revalidate();
        repaint();
    }
    public void menuVolver(){
        menu.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void salir(){
        System.exit(0);
    }
    
    public void altaInmueble(){
        altaInmueble= new Alta();
        add(altaInmueble);
        revalidate();
        repaint();
    }
    
    public void consultaInmueble(){
        consultaInmueble= new Consulta();
        add(consultaInmueble);
        revalidate();
        repaint();
    }
    
    /*
    public void listarCompetencias(){
        menu.setVisible(false);
        listarCD=new ListarCompetencias();
        add(listarCD);
        listarCD.setVisible(true);
        revalidate();
        repaint();
    }
    public void listarCompetenciasSalir(){
        remove(listarCD);
        menuVolver();
    }
    public void listarCompetenciasVolver(){
        //ListarCompetencias.botonBuscar();
        //listarCD.botonBuscar();
        listarCD.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void altaCompetencia(){
        aux=new AltaCompetencia();
        aux.setVisible(true);
        add(aux);
        revalidate();
        repaint();
    }
    public void verCompetencia(CompetenciaAux compAux){
        listarCD.setVisible(false);
        verComp = new VerCompetencia(compAux);
        add(verComp);
        revalidate();
        repaint();
    }
    public void verCompetenciaVolver(){
        verComp.setVisible(true);
        revalidate();
        repaint();
    }
    public void verCompetenciaRecargar(CompetenciaAux compAux){
        remove(verComp);
        verComp = new VerCompetencia(compAux);
        add(verComp);
        revalidate();
        repaint();
    }
    public void verCompetenciaSalir(){
        remove(verComp);
        listarCompetenciasSalir();
    }
    
    public void mostrarTablaPosiciones(CompetenciaAux compAux){
        verComp.setVisible(false);
        aux = new MostrarTablaPosiciones(compAux);
        aux.setVisible(true);
        add(aux);
        revalidate();
        repaint();
    }
    public void mostrarFixture(CompetenciaAux compAux){
        verComp.setVisible(false);
        aux = new MostrarFixture(compAux);
        aux.setVisible(true);
        add(aux);
        revalidate();
        repaint();
    }
    public void mostrarFixtureVolver(CompetenciaAux compAux){
        remove(aux);
        aux = new MostrarFixture(compAux);
        aux.setVisible(true);
        add(aux);
        revalidate();
        repaint();
    }
    
    public void gestionarResultados(CompetenciaAux compAux, RondaAux rondaAux, PartidoAux partidoAux){
        aux.setVisible(false);
        aux2 = new GestionarResultados(compAux, rondaAux, partidoAux);
        add(aux2);
        revalidate();
        repaint();
    }
    public void gestionarResultadosVolver(){
        aux.setVisible(true);
        revalidate();
        repaint();
    }
    public void gestionarResultadosSalir(){
        remove(aux);
        verCompetenciaSalir();
    }
    
    public void listarParticipantes(CompetenciaAux compAux){
        verComp.setVisible(false);
        aux = new ListarParticipantes(compAux);
        aux.setVisible(true);
        add(aux);
        revalidate();
        repaint();
    }
    public void listarParticipantesVolver(){
        aux.setVisible(true);
        revalidate();
        repaint();
    }
    public void listarParticipantesVolver2(CompetenciaAux compAux){
        remove(aux);
        listarParticipantes(compAux);
    }
    public void listarParticipantesSalir(){
        remove(aux);
        verCompetenciaSalir();
    }
    
    public void altaParticipante(CompetenciaAux var){
        aux.setVisible(false);
        aux2 = new AltaParticipante(var);
        add(aux2);
        revalidate();
        repaint();
    }
    
    
    public void integrantes(JPanel panel){
        integrantesAux=panel;
        integrantesAux.setVisible(false);
        add(integrantes);
        revalidate();
        repaint();
    }
    public void integrantesVolver(){
        remove(integrantes);
        integrantesAux.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void salir(){
        System.exit(0);
    }
    
    /**
     * Creación de la ventana
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        /*
        // ICONOS de aplicación
        final List<Image> icons = new ArrayList<>();
        
        ImageIcon icon16 = new ImageIcon(getClass().getResource("/imagenes/img_icono16x16.png"));
        ImageIcon icon32 = new ImageIcon(getClass().getResource("/imagenes/img_icono32x32.png"));
        ImageIcon icon64 = new ImageIcon(getClass().getResource("/imagenes/img_icono64x64.png"));
        
        icons.add(icon16.getImage());
        icons.add(icon32.getImage());
        icons.add(icon64.getImage());
        
        setIconImages(icons);
        */
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setPreferredSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Inmobiliaria");
        
        
        menu=new Menu();
        menu.setVisible(false);
        add(menu);
        
        aux=new Bienvenido();
        aux.setVisible(true);
        add(aux);
        
        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            get().setVisible(true);
        });
    }
    
}
