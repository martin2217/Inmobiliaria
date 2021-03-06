/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

//import javax.swing.JPanel;

import Controlador.ConexionUtil;

import Gestor.*;

import Modelo.Barrio;
import Modelo.Cliente;

import Modelo.Inmueble;
import Modelo.Propietario;
import Modelo.Provincia;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.JTextComponent;
//import javax.swing.DefaultComboBoxModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author germa
 */

public class ModificacionNoUsado extends javax.swing.JPanel {

    /**
     * Creates new form Alta
     */
    List<File> archivos = new ArrayList<File>();
    private Inmueble inmueble;
    public ModificacionNoUsado(Inmueble inmueble) {
        
        initComponents();
        this.inmueble=inmueble;
        llenarDatos();
    }
    
    private void llenarDatos(){
        DecimalFormat df = new DecimalFormat("#.00");
        jLabel3.setText(String.valueOf(inmueble.getIdInmueble()));
        jTextCalle.setText(inmueble.getCalle());
        jTextPiso.setText(String.valueOf( inmueble.getPiso()));
        jTextAntiguedad.setText(String.valueOf(inmueble.getAntiguedad()));
        jTextBanio.setText(String.valueOf(inmueble.getBanios()));
        jTextDepartamento.setText(String.valueOf(inmueble.getDepto()));
        jTextDormitorio.setText(String.valueOf(inmueble.getCant_dormitorios()));
        jTextFondo.setText(String.valueOf(inmueble.getFondo()));
        jTextFrente.setText(String.valueOf(inmueble.getFrente()));
        jTextMontoReserva.setText(String.valueOf(inmueble.getMontoReserva()));
        jTextNumero.setText(String.valueOf(inmueble.getNroCalle()));
        jTextObservaciones.setText(inmueble.getObservaciones());
        jTextPrecioVenta.setText(String.valueOf(inmueble.getMontoVenta()));
        jTextSuperficie.setText(String.valueOf(inmueble.getSuperficie()));
        jTextTelefono.setText(inmueble.getTelefono());
        
        try{  switch(inmueble.getVigenciaReserva()){
            case 1: jTextVigencia.setText("Si"); break;
            default: jTextVigencia.setText("No"); break;
        }} catch(Exception e){ String a=e.toString();}
        
        /* comboBox_provincia.setSelectedItem(inmueble.getBarrio().getLocalidad().getProvincia());
        comboBox_ciudad.setSelectedItem(inmueble.getBarrio().getLocalidad());
        comboBox_barrio.setSelectedItem(inmueble.getBarrio());*/
        
        //System.out.println(inmueble.getBarrio().getIdBarrio());
        jCheckBoxAguaCaliente.setSelected(inmueble.isAguaCaliente());
        jCheckBoxAguaCorriente.setSelected(inmueble.isAguaCorriente());
        jCheckBoxCloaca.setSelected(inmueble.isCloacas());
        jCheckBoxCochera.setSelected(inmueble.isEstado_vendido());
        jCheckBoxGaraje.setSelected(inmueble.isGarage());
        jCheckBoxGasNatural.setSelected(inmueble.isGasNatural());
        jCheckBoxLavadero.setSelected(inmueble.isLavadero());
        jCheckBoxPatio.setSelected(inmueble.isPatio());
        jCheckBoxPavimento.setSelected(inmueble.isPavimento());
        jCheckBoxPiscina.setSelected(inmueble.isPiscina());
        jCheckBoxPropiedadHorizontal.setSelected(inmueble.isPropiedadHorizontal());
        try{
            buscarimagenes(jLabel3.getText());
        }catch(Exception ex)
        {
            System.out.println("error en buscar imagenes");
        }
        cargarimagenes();
        
    }
    
