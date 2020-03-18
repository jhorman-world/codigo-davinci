
package PRESENTACION;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

import DATOS.Archivos_objeto;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import DATOS.CuadroImagen;
import DATOS.Lectura_PDF;
import DATOS.MetodosBD;
import DATOS.Pool;
import static PRESENTACION.MIS_EXPEDIENTES.tbl_expedientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Percy
 */
public class RESPONDER extends javax.swing.JInternalFrame {

    JFileChooser seleccionado =new JFileChooser();
    File archivo;
    byte[] bytesImg;
   
    private int numImg;

    //Contiene el archivo PDF en bytes de imagenes
    private ArrayList<Archivos_objeto> ListaComponente;
    Lectura_PDF pn = new Lectura_PDF();
    Archivos_objeto pl = new Archivos_objeto();

    //Para mostrar el total de paginas
    private int paginas = -1;
    private int totalp = -1;

    //Guardamos la ruta del PDF--------------------------------------
    private String ruta_archivo = "";

    public RESPONDER() {
        initComponents();
         panel_2.setVisible(false);
         cb_documento.addItem("Seleccione");
         cb_documento.addItem("Carta");
         cb_documento.addItem("Informe");
         cb_documento.addItem("Resolución");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_documento = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_administrado = new javax.swing.JTextField();
        panel_2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardarpdf = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        img = new DATOS.CuadroImagen();
        panel_1 = new javax.swing.JPanel();
        p = new javax.swing.JLabel();
        btn_abrir_pdf1 = new javax.swing.JButton();
        pagina_siguiente = new javax.swing.JButton();
        siguiente_pagina = new javax.swing.JButton();
        txt_tipodocuemnto = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        cb_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_documentoActionPerformed(evt);
            }
        });

        jLabel1.setText("TIPO DE DOCUMENTO: ");

        jLabel2.setText("ADMINISTRADO:");

        txt_administrado.setEditable(false);

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardarpdf.setText("GUARDAR PDF");
        btn_guardarpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarpdfActionPerformed(evt);
            }
        });

        img.setBackground(new java.awt.Color(255, 255, 255));
        img.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 204)));

        javax.swing.GroupLayout imgLayout = new javax.swing.GroupLayout(img);
        img.setLayout(imgLayout);
        imgLayout.setHorizontalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
        );
        imgLayout.setVerticalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(img);

        panel_1.setBackground(new java.awt.Color(204, 204, 255));
        panel_1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)), "Abrir Archivo PDF.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 13), new java.awt.Color(0, 51, 204))); // NOI18N

        p.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        p.setText("Pag.");

        btn_abrir_pdf1.setBackground(new java.awt.Color(255, 255, 255));
        btn_abrir_pdf1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btn_abrir_pdf1.setForeground(new java.awt.Color(0, 0, 153));
        btn_abrir_pdf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PDF_1.png"))); // NOI18N
        btn_abrir_pdf1.setText("ABRIR ARCHIVO`PDF");
        btn_abrir_pdf1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        btn_abrir_pdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrir_pdf1ActionPerformed(evt);
            }
        });

        pagina_siguiente.setBackground(new java.awt.Color(255, 255, 255));
        pagina_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/atras.png"))); // NOI18N
        pagina_siguiente.setBorderPainted(false);
        pagina_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagina_siguienteActionPerformed(evt);
            }
        });

        siguiente_pagina.setBackground(new java.awt.Color(255, 255, 255));
        siguiente_pagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/siguiente.png"))); // NOI18N
        siguiente_pagina.setBorderPainted(false);
        siguiente_pagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente_paginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(pagina_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_abrir_pdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(siguiente_pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_abrir_pdf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siguiente_pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(pagina_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardarpdf)
                .addGap(81, 81, 81)
                .addComponent(btn_cancelar)
                .addGap(456, 456, 456))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addComponent(txt_tipodocuemnto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txt_tipodocuemnto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarpdf)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_administrado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cb_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_administrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_documentoActionPerformed
           int i=cb_documento.getSelectedIndex();
         
                          
        if (i==0){
            panel_2.setVisible(false);
          
        }else if(1==1) {
             panel_2.setVisible(true);
         
        }else if(1==2) {
             panel_2.setVisible(true);
         
        }else if(1==3) {
             panel_2.setVisible(true);
         
        
         
        }
    }//GEN-LAST:event_cb_documentoActionPerformed

    private void pagina_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagina_siguienteActionPerformed
        //Metodo usado para retroceder pagina
        //El if para comprobar que haya paginas
        if (ruta_archivo.trim().length() != 0) {
            //if para que comprueba si la pagina es 1 entonces se ira a la ultima pagina
            this.numImg -= 1;
            if (paginas == 1) {
                paginas = totalp;
                p.setText(String.valueOf("Pag. " + paginas));
            } else {
                paginas = paginas - 1;
                p.setText(String.valueOf("Pag. " + paginas));
            }
            //Aplicamos la pagina respectiva para mostrarlo
            if (this.numImg < 0) {
                this.numImg = (this.ListaComponente.size() - 1);
            }
            Archivos_objeto pi = new Archivos_objeto();
            for (int i = 0; i < ListaComponente.size(); i++) {
                pi = ListaComponente.get(numImg);
                break;
            }
            //Con este metodo mostramos la imagen
            this.img.setImagen(pi.getArchivos());
            //Este metodo adapta el zoom a la pantalla
            //            adaptar_vista();

        } else {
            JOptionPane.showMessageDialog(null, "Abrir un documento PDF primero");
        }
    }//GEN-LAST:event_pagina_siguienteActionPerformed

    private void siguiente_paginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente_paginaActionPerformed
        //Este metodo pasa la pagina hacia adelante
        //Verifica que haya paginas
        if (ruta_archivo.trim().length() != 0) {
            //Este if comprueba si la pagina esta en el ultimo
            //O si esta en el primero pasara a la siguiente pagina
            this.numImg += 1;
            if (paginas == totalp) {
                paginas = 1;
                p.setText(String.valueOf("Pag. " + paginas));
            } else {
                paginas = paginas + 1;
                p.setText(String.valueOf("Pag. " + paginas));
            }
            //Aplica los cambios de la pagina que corresponde
            if (this.numImg >= this.ListaComponente.size()) {
                this.numImg = 0;
            }
            Archivos_objeto pi = new Archivos_objeto();
            for (int i = 0; i < ListaComponente.size(); i++) {
                pi = ListaComponente.get(numImg);
                break;
            }
            //Muestra la pagina que corresponde
            this.img.setImagen(pi.getArchivos());
            //adapta la pagina a la pantalla
            //            adaptar_vista();
        } else {
            JOptionPane.showMessageDialog(null, "Abrir un documento PDF primero");
        }
    }//GEN-LAST:event_siguiente_paginaActionPerformed

    private void btn_abrir_pdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrir_pdf1ActionPerformed
        //Metodo para buscar y abrir el PDF
        JFileChooser j = new JFileChooser(ruta_archivo);
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            ruta_archivo = j.getSelectedFile().getAbsolutePath();
            //----------------
            //Usamos el metodo abrir pdf para mostrarlo
            abrir_pdf(ruta_archivo);
            //            this.img.disminuir();
            //            this.img.disminuir();

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono");
        }
    }//GEN-LAST:event_btn_abrir_pdf1ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

          

    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarpdfActionPerformed
       
        MetodosBD metodosbd = new MetodosBD();
        try{
            Connection con= null;
            Pool metodospool = new Pool();
            
            con =metodospool.dataSource.getConnection();
            //int exitoo= metodosbd.guardar_imagenpdf(img.getBounds().toString(), txt_administrado.getText(),cb_documento.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "respuesta enviada");
           DefaultTableModel modelo=(DefaultTableModel)MIS_EXPEDIENTES.tbl_expedientes.getModel();
           int fila=MIS_EXPEDIENTES.tbl_expedientes.getSelectedRow();
           if(fila>=0){
           int [] filasselec=MIS_EXPEDIENTES.tbl_expedientes.getSelectedRows();
           for(int i=0;i<filasselec.length;i++){
           modelo.removeRow(filasselec[i]);
           }
           }
            this.dispose();
        }catch (SQLException e){
            Logger.getLogger(RESPONDER.class.getName()).log(Level.SEVERE, null, e);
        
        }
        
    }//GEN-LAST:event_btn_guardarpdfActionPerformed

       public void abrir_pdf(String url) {
        //Es considerado pagina 1
        this.numImg = 0;
        //Lee la pagina 1
        this.ListaComponente = pn.leerPDF(url);
        //Guardamos todas las paginas en el ArrayList
        for (int i = 0; i < ListaComponente.size(); i++) {
            pl = ListaComponente.get(i);;
            this.img.setImagen(pl.getArchivos());
        }
        //Pagina 1 lo muestra en la pantalla
        paginas = 1;
        p.setText(String.valueOf("Pag. " + paginas));
        totalp = ListaComponente.size();
        //Titulo del pdf
        this.setTitle(" PDFJava; Total  de Paginas: " + String.valueOf(totalp));
        //tp.setText(String.valueOf(totalp));
        //Mostramos la primera pagina
        Archivos_objeto pi = new Archivos_objeto();
        pi = ListaComponente.get(0);
        this.img.setImagen(pi.getArchivos());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir_pdf1;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardarpdf;
    private javax.swing.JComboBox cb_documento;
    private DATOS.CuadroImagen img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel p;
    private javax.swing.JButton pagina_siguiente;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JButton siguiente_pagina;
    public static javax.swing.JTextField txt_administrado;
    private javax.swing.JLabel txt_tipodocuemnto;
    // End of variables declaration//GEN-END:variables
}
