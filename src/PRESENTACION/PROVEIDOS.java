
package PRESENTACION;

import DATOS.MetodosBD;
import DATOS.Pool;
import LOGICA.RESULT_CBBOX_PROVEIDO_USU;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PROVEIDOS extends javax.swing.JInternalFrame {

    public PROVEIDOS() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_dar_proveido = new javax.swing.JButton();
        btn_cancelar_proveido = new javax.swing.JButton();
        cbbox_prov_usu = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_detalles = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("PROVEIDOS");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MIS EXPEDIENTES");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btn_dar_proveido.setText("DAR PROVEIDO");
        btn_dar_proveido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dar_proveidoActionPerformed(evt);
            }
        });

        btn_cancelar_proveido.setText("CANCELAR");
        btn_cancelar_proveido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_proveidoActionPerformed(evt);
            }
        });

        cbbox_prov_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_prov_usuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Hacer proveido a :");

        txt_detalles.setEditable(false);
        txt_detalles.setColumns(20);
        txt_detalles.setRows(5);
        jScrollPane1.setViewportView(txt_detalles);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Detalle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_dar_proveido)
                        .addGap(67, 67, 67)
                        .addComponent(btn_cancelar_proveido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbbox_prov_usu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbox_prov_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dar_proveido)
                    .addComponent(btn_cancelar_proveido))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    MetodosBD metodosbd=new MetodosBD();
    
     private void datos_prove (){      
        
          LinkedList<RESULT_CBBOX_PROVEIDO_USU> llenar_proveido = new LinkedList<RESULT_CBBOX_PROVEIDO_USU>();
          llenar_proveido = metodosbd.listar_expe();
            Date date = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
      
                    
            int fila = MIS_EXPEDIENTES.tbl_expedientes.getSelectedRow();
            int val_id =cbbox_prov_usu.getSelectedIndex()-1 ;
           
        String nombre_prov=cbbox_prov_usu.getSelectedItem().toString();
        String id_doc_img=MIS_EXPEDIENTES.tbl_expedientes.getValueAt(fila,0).toString();
        String hora=hourFormat.format(date);
        String fecha=dateFormat.format(date);
        String id_usu=llenar_proveido.get(val_id).getUsuario();
        String id_rpta="Sin respuesta";
         
       
         try {
             Connection con = null;
            Pool metodospool = new Pool();                        
            con = metodospool.dataSource.getConnection();
            PreparedStatement psql = con.prepareStatement("UPDATE proveido  SET  NOMBRE_PROV ='"+nombre_prov+"', F_PROVEIDO='"+fecha+"', HORA_PROVE='"+hora+"',ID_USUARIO='"+id_usu+"',ID_RPTA='"+id_rpta+"' WHERE ID_DOC_ING='"+id_doc_img+"'");
            psql.executeUpdate();
             System.out.println(psql);
            JOptionPane.showMessageDialog(null, "Proveido Exitoso");         
            dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(REGISTRO_NUEVO_USUARIO.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }
    private void btn_dar_proveidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dar_proveidoActionPerformed
        // TODO add your handling code here:

if(JOptionPane.showConfirmDialog(null, "¿Desea guardar la información?","Confirmación de guardado",JOptionPane.WARNING_MESSAGE,
   JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
    
datos_prove ();


}
    }//GEN-LAST:event_btn_dar_proveidoActionPerformed

    private void cbbox_prov_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_prov_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_prov_usuActionPerformed

    private void btn_cancelar_proveidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_proveidoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cancelar_proveidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_proveido;
    public static javax.swing.JButton btn_dar_proveido;
    public static javax.swing.JComboBox cbbox_prov_usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea txt_detalles;
    // End of variables declaration//GEN-END:variables
}