    public void cargarimagenes(){
        
        try{
            if(jLabel25.getText()=="foto"){
                File a=archivos.get(0);
                ImageIcon icon = new ImageIcon(a.toURL());
                /*icon.getImage()
                Icon icono=new ImageIcon(a.toURL());
                i
                jLabel25.setIcon(icono);*/
                int w=jLabel25.getWidth();
                int h=jLabel25.getHeight();
                
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(100, 83, 30));
                
                jLabel25.setIcon(icono);
                jLabel25.setText(archivos.get(0).getName());
            }
            
            if(jLabel23.getText()=="foto"){
                
                ImageIcon icon = new ImageIcon(archivos.get(1).toURL());
                
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(100,
                        83, 30));
                
                jLabel23.setIcon(icono);
                jLabel23.setText(archivos.get(1).getName());
            }
            
            if(jLabel24.getText()=="foto"){
                
                ImageIcon icon = new ImageIcon(archivos.get(2).toURL());
                
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(180,
                        150, 30));
                
                jLabel24.setIcon(icono);
                jLabel24.setText(archivos.get(2).getName());
                
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    private void buscarimagenes(String id) throws IOException{
        File ruta=new File("C:\\imagenes\\");
        
        FilenameFilter begin=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(jLabel3.getText().trim());
            }
        };
        File[] files=ruta.listFiles(begin);
        for (File file :files){
            archivos.add(file);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextPrecioVenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextFrente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextSuperficie = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextAntiguedad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        comboBox_barrio = new javax.swing.JComboBox<>();
        jTextFondo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextCalle = new javax.swing.JTextField();
        jTextDormitorio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jTextBanio = new javax.swing.JTextField();
        jTextPiso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextDepartamento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBox_provincia = new javax.swing.JComboBox();
        comboBox_ciudad = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextObservaciones = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jTextMontoReserva = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextVigencia = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jCheckBoxGaraje = new javax.swing.JCheckBox();
        jCheckBoxPavimento = new javax.swing.JCheckBox();
        jCheckBoxPatio = new javax.swing.JCheckBox();
        jCheckBoxCloaca = new javax.swing.JCheckBox();
        jCheckBoxPiscina = new javax.swing.JCheckBox();
        jCheckBoxGasNatural = new javax.swing.JCheckBox();
        jCheckBoxAguaCaliente = new javax.swing.JCheckBox();
        jCheckBoxCochera = new javax.swing.JCheckBox();
        jCheckBoxLavadero = new javax.swing.JCheckBox();
        jCheckBoxPropiedadHorizontal = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jCheckBoxAguaCorriente = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Sacarfotos = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1006, 582));
        setMinimumSize(new java.awt.Dimension(1006, 582));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Alta de Inmueble");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 155, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Identificador de Inmueble:");
        add(jLabel2);
        jLabel2.setBounds(6, 40, 159, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("000000001");
        add(jLabel3);
        jLabel3.setBounds(177, 40, 124, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(922, 561, 128, 34);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(6, 561, 128, 34);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos edilicios", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setMaximumSize(new java.awt.Dimension(725, 235));
        jPanel3.setMinimumSize(new java.awt.Dimension(725, 235));

        jTextPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPrecioVenta.setName("Precio de Venta"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Orientación:");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "norte", "sur", "este", "oeste", "noreste", "noroeste", "sureste", "suroeste" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Frente:");

        jTextFrente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFrente.setName("Frente"); // NOI18N
        jTextFrente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFrenteKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Superficie:");

        jTextSuperficie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextSuperficie.setName("Superficie"); // NOI18N
        jTextSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSuperficieKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Antigüedad:");

        jTextAntiguedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAntiguedad.setName("Antigüedad"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Fondo:");

        comboBox_barrio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox_barrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_barrioActionPerformed(evt);
            }
        });

        jTextFondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFondo.setName("Fondo"); // NOI18N
        jTextFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFondoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Calle:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Dormitorios:");

        jTextCalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextCalle.setName("Calle"); // NOI18N

        jTextDormitorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextDormitorio.setName("Dormitorios"); // NOI18N
        jTextDormitorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDormitorioKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Número:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Baños:");

        jTextNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextNumero.setName("Numero de Calle"); // NOI18N

        jTextBanio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBanio.setName("Baños"); // NOI18N

        jTextPiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPiso.setName("Piso"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Piso:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Departamento:");

        jTextDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextDepartamento.setName("Numero de Departamento"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tipo de inmueble:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Provincia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ciudad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Barrio");

        comboBox_provincia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox_provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
        for(Provincia pro: GestorProvincia.get().buscarProvincia()){
            comboBox_provincia.addItem(pro.getNombre());
        }
        comboBox_provincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_provinciaItemStateChanged(evt);
            }
        });
        comboBox_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_provinciaActionPerformed(evt);
            }
        });

        comboBox_ciudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox_ciudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_ciudadItemStateChanged(evt);
            }
        });
        comboBox_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_ciudadActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L/local-oficina", "C/casa", "D/departamento", "T/terreno", "Q/quinta", "G/galpón" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Precio de Venta:");

        jTextObservaciones.setColumns(20);
        jTextObservaciones.setRows(5);
        jTextObservaciones.setName("Observaciones"); // NOI18N
        jScrollPane1.setViewportView(jTextObservaciones);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Observaciones:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextMontoReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextMontoReserva.setName("Monto de la Reserva"); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Monto de Reserva");

        jTextVigencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextVigencia.setName("Vigencia de la Reserva"); // NOI18N
        jTextVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVigenciaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Vigencia de la Reserva");

        jCheckBoxGaraje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxGaraje.setText("Garaje");

        jCheckBoxPavimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxPavimento.setText("Pavimento");

        jCheckBoxPatio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxPatio.setText("Patio");

        jCheckBoxCloaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxCloaca.setText("Cloaca");

        jCheckBoxPiscina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxPiscina.setText("Piscina");

        jCheckBoxGasNatural.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxGasNatural.setText("Gas Natural");

        jCheckBoxAguaCaliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxAguaCaliente.setText("Agua Caliente");

        jCheckBoxCochera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxCochera.setText("Cochera");

        jCheckBoxLavadero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxLavadero.setText("Lavadero");

        jCheckBoxPropiedadHorizontal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxPropiedadHorizontal.setText("Propiedad Horizontal");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Teléfono");

        jTextTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextTelefono.setName("Teléfono"); // NOI18N

        jCheckBoxAguaCorriente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxAguaCorriente.setText("Agua Corriente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextBanio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBox_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBox_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel8)
                                        .addGap(20, 20, 20)
                                        .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFrente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel15))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jTextSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jTextDormitorio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxCloaca)
                                            .addComponent(jCheckBoxAguaCaliente)
                                            .addComponent(jCheckBoxAguaCorriente))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jCheckBoxPropiedadHorizontal)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxPatio)
                                            .addComponent(jCheckBoxPiscina)
                                            .addComponent(jCheckBoxCochera))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxPavimento)
                                            .addComponent(jCheckBoxLavadero)
                                            .addComponent(jCheckBoxGasNatural)))
                                    .addComponent(jCheckBoxGaraje))
                                .addGap(64, 64, 64)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBox_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(comboBox_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboBox_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22)
                    .addComponent(jTextVigencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextMontoReserva)
                        .addComponent(jTextBanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel14)
                            .addComponent(jTextFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jTextSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jTextFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDormitorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBoxPavimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxLavadero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBoxGaraje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxPropiedadHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBoxPatio)
                                    .addComponent(jCheckBoxAguaCaliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBoxPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxAguaCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBoxCochera, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxGasNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxCloaca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        add(jPanel3);
        jPanel3.setBounds(6, 63, 751, 456);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton2.setText("Cargar Foto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel23.setText("foto");

        jLabel24.setText("foto");

        jLabel25.setText("foto");

        Sacarfotos.setText("Sacar todas");
        Sacarfotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacarfotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sacarfotos)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(Sacarfotos)))
        );

        add(jPanel4);
        jPanel4.setBounds(789, 63, 265, 462);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img_general2.jpg"))); // NOI18N
        add(jLabel27);
        jLabel27.setBounds(0, 0, 1060, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GestorVentanas.get().remove(this);
        GestorVentanas.get().menuVolver();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alta (){
        java.util.Date d = new java.util.Date();
        java.sql.Date date2 = new java.sql.Date(d.getTime());
        //Date now = new Date(System.currentTimeMillis());
        //SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Cliente cli = new Cliente(1);
        Propietario prop = new Propietario(1);
        //Barrio barri = new Barrio(101);
        Barrio barri = (Barrio) comboBox_barrio.getSelectedItem();
        Inmueble aux = new Inmueble(
                Integer.parseInt(jLabel3.getText()),
                cli,
                prop,
                barri,
                jTextCalle.getText(),
                Integer.parseInt(jTextNumero.getText()),
                Integer.parseInt(jTextPiso.getText()),
                Integer.parseInt(jTextDepartamento.getText()),
                jComboBox4.getSelectedItem().toString(),
                Float.parseFloat(jTextPrecioVenta.getText()),
                (String)jComboBox5.getSelectedItem(),
                Integer.parseInt(jTextFrente.getText()),
                Integer.parseInt(jTextFondo.getText()),
                Integer.parseInt(jTextSuperficie.getText()),
                "alta",
                Integer.parseInt(jTextMontoReserva.getText()),
                Integer.parseInt(jTextVigencia.getText()),
                Integer.parseInt(jTextPrecioVenta.getText()),
                date2,
                //se cargan los campos que se agregaron a inmuebles.
                Integer.parseInt(jTextDormitorio.getText()),
                jCheckBoxPropiedadHorizontal.isSelected(),
                Float.parseFloat( jTextAntiguedad.getText()),
                Integer.parseInt(jTextBanio.getText()),
                jCheckBoxGaraje.isSelected(),
                jCheckBoxPatio.isSelected(),
                jCheckBoxAguaCorriente.isSelected(),
                jCheckBoxPiscina.isSelected(),
                jCheckBoxCloaca.isSelected(),
                jCheckBoxGasNatural.isSelected(),
                jCheckBoxPavimento.isSelected(),
                jCheckBoxLavadero.isSelected(),
                jCheckBoxAguaCaliente.isSelected(),
                jTextTelefono.getText(),
                jTextObservaciones.getText()
        );
        GestorAlta.altaInmueble(aux);
    }
    
    private void limpiarPanelAlta (){
        Component [] arrayCompo = jPanel3.getComponents();
        
	for (Component component : arrayCompo) {
		if(component instanceof  JTextField) ((JTextField)component).setText("");
                if(component instanceof  JCheckBox) ((JCheckBox)component).setSelected(false);
                if(component instanceof  JTextArea) ((JTextArea)component).setText("");
	}
    }
    
    private boolean validarVacios (){
        Component [] arrayCompo = jPanel3.getComponents();
        boolean vacio = false;
        
        for (Component component : arrayCompo) {
            if(component instanceof  JTextField){
                if ( ( (JTextField) component).getText().trim().length() == 0 ){
                    vacio = true;
                }
            }
        }
        return vacio;
    }
    
    private boolean validarVigencia (){
        String jtextvigencia = jTextVigencia.getText();
        
        int vigencia = 0;
        boolean mal = false;
        
        if (jtextvigencia.length() == 0){
            mal = true;
        }
        else{
            vigencia = Integer.parseInt(jtextvigencia);
            
            if(!(vigencia > 0)){
                mal = true;
            }
        }
        return mal;
    }
    
    private boolean validarPrecio (){
        String jtextprecio = jTextPrecioVenta.getText();
        boolean mal = false;
        int precio = 0;
        
        if (jtextprecio.length() == 0){
            mal = true;
        }
        else{
            precio = Integer.parseInt(jtextprecio);
            if(! (precio  > 0)){
                mal = true;
            }
        }
        return mal;
    }

    private boolean montoReserva (){
        String jtextmonto = jTextMontoReserva.getText();
        boolean mal = false;
        int monto = 0;
        
        if (jtextmonto.length() == 0){
            mal = true;
        }
        else{
            monto = Integer.parseInt(jtextmonto);
            if(! (monto  > 0)){
                mal = true;
            }
        }
        return mal;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String cadenaError = "";
        
        if (validarVacios()){
            cadenaError += "No debe haber campos vacios.\n";
        }
        
        if (validarVigencia()){
            cadenaError += "La vigencia no debe ser vacia, 0 o negativa.\n";
        }
        
        if (validarPrecio()){
            cadenaError += "El precio no debe ser vacio, 0 o negativo.\n";
        }
        
        if (montoReserva()){
            cadenaError += "La reserva no debe ser vacia, 0 o negativa.\n";
        }
        
        if(cadenaError.length() != 0){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,cadenaError,"Error", JOptionPane.INFORMATION_MESSAGE);
        }
        if(cadenaError.length() == 0){
           /* alta();            
            jLabel3.setText(Integer.toString(maxIdInmobiliaria()));*/
            limpiarPanelAlta();
            /* ver si poner un volver a otra ventana*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void validarSoloNumeros (java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar(); 
        if(Character.isLetter(c)) { 
              getToolkit().beep();                
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Ingresa Solo Numeros");                
          } 
    }
    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int resultado;
        
        
        CargarFoto ventana = new CargarFoto();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        
        ventana.jFCFoto.setFileFilter(filtro);
        
        resultado= ventana.jFCFoto.showOpenDialog(null);
        
        
        if (JFileChooser.APPROVE_OPTION == resultado){
            File aux;
            aux=ventana.jFCFoto.getSelectedFile();
            String a=aux.getPath();
            int i=0;
            
            try{
                
                if("foto".equals(jLabel25.getText())){
                    ImageIcon icon = new ImageIcon(aux.toString());
                    
                    Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel25.getWidth(),
                            jLabel25.getHeight(), Image.SCALE_DEFAULT));
                    
                    jLabel25.setIcon(icono);
                    jLabel25.setText("no");
                    archivos.add(aux);
                }
                else if("foto".equals(jLabel23.getText())){
                    
                    ImageIcon icon = new ImageIcon(aux.toString());
                    
                    Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel23.getWidth(),
                            jLabel23.getHeight(), Image.SCALE_DEFAULT));
                    
                    jLabel23.setIcon(icono);
                    jLabel23.setText("no");
                    archivos.add(aux);
                    
                }
                else if("foto".equals(jLabel24.getText())){
                    
                    ImageIcon icon = new ImageIcon(aux.toString());
                    
                    Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel24.getWidth(),
                            jLabel24.getHeight(), Image.SCALE_DEFAULT));
                    
                    jLabel24.setIcon(icono);
                    jLabel24.setText("no");
                    archivos.add(aux);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Máximo de 3 fotos");
                }
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboBox_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_ciudadActionPerformed
        //
    }//GEN-LAST:event_comboBox_ciudadActionPerformed

    private void comboBox_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_provinciaActionPerformed
        //
    }//GEN-LAST:event_comboBox_provinciaActionPerformed

    private void jTextDormitorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDormitorioKeyTyped
        validarSoloNumeros(evt);
    }//GEN-LAST:event_jTextDormitorioKeyTyped

    private void jTextFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFondoKeyTyped
        validarSoloNumeros(evt);
    }//GEN-LAST:event_jTextFondoKeyTyped

    private void jTextSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSuperficieKeyTyped
        validarSoloNumeros(evt);
    }//GEN-LAST:event_jTextSuperficieKeyTyped

    private void jTextFrenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFrenteKeyTyped
        validarSoloNumeros(evt);
    }//GEN-LAST:event_jTextFrenteKeyTyped

    private void jTextVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVigenciaActionPerformed

    private void SacarfotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacarfotosActionPerformed
        // TODO add your handling code here:
        jLabel23.setIcon(null);
        jLabel23.setText("foto");
         jLabel24.setIcon(null);
        jLabel24.setText("foto");
         jLabel25.setIcon(null);
        jLabel25.setText("foto");
        for(int i=0;i<archivos.size();i++)
        archivos.remove(i);
    }//GEN-LAST:event_SacarfotosActionPerformed

    private void comboBox_barrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_barrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_barrioActionPerformed

    private void comboBox_ciudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_ciudadItemStateChanged
              
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(comboBox_ciudad.getSelectedIndex()>0){
                comboBox_barrio.setModel(new DefaultComboBoxModel(GestorBarrio.get().buscarBarrioPorCiudad(comboBox_ciudad.getSelectedItem().toString())));
            }
            else{
                comboBox_barrio.setModel(new DefaultComboBoxModel(new String[]{""}));
            }
        }
    }//GEN-LAST:event_comboBox_ciudadItemStateChanged

    private void comboBox_provinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_provinciaItemStateChanged
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(comboBox_provincia.getSelectedIndex()>0){
                comboBox_barrio.setModel(new DefaultComboBoxModel(new String[]{""}));
                comboBox_ciudad.setModel(new DefaultComboBoxModel(GestorLocalidad.get().buscarLocalidadesPorProvincia(comboBox_provincia.getSelectedItem().toString())));
                
            }
            else{
                comboBox_ciudad.setModel(new DefaultComboBoxModel(new String[]{""}));
                comboBox_barrio.setModel(new DefaultComboBoxModel(new String[]{""}));
            }
        }
    }//GEN-LAST:event_comboBox_provinciaItemStateChanged
                 
    /*private int maxIdInmobiliaria (){
        Session session;
        session=ConexionUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Inmueble.class);
        criteria.add(Restrictions.isNotNull("idInmueble"));
        criteria.setProjection(
            Projections.projectionList()
                .add(Projections.max("idInmueble")
                )
        );
                
        if (criteria.list().get(0) != null){               
            return  (int) criteria.list().get(0) + 1; 
        }
        else            
            return 1;   
        
        
    }*/

    private int maxIdCliente (){
        Session session;
        session=ConexionUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.isNotNull("idCliente"));
        criteria.setProjection(
            Projections.projectionList()
                .add(Projections.max("idCliente")
                )
        );
                
        if (criteria.list().get(0) != null){               
            return  (int) criteria.list().get(0) + 1; 
        }
        else            
            return 1;                   
    } 
    
    private void guardarimagen(String id,int index){
                String ruta="C:\\imagenes\\"+id+"_0.jpg";
               File f = new File(ruta);
               int i=1;
                    while(f.exists()) {//ver si existe la ruta 
                        ruta="C:\\imagenes\\"+id+"_"+i+".jpg";
                        f=new File(ruta);
                        i++;
                    }
                try{
                    File destino = new File(ruta);
                     InputStream in = new FileInputStream(archivos.get(index).getPath());
                        OutputStream out = new FileOutputStream(destino);
                                
                        byte[] buf = new byte[1024];
                        int len;

                        while ((len = in.read(buf)) > 0) {
                                out.write(buf, 0, len);
                        }
                
                        in.close();
                        out.close();
                } catch (IOException ioe){
                        ioe.printStackTrace();
                }
 
            }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sacarfotos;
    private javax.swing.JComboBox<String> comboBox_barrio;
    private javax.swing.JComboBox<String> comboBox_ciudad;
    private javax.swing.JComboBox<String> comboBox_provincia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBoxAguaCaliente;
    private javax.swing.JCheckBox jCheckBoxAguaCorriente;
    private javax.swing.JCheckBox jCheckBoxCloaca;
    private javax.swing.JCheckBox jCheckBoxCochera;
    private javax.swing.JCheckBox jCheckBoxGaraje;
    private javax.swing.JCheckBox jCheckBoxGasNatural;
    private javax.swing.JCheckBox jCheckBoxLavadero;
    private javax.swing.JCheckBox jCheckBoxPatio;
    private javax.swing.JCheckBox jCheckBoxPavimento;
    private javax.swing.JCheckBox jCheckBoxPiscina;
    private javax.swing.JCheckBox jCheckBoxPropiedadHorizontal;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAntiguedad;
    private javax.swing.JTextField jTextBanio;
    private javax.swing.JTextField jTextCalle;
    private javax.swing.JTextField jTextDepartamento;
    private javax.swing.JTextField jTextDormitorio;
    private javax.swing.JTextField jTextFondo;
    private javax.swing.JTextField jTextFrente;
    private javax.swing.JTextField jTextMontoReserva;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextArea jTextObservaciones;
    private javax.swing.JTextField jTextPiso;
    private javax.swing.JTextField jTextPrecioVenta;
    private javax.swing.JTextField jTextSuperficie;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextVigencia;
    // End of variables declaration//GEN-END:variables
}
