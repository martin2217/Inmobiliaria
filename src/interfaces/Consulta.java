
package interfaces;

import Gestor.*;
import Modelo.Inmueble;
import Modelo.ItemCatalogo;
import Modelo.Provincia;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;


public class Consulta extends javax.swing.JPanel {
    
    
    DefaultTableModel modelo;
    List<Inmueble> listaInmuebles;
    List<Inmueble> listaCatalogo;
    List<ItemCatalogo> listaItemCatalogo;
    
    public Consulta() {
        
        listaCatalogo= new ArrayList<>();
        listaItemCatalogo=new ArrayList<>();
        initComponents();
        definiendoTabla();
        modelo= (DefaultTableModel)jTable1.getModel();
        
    }

   
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonModificarInmueble = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBajaInmueble = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        textField_dormitorio = new javax.swing.JTextField();
        comboBox_provincia = new javax.swing.JComboBox();
        comboBox_ciudad = new javax.swing.JComboBox();
        comboBox_barrio = new javax.swing.JComboBox();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        comboBox_tipo_depto = new javax.swing.JComboBox();
        label4 = new javax.swing.JLabel();
        labelId1 = new javax.swing.JLabel();
        textField_precio_minimo = new javax.swing.JTextField();
        textField_precio_maximo = new javax.swing.JTextField();
        labelId2 = new javax.swing.JLabel();
        labelId3 = new javax.swing.JLabel();
        comboBox_estado = new javax.swing.JComboBox();
        label5 = new javax.swing.JLabel();
        jButtonAniadir = new javax.swing.JButton();
        jButtonGenerarCatalogo = new javax.swing.JButton();
        jButtonReservarInmueble = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        jButtonModificarInmueble.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonModificarInmueble.setText("Modificar");
        jButtonModificarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarInmuebleActionPerformed(evt);
            }
        });
        add(jButtonModificarInmueble);
        jButtonModificarInmueble.setBounds(324, 541, 133, 31);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "", "Propietario", "Localidad", "Dirección", "Superf.", "Precio", "Dormitorios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableColumn columna = jTable1.getColumnModel().getColumn(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);
        columna.setPreferredWidth(0);
        jTable1.setDragEnabled(true);
        jTable1.setFocusable(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(240, 80, 530, 400);

        jButtonBajaInmueble.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonBajaInmueble.setText("Eliminar");
        jButtonBajaInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaInmuebleActionPerformed(evt);
            }
        });
        add(jButtonBajaInmueble);
        jButtonBajaInmueble.setBounds(169, 541, 133, 31);

        jButtonAtras.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        add(jButtonAtras);
        jButtonAtras.setBounds(30, 541, 133, 31);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(218, 456));

        labelId.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelId.setText("Cantidad de dormitorios");

        textField_dormitorio.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        textField_dormitorio.setToolTipText("Ingrese solo números");
        ((AbstractDocument)textField_dormitorio.getDocument()).setDocumentFilter(new LimitadorTextField(2));

        comboBox_provincia.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        comboBox_provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
        for(Provincia pro: GestorProvincia.get().buscarProvincia()){
            comboBox_provincia.addItem(pro.getNombre());
        }
        comboBox_provincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_provinciaItemStateChanged(evt);
            }
        });

        comboBox_ciudad.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        comboBox_ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
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

        comboBox_barrio.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        comboBox_barrio.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
        comboBox_barrio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_barrioItemStateChanged(evt);
            }
        });

        label3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label3.setText("Barrio");

        label2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label2.setText("Ciudad");

        label1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label1.setText("Provincia");

        jButtonBuscar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        comboBox_tipo_depto.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        comboBox_tipo_depto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Local", "Casa", "Departamento", "Terreno", "Quinta", "Galpón" }));
        comboBox_tipo_depto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_tipo_deptoActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label4.setText("Tipo");

        labelId1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelId1.setText("Min");

        textField_precio_minimo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        textField_precio_minimo.setToolTipText("");
        ((AbstractDocument)textField_precio_minimo.getDocument()).setDocumentFilter(new LimitadorTextField(15));

        textField_precio_maximo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        textField_precio_maximo.setToolTipText("");
        ((AbstractDocument)textField_precio_maximo.getDocument()).setDocumentFilter(new LimitadorTextField(15));

        labelId2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelId2.setText("Precio");

        labelId3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        labelId3.setText("Max");

        comboBox_estado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        comboBox_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Alta", "Reservado","Vendido"}));

        label5.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        label5.setText("Estado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBox_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(textField_dormitorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(comboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBox_tipo_depto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelId1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_precio_minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelId3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_precio_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelId2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2)
                            .addComponent(label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBox_provincia, 0, 126, Short.MAX_VALUE)
                            .addComponent(comboBox_ciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(comboBox_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(comboBox_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3)
                    .addComponent(comboBox_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_tipo_depto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_dormitorio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelId2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField_precio_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField_precio_minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelId3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelId1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5))
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textField_dormitorio.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!Character.isDigit(keyChar)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
        textField_precio_minimo.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!Character.isDigit(keyChar)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
        textField_precio_maximo.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!Character.isDigit(keyChar)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });

        add(jPanel2);
        jPanel2.setBounds(20, 80, 210, 430);

        jButtonAniadir.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonAniadir.setText("Añadir a Catálogo");
        jButtonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirActionPerformed(evt);
            }
        });
        add(jButtonAniadir);
        jButtonAniadir.setBounds(607, 485, 140, 31);

        jButtonGenerarCatalogo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonGenerarCatalogo.setText("Generar Catálogo");
        jButtonGenerarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarCatalogoActionPerformed(evt);
            }
        });
        add(jButtonGenerarCatalogo);
        jButtonGenerarCatalogo.setBounds(628, 541, 133, 31);

        jButtonReservarInmueble.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonReservarInmueble.setText("Reservar");
        jButtonReservarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarInmuebleActionPerformed(evt);
            }
        });
        add(jButtonReservarInmueble);
        jButtonReservarInmueble.setBounds(475, 541, 133, 31);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta de Inmueble");
        add(jLabel2);
        jLabel2.setBounds(6, 6, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img_general.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(1, -4, 800, 610);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void jButtonModificarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarInmuebleActionPerformed
        int row = jTable1.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un inmueble",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(jTable1.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar sólo un inmueble",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            modelo = (DefaultTableModel)jTable1.getModel();
            
            for(int i=0; i<modelo.getRowCount(); i++){
                
                if((Boolean)modelo.getValueAt(i, 1).equals(Boolean.TRUE)){
                    Inmueble iaux;
                    iaux=listaInmuebles.get(i);
                    
                    modelo.removeRow(i);
                    i--;
                    GestorVentanas.get().remove(this);
                    // Ir a la pantalla de modificar
                    GestorVentanas.get().altaInmueble(iaux);
                }
            }
        }
    }//GEN-LAST:event_jButtonModificarInmuebleActionPerformed
    
    public boolean existeEnCatalogo(Inmueble in){
        int i, a;
        int b=in.getIdInmueble();
        
        for(i=0;i<listaItemCatalogo.size() ;i++){
            a=Integer.parseInt(listaItemCatalogo.get(i).getIdInmueble());
            if(a==b){
                return true;
            }
        }
        return false;
    }
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        GestorVentanas.get().remove(this);
        GestorVentanas.get().menuVolver();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        LimpiarTabla();
        // obtenemos una lista de objetos Inmuebles los que coinciden con los campos seleccionados
        listaInmuebles= GestorInmueble.get().buscarInmuebles(comboBox_provincia.getSelectedItem().toString(),
                comboBox_ciudad.getSelectedItem().toString(),comboBox_barrio.getSelectedItem().toString(),
                comboBox_tipo_depto.getSelectedItem().toString(), textField_dormitorio.getText(),
                textField_precio_minimo.getText(), textField_precio_maximo.getText(),
                comboBox_estado.getSelectedItem().toString());
        if(listaInmuebles.isEmpty())
            JOptionPane.showMessageDialog(null,"No se han encontrado resultados","Aviso",
                    JOptionPane.WHEN_IN_FOCUSED_WINDOW);
        else{
            // los cargamos en la tabla  perteneciente a la interfaz para que sean visualizados
            listaInmuebles.stream().forEach((inmuebles) -> {modelo.addRow(
                    new Object[]{Integer.toString(inmuebles.getIdInmueble()),false,
                        inmuebles.getPropietario().getNombre(),inmuebles.getBarrio().getLocalidad().getNombre(),
                        inmuebles.getDireccion(),Integer.toString(inmuebles.getSuperficie()),
                        Float.toString(inmuebles.getPrecio()),Integer.toString(inmuebles.getCant_dormitorios())});
            });
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBajaInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaInmuebleActionPerformed
       
        int bandera=0;
        
        modelo = (DefaultTableModel)jTable1.getModel();
        // obtenemos que checkbox han sido seleccionados
        for(int i=0; i<modelo.getRowCount(); i++){
            
            if((Boolean)modelo.getValueAt(i, 1).equals(Boolean.TRUE)){
                bandera++;
                int parametro=Integer.valueOf(modelo.getValueAt(i, 0).toString());
                // verificamos cual es el estado del inmueble para ver si puede o no ser eliminado
                switch (GestorInmueble.get().buscarInmueblePorId(parametro).getEstado()) {
                    case "Reservado":
                        JOptionPane.showMessageDialog(null,"No se pueden eliminar inmuebles reservados",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Alta":
                        GestorInmueble.get().borrarInmueble(parametro);
                        modelo.removeRow(i);
                        i--;
                        break;
                    default:
                        GestorInmueble.get().borrarInmuebleLogico(parametro);
                        modelo.removeRow(i);
                        i--;
                        break;
                }
            }
            if(bandera==0) {JOptionPane.showMessageDialog(null,"Debe seleccionar un inmueble",
                    "Error", JOptionPane.INFORMATION_MESSAGE); }
        }
    }//GEN-LAST:event_jButtonBajaInmuebleActionPerformed
    
    private void comboBox_tipo_deptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_tipo_deptoActionPerformed

    }//GEN-LAST:event_comboBox_tipo_deptoActionPerformed

    private void comboBox_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_ciudadActionPerformed
   
    }//GEN-LAST:event_comboBox_ciudadActionPerformed

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

    private void comboBox_barrioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_barrioItemStateChanged
      
    }//GEN-LAST:event_comboBox_barrioItemStateChanged

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

    private void jButtonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirActionPerformed
        int row = jTable1.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un inmueble",
                "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            modelo = (DefaultTableModel)jTable1.getModel();
            
            for(int i=0; i<modelo.getRowCount(); i++){
                if((Boolean)modelo.getValueAt(i, 1).equals(Boolean.TRUE)){
                    //JOptionPane.showMessageDialog(null,listaInmuebles.size(),"Éxito", JOptionPane.INFORMATION_MESSAGE);
                    Inmueble iaux;
                    iaux=listaInmuebles.get(i);
                    if(!existeEnCatalogo(iaux)){
                        modelo.removeRow(i);
                        i--;
                        listaItemCatalogo.add(new ItemCatalogo(iaux));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonAniadirActionPerformed

    private void jButtonGenerarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarCatalogoActionPerformed
        if(!listaItemCatalogo.isEmpty()){
            Reportes.Reportes.imprimirCatalogo(listaItemCatalogo,"cliente","011");
            Reportes.Reportes.verVisor("titulo");
        }
        else {
            JOptionPane.showMessageDialog(null,"Debe agregar algun inmueble al catalogo",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGenerarCatalogoActionPerformed

    private void jButtonReservarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarInmuebleActionPerformed
        
        modelo = (DefaultTableModel) jTable1.getModel();
        int bandera=0;
        int parametro_inmueble=0;
        // obtenemos los check seleccionados
        for(int i=0;i<modelo.getRowCount(); i++){
            if(modelo.getValueAt(i, 1).equals(Boolean.TRUE)){
                bandera++;
                parametro_inmueble= Integer.valueOf(modelo.getValueAt(i, 0).toString());
            }
        }
        // verificamos que solo se seleccione 1
        if(bandera>1 || bandera<1)
            JOptionPane.showMessageDialog(null,"Seleccione un inmueble",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        
        else{
            // pedimos el ingreso del importe de la vigencia y la cantidad de dias y verificamos 
            String importe_reserva = JOptionPane.showInputDialog("Ingrese el importe");
            
            if(importe_reserva!=null){
                String vigencia= JOptionPane.showInputDialog("Ingrese los dias de vigencia");
                if(vigencia!=null) {
                    if(importe_reserva.equals("")||vigencia.equals("")){
                        JOptionPane.showMessageDialog(null, "Debe completar ambos campos",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        try {
                            LimpiarTabla();
                            GestorReserva.get().actualizarEstado(parametro_inmueble,
                                    importe_reserva,vigencia);
                        } catch (MessagingException ex) {
                            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Valor Invalido",
                                    "Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonReservarInmuebleActionPerformed

    private void LimpiarTabla(){
       for (int i = 0; i < jTable1.getRowCount(); i++) {
           modelo.removeRow(i);
           i-=1;
       }
   }
    
    private void definiendoTabla(){
    //definicion de los tamaños y propiedades de las columnas de la tabla, hay una columna oculta que tiene el id del inmueble
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        
        TableColumn columna = jTable1.getColumnModel().getColumn(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);
        columna.setPreferredWidth(0);
        
        TableColumn columna1 = jTable1.getColumnModel().getColumn(1);
        columna1.setMaxWidth(35);
        columna1.setMinWidth(35);
        columna1.setPreferredWidth(35);
        
        TableColumn columna2 = jTable1.getColumnModel().getColumn(2);
        columna2.setMaxWidth(80);
        columna2.setMinWidth(70);
        columna2.setPreferredWidth(80);
        
        TableColumn columna3 = jTable1.getColumnModel().getColumn(3);
        columna3.setMaxWidth(130);
        columna3.setMinWidth(100);
        columna3.setPreferredWidth(100);
        
        TableColumn columna4 = jTable1.getColumnModel().getColumn(4);
        columna4.setMaxWidth(150);
        columna4.setMinWidth(100);
        columna4.setPreferredWidth(120);
        
        TableColumn columna5 = jTable1.getColumnModel().getColumn(5);
        columna5.setMaxWidth(55);
        columna5.setMinWidth(55);
        columna5.setPreferredWidth(55);
        
        TableColumn columna6 = jTable1.getColumnModel().getColumn(6);
        columna6.setMaxWidth(70);
        columna6.setMinWidth(70);
        columna6.setPreferredWidth(70);
        
        TableColumn columna7 = jTable1.getColumnModel().getColumn(7);
        columna7.setMaxWidth(70);
        columna7.setMinWidth(70);
        columna7.setPreferredWidth(70);
        
        for(int i=2; i< jTable1.getColumnModel().getColumnCount(); i++){
            jTable1.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
        
        jTable1.setRowHeight(20);
        
        // Para hacer el ordenamiento por columnas
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        
        }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBox_barrio;
    private javax.swing.JComboBox comboBox_ciudad;
    private javax.swing.JComboBox comboBox_estado;
    private javax.swing.JComboBox comboBox_provincia;
    private javax.swing.JComboBox comboBox_tipo_depto;
    private javax.swing.JButton jButtonAniadir;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBajaInmueble;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGenerarCatalogo;
    private javax.swing.JButton jButtonModificarInmueble;
    private javax.swing.JButton jButtonReservarInmueble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelId1;
    private javax.swing.JLabel labelId2;
    private javax.swing.JLabel labelId3;
    private javax.swing.JTextField textField_dormitorio;
    private javax.swing.JTextField textField_precio_maximo;
    private javax.swing.JTextField textField_precio_minimo;
    // End of variables declaration//GEN-END:variables
}
