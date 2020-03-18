/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import DATOS.MetodosBD;
import DATOS.Pool;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class BUSCAR_USUARIOS extends javax.swing.JInternalFrame {
     
    
    private void centrarVentana() {
                // Se obtienen las dimensiones en pixels de la pantalla.
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

                // Se obtienen las dimensiones en pixels de la ventana.
                Dimension ventana = getSize();

                // Una cuenta para situar la ventana en el centro de la pantalla.
                setLocation((pantalla.width - ventana.width) / 2,
                                (pantalla.height - ventana.height) / 3);
        }
    
    public BUSCAR_USUARIOS() {
        this.tbl_consulta = tbl_consulta;
        
        initComponents();
         metodosbd.Buscar_usu(txt_buscar.getText(), combo_filtro.getSelectedItem().toString(), tbl_consulta);
         this.centrarVentana();
         
    }
   
   //REGISTRO_NUEVO_USUARIO nuevo_usuario;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_consulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        combo_filtro = new javax.swing.JComboBox();
        txt_buscar = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Buscar usuarios");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR USUARIOS");
        jLabel1.setOpaque(true);

        tbl_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID USUARIO", "NOMBRE", "APELLIDO MATERNO", "APELLIDO PATERNO", "DNI", "PASSWORD", "USUARIO", "ROL", "ESTADO", "FECHA REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_consultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_consulta);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        btn_buscar.setText("Buscar!");
        btn_buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        combo_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "DNI", " " }));

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        btn_editar.setText("Editar usuario");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btn_editar)
                        .addGap(119, 119, 119)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
MetodosBD metodosbd = new MetodosBD();
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        metodosbd.Buscar_usu(txt_buscar.getText(), combo_filtro.getSelectedItem().toString(), tbl_consulta);        
    }//GEN-LAST:event_btn_buscarActionPerformed

 
    
    
    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked

        
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
            REGISTRO_NUEVO_USUARIO nuevo_usuario= new REGISTRO_NUEVO_USUARIO();
            //MENU_USUARIO_PRINCIPAL_1.Escritorio.add(nuevo_usuario);
            nuevo_usuario.getCalendario();
            
            //String fecdate=null;
        int fila = tbl_consulta.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null,"no se ha selecionado ninguna fila");
            
        } else{
            //String fecdate;
            String fecdate=null;
             nuevo_usuario.toFront();
             nuevo_usuario.setVisible(true);
             nuevo_usuario.txt_nombre.setText(String.valueOf(tbl_consulta.getValueAt(fila,1).toString()));
             nuevo_usuario.txt_apellido_paterno.setText(String.valueOf(tbl_consulta.getValueAt(fila,2).toString()));
             nuevo_usuario.txt_apellido_materno.setText(String.valueOf(tbl_consulta.getValueAt(fila,3).toString()));
             nuevo_usuario.jComboBox2.setSelectedItem(String.valueOf(tbl_consulta.getValueAt(fila, 7).toString()));
             nuevo_usuario.jComboBox3.setSelectedItem(String.valueOf(tbl_consulta.getValueAt(fila, 8).toString()));
             nuevo_usuario.txt_fecha.setText(String.valueOf(tbl_consulta.getValueAt(fila,9).toString()));
             nuevo_usuario.txt_dni.setText(String.valueOf(tbl_consulta.getValueAt(fila,4).toString()));
             nuevo_usuario.txt_password.setText(String.valueOf(tbl_consulta.getValueAt(fila,5).toString()));
             nuevo_usuario.txt_usuario.setText(String.valueOf(tbl_consulta.getValueAt(fila,6).toString()));
//          
             
             fecdate=nuevo_usuario.txt_fecha.getText();
             MENU_USUARIO_PRINCIPAL_1.Escritorio.add(nuevo_usuario);
             nuevo_usuario.toFront();
            try{java.util.Date fechaParseada= new SimpleDateFormat("yyyy-MM-dd").parse(fecdate);
            nuevo_usuario.getCalendario().setDate(fechaParseada);}  
            
            catch(Exception e){
                System.out.println(fecdate);            }
        }
          nuevo_usuario.getBtn_guardar();
          nuevo_usuario.getJcb_automatico();
  
         
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void tbl_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_consultaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_consultaMouseClicked
    public JTable getTbl_consulta() {
        return tbl_consulta;
    }

    public void setTbl_consulta(JTable tbl_consulta) {
        this.tbl_consulta = tbl_consulta;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JComboBox combo_filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_consulta;
    public static javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    
    
}
