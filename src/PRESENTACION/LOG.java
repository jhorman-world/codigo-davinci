/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import DATOS.Consultas_logs;
import LOGICA.RESULT_LOG;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class LOG extends javax.swing.JInternalFrame {

    /**
     * Creates new form Logs
     */
    private void centrarVentana() {
                // Se obtienen las dimensiones en pixels de la pantalla.
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

                // Se obtienen las dimensiones en pixels de la ventana.
                Dimension ventana = getSize();

                // Una cuenta para situar la ventana en el centro de la pantalla.
                setLocation((pantalla.width - ventana.width) / 2,
                                (pantalla.height - ventana.height) / 3);
        }
    public LOG() {
        initComponents();
        Listar_logs ();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        lbl_fecha = new javax.swing.JLabel();
        txt_buscar = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_logs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Inicios de sesión");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_buscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_buscar.setText("buscar");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_fecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_fecha.setText("Buscar por fecha");

        tbl_logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "USUARIO", "FECHA", "INICIO_S", "FIN_S"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_logs);

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIOS DE SESIÓN");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_fecha)
                .addGap(18, 18, 18)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_buscar)
                        .addComponent(lbl_fecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Listar_logs (){
        Consultas_logs consulta = new Consultas_logs();
        DefaultTableModel tabla= (DefaultTableModel) tbl_logs.getModel();
 
          LinkedList<RESULT_LOG> ListadoLogs = new LinkedList<RESULT_LOG>();
          ListadoLogs = consulta.Listar_logs();
          tabla.setNumRows(0);
 
            for(int i =0; i<ListadoLogs.size(); i++)
            {
               Object [] row = {
                   ListadoLogs.get(i).getUsuario(),
                   ListadoLogs.get(i).getFecha(),
                   ListadoLogs.get(i).getH_ingreso(),
                   ListadoLogs.get(i).getH_salida()};
               tabla.addRow(row);
            }
    }
    
    private void Listar_logs_fecha (String fecha){
        Consultas_logs consulta = new Consultas_logs();
        DefaultTableModel tabla= (DefaultTableModel) tbl_logs.getModel();
 
          LinkedList<RESULT_LOG> ListadoLogs = new LinkedList<RESULT_LOG>();
          ListadoLogs = consulta.Listar_logs_fecha(fecha);
          tabla.setNumRows(0);
 
            for(int i =0; i<ListadoLogs.size(); i++)
            {
               Object [] row = {
                   ListadoLogs.get(i).getUsuario(),
                   ListadoLogs.get(i).getFecha(),
                   ListadoLogs.get(i).getH_ingreso(),
                   ListadoLogs.get(i).getH_salida()};
               tabla.addRow(row);
            }
    }
    
    
    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        Date fechalog= txt_buscar.getDate();
        System.out.println(fechalog);
            
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (txt_buscar.getDate()==null){
             Listar_logs();
        }else {
           
            Date fe=txt_buscar.getDate();
            Calendar c = Calendar.getInstance();
            c.setTime(fe);

            String dia = Integer.toString(c.get(Calendar.DATE));
            String mes = Integer.toString((c.get(Calendar.MONTH))+1);
            String annio = Integer.toString(c.get(Calendar.YEAR));
            String fecha=annio+"-"+(mes)+"-"+dia;

            Listar_logs_fecha(fecha);
            
            txt_buscar.setDate(null);
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JTable tbl_logs;
    private com.toedter.calendar.JDateChooser txt_buscar;
    // End of variables declaration//GEN-END:variables
}
