/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import DATOS.Consultas_logs;
import DATOS.MetodosBD;
import DATOS.validarlogin;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import PRESENTACION.MENU_USUARIO_PRINCIPAL_1;
import static PRESENTACION.MENU_USUARIO_PRINCIPAL_1.Escritorio;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;




public class Login_1 extends javax.swing.JInternalFrame {

    public String getH_entrada() {
        return h_entrada;
    }

    public void setH_entrada(String h_entrada) {
        this.h_entrada = h_entrada;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    String h_entrada;
    int id_usu=0;
    Consultas_logs con_log= new Consultas_logs();
    MENU_USUARIO_PRINCIPAL_1 princip;
    
        private void centrarVentana() {
                // Se obtienen las dimensiones en pixels de la pantalla.
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

                // Se obtienen las dimensiones en pixels de la ventana.
                Dimension ventana = getSize();

                // Una cuenta para situar la ventana en el centro de la pantalla.
                setLocation((pantalla.width - ventana.width) / 2,
                                (pantalla.height - ventana.height) / 3);
        }
    public Login_1() {
        initComponents();
        this.setTitle("subgerencia de planeamiento, catastro y control urbano");
        //this.setLocation(360,120);
       this.centrarVentana();
        
 
    }
    String usuario="";
    MIS_EXPEDIENTES mis_exp;
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("SUBGERENCIA DE CATASTRO, PLANEAMIENTO Y CONTROL URBANO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Inicio de sesion");

        iniciar.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        iniciar.setText("Iniciar Sesión");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addGap(181, 181, 181))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(iniciar)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 281, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        validarlogin metodoslogin = new validarlogin();
        Calendar c = Calendar.getInstance();
        String val_usu=txtusuario.getText();
        if(metodoslogin.validar_ingreso()==1){
            String hora=Integer.toString(c.get(Calendar.HOUR_OF_DAY));
            String minutos=Integer.toString(c.get(Calendar.MINUTE));
            String segundos=Integer.toString(c.get(Calendar.SECOND));
            System.out.println(txtusuario.getText());
            setUsuario(txtusuario.getText());
            setId_usu(con_log.Buscar_id_usuario(usuario));            
            
            setH_entrada(hora+":"+minutos+":"+segundos);            

            this.dispose();
           
            JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);
             MENU_USUARIO_PRINCIPAL_1.Activar_menu(true);
             
             mis_exp= new MIS_EXPEDIENTES();
            Escritorio.add(mis_exp);
            mis_exp.show();
            
            metodosbd.Buscar_id_rol(val_usu);
            
        }
        else {

            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_iniciarActionPerformed
    
    MetodosBD metodosbd=new MetodosBD();
    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        String val_usu=txtusuario.getText();
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            validarlogin metodoslogin = new validarlogin();
            Calendar c = Calendar.getInstance();

        if(metodoslogin.validar_ingreso()==1){
            String hora=Integer.toString(c.get(Calendar.HOUR_OF_DAY));
            String minutos=Integer.toString(c.get(Calendar.MINUTE));
            String segundos=Integer.toString(c.get(Calendar.SECOND));
            System.out.println(txtusuario.getText());
            String usuario=txtusuario.getText();
            setId_usu(con_log.Buscar_id_usuario(usuario));
            setH_entrada(hora+":"+minutos+":"+segundos);
            

            this.dispose();
           
            JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);
            MENU_USUARIO_PRINCIPAL_1.Activar_menu(true);
            
    //inicio automatico de mis expedientes
            mis_exp= new MIS_EXPEDIENTES();
            Escritorio.add(mis_exp);
            mis_exp.show();
            
            //metodosbd.mis_expedientes();
            metodosbd.Buscar_id_rol(val_usu);
           
        }else {

            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);

        }
        }
        
        
    }//GEN-LAST:event_txtpasswordKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField txtpassword;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
