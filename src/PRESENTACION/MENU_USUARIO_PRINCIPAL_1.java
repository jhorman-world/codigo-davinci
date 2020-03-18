
package PRESENTACION;
import DATOS.Consultas_logs;
import DATOS.MetodosBD;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class MENU_USUARIO_PRINCIPAL_1 extends javax.swing.JFrame {
       public static void setBarra_menu(javax.swing.JMenuBar aBarra_menu) {
        barra_menu = aBarra_menu;
        }        
    
            Login_1 ventana_login;
            MIS_EXPEDIENTES mis_exp;
            INGRESO_DOCUMENTOS Ing1;
            BUSCAR_USUARIOS buscar_usuario ;
            LOG lista_logs;
            REGISTRO_NUEVO_USUARIO nuevo_usuario;
            Consultas_logs con = new Consultas_logs();
            String fecha;
            String h_salida;
            INGRESO_DOCUMENTOS ingreso_docs;
            BUSCAR_EXPEDIENTES buscar_expe;
            EXPEDIENTE_DIGITAL expe_digital;
    
    public MENU_USUARIO_PRINCIPAL_1() {
        initComponents();
        
         ventana_login= new Login_1();
         Escritorio.add(ventana_login);
         ventana_login.show();
         buscar_usuario = new BUSCAR_USUARIOS();
         lista_logs= new LOG();
         nuevo_usuario= new REGISTRO_NUEVO_USUARIO();
         mis_exp = new MIS_EXPEDIENTES();
         ingreso_docs= new INGRESO_DOCUMENTOS();
         buscar_expe=new BUSCAR_EXPEDIENTES();
         expe_digital=new EXPEDIENTE_DIGITAL();
         barra_menu.setEnabled(false);
         this.setExtendedState(MAXIMIZED_BOTH);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        barra_menu = new javax.swing.JMenuBar();
        m_mis_expedientes = new javax.swing.JMenu();
        m_nuevo = new javax.swing.JMenu();
        sm_nuevo_usuario = new javax.swing.JMenuItem();
        sm_ingreso_doc = new javax.swing.JMenuItem();
        m_busqueda = new javax.swing.JMenu();
        sm_busq_usuario = new javax.swing.JMenuItem();
        sm_busq_logs = new javax.swing.JMenuItem();
        sm_busqueda_tramite = new javax.swing.JMenuItem();
        m_archivo_d = new javax.swing.JMenu();
        sm_nuevo_ad = new javax.swing.JMenuItem();
        m_reporte = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SUBGERENCIA DE CATASTRO, PLANEAMIENTO Y CONTROL URBANO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        barra_menu.setEnabled(false);
        barra_menu.setFocusable(false);

        m_mis_expedientes.setBackground(new java.awt.Color(255, 255, 153));
        m_mis_expedientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        m_mis_expedientes.setForeground(new java.awt.Color(204, 0, 0));
        m_mis_expedientes.setText("Mis expedietes");
        m_mis_expedientes.setEnabled(false);
        m_mis_expedientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_mis_expedientesMouseClicked(evt);
            }
        });
        barra_menu.add(m_mis_expedientes);

        m_nuevo.setText("Nuevo");
        m_nuevo.setEnabled(false);

        sm_nuevo_usuario.setBackground(new java.awt.Color(255, 255, 255));
        sm_nuevo_usuario.setText("Usuario");
        sm_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_nuevo_usuarioActionPerformed(evt);
            }
        });
        m_nuevo.add(sm_nuevo_usuario);

        sm_ingreso_doc.setBackground(new java.awt.Color(255, 255, 255));
        sm_ingreso_doc.setText("Ingreso documentos");
        sm_ingreso_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_ingreso_docActionPerformed(evt);
            }
        });
        m_nuevo.add(sm_ingreso_doc);

        barra_menu.add(m_nuevo);

        m_busqueda.setText("Búsqueda");
        m_busqueda.setEnabled(false);

        sm_busq_usuario.setBackground(new java.awt.Color(255, 255, 255));
        sm_busq_usuario.setText("Usuario...");
        sm_busq_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_busq_usuarioActionPerformed(evt);
            }
        });
        m_busqueda.add(sm_busq_usuario);

        sm_busq_logs.setBackground(new java.awt.Color(255, 255, 255));
        sm_busq_logs.setText("Logs...");
        sm_busq_logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_busq_logsActionPerformed(evt);
            }
        });
        m_busqueda.add(sm_busq_logs);

        sm_busqueda_tramite.setBackground(new java.awt.Color(255, 255, 255));
        sm_busqueda_tramite.setText("Tramite");
        sm_busqueda_tramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_busqueda_tramiteActionPerformed(evt);
            }
        });
        m_busqueda.add(sm_busqueda_tramite);

        barra_menu.add(m_busqueda);

        m_archivo_d.setText("Archivo Digital");
        m_archivo_d.setEnabled(false);

        sm_nuevo_ad.setBackground(new java.awt.Color(255, 255, 255));
        sm_nuevo_ad.setText("Nuevo");
        sm_nuevo_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_nuevo_adActionPerformed(evt);
            }
        });
        m_archivo_d.add(sm_nuevo_ad);

        barra_menu.add(m_archivo_d);

        m_reporte.setText("Reporte");
        m_reporte.setEnabled(false);
        barra_menu.add(m_reporte);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void cerrar(){
 Object [] opciones ={"SI","NO"};
 int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
 JOptionPane.YES_NO_OPTION,
 JOptionPane.QUESTION_MESSAGE,null,opciones,"SI");
 if (eleccion == JOptionPane.YES_OPTION)
 {
 System.exit(0);
 }else{
 }}
    public static void Activar_menu (boolean estado){
        m_mis_expedientes.setEnabled(estado);
        m_nuevo.setEnabled(estado);
        m_archivo_d.setEnabled(estado);
        m_busqueda.setEnabled(estado);
        m_reporte.setEnabled(estado);
    
    }
    
    private void sm_busq_logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_busq_logsActionPerformed
        if (lista_logs.isShowing()==false) {
            Escritorio.add(lista_logs);
            lista_logs.show();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
    }//GEN-LAST:event_sm_busq_logsActionPerformed

     private static boolean variableBooleana = true;

      public void tuFuncion() {
        if (variableBooleana == true) {
          
          variableBooleana = false;
        }
      }
    MetodosBD metodosbd=new MetodosBD();
    private void sm_busq_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_busq_usuarioActionPerformed
        if (buscar_usuario.isShowing()==false) {
            Escritorio.add(buscar_usuario);
            buscar_usuario.show();
            
        }else {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
    }//GEN-LAST:event_sm_busq_usuarioActionPerformed

    private void sm_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_nuevo_usuarioActionPerformed
         if (nuevo_usuario.isShowing()==false) {
            Escritorio.add(nuevo_usuario);
            nuevo_usuario.show();
            nuevo_usuario.getBtn_actualizar();
            nuevo_usuario.toFront();
            nuevo_usuario.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
    }//GEN-LAST:event_sm_nuevo_usuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
        
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString((c.get(Calendar.MONTH))+1);
        String annio = Integer.toString(c.get(Calendar.YEAR));
        String hora=Integer.toString(c.get(Calendar.HOUR_OF_DAY));
        String minutos=Integer.toString(c.get(Calendar.MINUTE));
        String segundos=Integer.toString(c.get(Calendar.SECOND));
        fecha=annio+"-"+(mes)+"-"+dia;
        h_salida=hora+":"+minutos+":"+segundos;
        int id_usu=ventana_login.getId_usu();
        String h_etrada=ventana_login.getH_entrada();
        
        if (h_etrada!=null){
            try {
            con.Guardar_log(id_usu, fecha, h_etrada, h_salida);
            } catch (Exception e) {
                System.out.println("ERROR AL GUARDAR LOG "+e);
            }
        }else{
            this.dispose();
        }
        
        
    }//GEN-LAST:event_formWindowClosing

    private void sm_ingreso_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_ingreso_docActionPerformed
         if (ingreso_docs.isShowing()==false) {
            Escritorio.add(ingreso_docs);
            ingreso_docs.show();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
        
        
    }//GEN-LAST:event_sm_ingreso_docActionPerformed

    private void sm_busqueda_tramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_busqueda_tramiteActionPerformed
        if (buscar_expe.isShowing()==false) {
            Escritorio.add(buscar_expe);
            buscar_expe.show();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
    }//GEN-LAST:event_sm_busqueda_tramiteActionPerformed

    private void sm_nuevo_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_nuevo_adActionPerformed
       if (expe_digital.isShowing()==false) {
            Escritorio.add(expe_digital);
            expe_digital.show();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");
           
        }
    }//GEN-LAST:event_sm_nuevo_adActionPerformed

    private void m_mis_expedientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_mis_expedientesMouseClicked
        // TODO add your handling code here:
         //tuFuncion();
        
       
            if (mis_exp.isShowing()==false) {
            Escritorio.add(mis_exp);            
            mis_exp.listar_mis_expe_auto();
            mis_exp.show();
            
            
            }else {
                JOptionPane.showMessageDialog(rootPane, "Ya existe una ventana abierta para esta opción");

            }
    }//GEN-LAST:event_m_mis_expedientesMouseClicked

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU_USUARIO_PRINCIPAL_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_USUARIO_PRINCIPAL_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_USUARIO_PRINCIPAL_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_USUARIO_PRINCIPAL_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_USUARIO_PRINCIPAL_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    public static javax.swing.JMenuBar barra_menu;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenu m_archivo_d;
    public static javax.swing.JMenu m_busqueda;
    public static javax.swing.JMenu m_mis_expedientes;
    public static javax.swing.JMenu m_nuevo;
    public static javax.swing.JMenu m_reporte;
    public static javax.swing.JMenuItem sm_busq_logs;
    public static javax.swing.JMenuItem sm_busq_usuario;
    public static javax.swing.JMenuItem sm_busqueda_tramite;
    public static javax.swing.JMenuItem sm_ingreso_doc;
    public static javax.swing.JMenuItem sm_nuevo_ad;
    public static javax.swing.JMenuItem sm_nuevo_usuario;
    // End of variables declaration//GEN-END:variables
}
