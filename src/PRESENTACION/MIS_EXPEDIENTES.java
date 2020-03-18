/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import DATOS.MetodosBD;
import LOGICA.ColorearFilas;
import LOGICA.RESULT_CBBOX_PROVEIDO_USU;
import LOGICA.RESULT_LISTAR_EXPE;
import static PRESENTACION.MENU_USUARIO_PRINCIPAL_1.Escritorio;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MIS_EXPEDIENTES extends javax.swing.JInternalFrame {

    PROVEIDOS proveido;
    public MIS_EXPEDIENTES() {
        
        initComponents();
        listar_mis_expe_auto();
        proveido=new PROVEIDOS();
        
    }
    MetodosBD metodosbd = new MetodosBD();

    public void Modificar_sesion (String usuario){
        lbl_sesion.setText(usuario);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_expedientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_sesion = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_proveido = new javax.swing.JButton();

        setClosable(true);
        setTitle("MIS EXPEDIENTES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MIS EXPEDIENTES");
        jLabel1.setOpaque(true);

        tbl_expedientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° EXP", "NOMBRE", "TIPO", "DETALLE", "PROVEIDO A", "FECHA", "N° DE INFORME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_expedientes);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("ACTUALIZAR");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("SESIÓN ACTIVA DE :");

        lbl_sesion.setText("NNNNNN");

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setText("Ver detalle...");

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setText("Responder");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_proveido.setText("Hacer proveido");
        btn_proveido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_proveido)
                                .addGap(42, 42, 42)
                                .addComponent(jButton5)
                                .addGap(50, 50, 50)
                                .addComponent(jButton4)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_sesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proveido))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        RESPONDER responder =new RESPONDER();
        //valor=
        
       int fila = tbl_expedientes.getSelectedRow();
        if(fila==-1){
             JOptionPane.showMessageDialog(null,"Seleccione un Expediente para Responder!");

             
        }
        else if (responder.isShowing()==false) {
            responder.txt_administrado.setText(String.valueOf(tbl_expedientes.getValueAt(fila, 1).toString()));
             Escritorio.add(responder);
            responder.show(); 
        }else {    
             
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Listar_usuario_cbbox (){
        MetodosBD metodosbd = new MetodosBD();
        
          LinkedList<RESULT_CBBOX_PROVEIDO_USU> listar_usuarios = new LinkedList<RESULT_CBBOX_PROVEIDO_USU>();
          listar_usuarios = metodosbd.listar_expe();
          String val1,val2,val3,val4,item;
        PROVEIDOS.cbbox_prov_usu.addItem("Seleccione una opción");
            for(int i =0; i<listar_usuarios.size(); i++)
            {
               
                   val1=listar_usuarios.get(i).getId_rol();
                   val2=listar_usuarios.get(i).getNombre();
                   val3=listar_usuarios.get(i).getAp_paterno();
                   val4=listar_usuarios.get(i).getUsuario();
               item=val1+" "+val2+" "+val3;
               PROVEIDOS.cbbox_prov_usu.addItem(item); 
            }
    }
    public void listar_mis_expe_auto(){
       MetodosBD metodosbd = new MetodosBD();
        DefaultTableModel tabla= (DefaultTableModel) tbl_expedientes.getModel();
 
          LinkedList<RESULT_LISTAR_EXPE> Listar_expe = new LinkedList<RESULT_LISTAR_EXPE>();
          Listar_expe = metodosbd.ver_mis_expe();
          tabla.setNumRows(0);
 
            for(int i =0; i<Listar_expe.size(); i++)
            {
               Object [] row = {
                   Listar_expe.get(i).getN_expe(),
                   Listar_expe.get(i).getNombre(),
                   Listar_expe.get(i).getTipo(),
                   Listar_expe.get(i).getDetalle(),
                   Listar_expe.get(i).getProveido_a(),
                   Listar_expe.get(i).getFecha(),
                   Listar_expe.get(i).getN_de_informe()};
               tabla.addRow(row);
               tabla.fireTableDataChanged();

            }
    }
    private void btn_proveidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveidoActionPerformed
int fila = tbl_expedientes.getSelectedRow();
String salto = System.lineSeparator();

 String val_prov=MIS_EXPEDIENTES.tbl_expedientes.getValueAt(fila,4).toString();
    if(fila==-1){
            JOptionPane.showMessageDialog(null,"no se ha selecionado ninguna fila");
            
        } else{
        if(val_prov.equals("sin proveido")){
            String text = "N° de expediente : "+tbl_expedientes.getValueAt(fila,0).toString()+salto
                +" "+salto
                    + "ADMINISTRADO : "+tbl_expedientes.getValueAt(fila,1).toString()+salto
                +" "+salto
                    + "TIPO DE DOC. : "+tbl_expedientes.getValueAt(fila,2).toString()+salto
                +" "+salto
                    + "DETALLE : "+tbl_expedientes.getValueAt(fila,3).toString()+salto
                +" "+salto
                    + "FECHA DE INGRESO : "+tbl_expedientes.getValueAt(fila,5).toString()+salto
                ;
            PROVEIDOS.txt_detalles.setText(text);
            Escritorio.add(proveido);
            proveido.show();            
            Listar_usuario_cbbox();
        }else{
        JOptionPane.showMessageDialog(rootPane, "El documento ya tiene proveido");
        }
    }
    }//GEN-LAST:event_btn_proveidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listar_mis_expe_auto();
    }//GEN-LAST:event_jButton1ActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_proveido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbl_sesion;
    public static javax.swing.JTable tbl_expedientes;
    // End of variables declaration//GEN-END:variables
}