
package PRESENTACION;

import DATOS.Consultas_logs;
import DATOS.Pool;
import DATOS.MetodosBD;
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.Connection;
import javax.swing.JOptionPane;
import PRESENTACION.BUSCAR_USUARIOS;
import com.sun.xml.internal.bind.v2.model.core.ID;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class REGISTRO_NUEVO_USUARIO extends javax.swing.JInternalFrame {

    /**
     * @return the calendario
     */
    public static com.toedter.calendar.JDateChooser getCalendario() {
        //calendario.setEditable(null);
         calendario.getCalendarButton().setEnabled(false);
         calendario.getDateEditor().setEnabled(false);
         
        return calendario;
    }

    /**
     * @param aCalendario the calendario to set
     */
    public static void setCalendario(com.toedter.calendar.JDateChooser aCalendario) {
        calendario = aCalendario;
    }

    /**
     * @return the txt_fecha
     */
    

   
    public REGISTRO_NUEVO_USUARIO( ) {
        initComponents();
        this.txt_nombre =txt_nombre;
        this.txt_apellido_paterno=txt_apellido_paterno; 
        this.txt_apellido_materno=txt_apellido_materno;
        this.txt_usuario=txt_usuario;
        this.txt_password=txt_password;
        this.setLocation(285,70);
        txt_fecha.setVisible(false);
        
        
  
    }
//public static getBUSCAR_USUARIO(){
//return tbl_consulta;}
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido_paterno = new javax.swing.JTextField();
        txt_apellido_materno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        txt_usuario = new javax.swing.JTextField();
        jcb_automatico = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        btn_actualizar = new javax.swing.JButton();
        txt_fecha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Registrar nuevo usuario");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, -1));

        jLabel3.setText("APELLIDO PATERNO :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel4.setText("APELLIDO MATERNO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("USUARIO :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

        txt_apellido_paterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellido_paternoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellido_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, -1));
        getContentPane().add(txt_apellido_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, -1));

        jLabel6.setText("PASSWORD :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, -1));

        jLabel7.setText("ROL :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, -1));

        jLabel8.setText("ESTADO :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secretaria", "Administrativo", "Ingeniero", "Super_Usuario", "Notificador" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 110, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "De Baja", " " }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 110, -1));

        jLabel9.setText("FECHA REGISTRO :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel10.setText("D. N. I :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 150, -1));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        txt_usuario.setAutoscrolls(false);
        txt_usuario.setDragEnabled(true);
        txt_usuario.setEnabled(false);
        txt_usuario.setRequestFocusEnabled(false);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, -1));
        txt_usuario.getAccessibleContext().setAccessibleDescription("");

        jcb_automatico.setText("AUTO");
        jcb_automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_automaticoActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_automatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));
        jcb_automatico.getAccessibleContext().setAccessibleParent(txt_usuario);

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO USUARIO");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));
        getContentPane().add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 150, -1));

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        txt_fecha.setText("dia/mes/año");
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 470));

        setBounds(0, 0, 630, 516);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
            String dia = Integer.toString(getCalendario().getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(getCalendario().getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(getCalendario().getCalendar().get(Calendar.YEAR));
            String fecha = (year + "-" + mes+ "-" + dia);
            MetodosBD metodosbd = new MetodosBD();
            Consultas_logs obj = new Consultas_logs();

        try {
             Connection con = null;
            Pool metodospool = new Pool();
                        
            con = metodospool.dataSource.getConnection();
                    

            PreparedStatement psql = con.prepareStatement("UPDATE USUARIO  SET  Nombre ='"+txt_nombre.getText()+"', AP_paterno='"+txt_apellido_paterno.getText()+"',AP_materno='"+txt_apellido_materno.getText()+"',DNI='"+txt_dni.getText()+"',Password='"+txt_password.getText()+"',Usuario='"+txt_usuario.getText()+"',  ID_rol='"+jComboBox2.getSelectedItem().toString()+"', estado='"+jComboBox3.getSelectedItem().toString()+"', Fecha_registro='"+fecha+"' WHERE Usuario='"+txt_usuario.getText()+"'");
            psql.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            System.out.println("imprimir datos "+txt_nombre.getText()+"'");
            
            limpiar();
            
        } catch (SQLException ex) {
            Logger.getLogger(REGISTRO_NUEVO_USUARIO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    public void limpiar(){
        txt_nombre.setText("");
        txt_apellido_paterno.setText("");
        txt_apellido_materno.setText("");
        txt_usuario.setText("");
        txt_password.setText("");
        txt_dni.setText("");
          
    }
           
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        //

        MetodosBD metodosbd = new MetodosBD();
        Date fech=getCalendario().getDate();        
        String dia,year,mes,fecha;
        Consultas_logs obj = new Consultas_logs();
        
       
        if (txt_nombre.getText().isEmpty()||txt_apellido_paterno.getText().isEmpty()||txt_apellido_materno.getText().isEmpty()
            ||txt_dni.getText().isEmpty()||txt_password.getText().isEmpty()||txt_usuario.getText().isEmpty()||fech==null)
            {                 
                //El campo esta vacio,
                
                 JOptionPane.showMessageDialog(null, "rellene todos los campos no sea imbecil");
            }
            else
            {
                dia = Integer.toString(getCalendario().getCalendar().get(Calendar.DAY_OF_MONTH));
                mes = Integer.toString(getCalendario().getCalendar().get(Calendar.MONTH) + 1);
                year=Integer.toString(getCalendario().getCalendar().get(Calendar.YEAR));
                fecha = (year + "-" + mes+ "-" + dia);
                //El campo tiene texto
                
                int con= obj.Buscar_id_usuario(txt_usuario.getText());
                if(con ==0){
                        int exito =  metodosbd.Guardar(txt_nombre.getText(), txt_apellido_paterno.getText(),
                            txt_apellido_materno.getText(), txt_dni.getText(), txt_password.getText(),
                            txt_usuario.getText(),jComboBox2.getSelectedItem().toString()
                            ,jComboBox3.getSelectedItem().toString(),fecha);

                if(exito>0){

                        JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente",
                            "Éxito en la operación", JOptionPane.INFORMATION_MESSAGE);
                                    txt_nombre.setText(null);         
                                    txt_apellido_paterno.setText(null);
                                    txt_apellido_materno.setText(null);
                                    txt_dni.setText(null);   
                                    txt_password.setText(null);
                                    txt_usuario.setText(null);
                                    getCalendario().setDate(null);        }
                else{

                        JOptionPane.showMessageDialog(null, "Los datos no se pudieron guardar\n"
                        + "Inténtelo nuevamente", "Error en la operación", JOptionPane.ERROR_MESSAGE);

            }}
                else{
                        JOptionPane.showMessageDialog(null, " LOS DATOS YA EXISTEN","Error en la operación", JOptionPane.ERROR_MESSAGE);
            }

                          
                                  }
        
        
        
        

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_guardarMouseClicked

    private void jcb_automaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_automaticoActionPerformed
        // TODO add your handling code here:
        txt_usuario.setEnabled(true);
        String cadena1 = txt_nombre.getText();
        String cadena2 = txt_apellido_paterno.getText();
        char inicial = cadena1.charAt(0);
        String usu_check = (inicial+cadena2);
        txt_usuario.setText(usu_check);

    }//GEN-LAST:event_jcb_automaticoActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_apellido_paternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellido_paternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellido_paternoActionPerformed

    public REGISTRO_NUEVO_USUARIO(String txt_nombre) {
        super(txt_nombre);
    }
        public void setTxt_apellido_materno(JTextField txt_apellido_materno) {
        this.txt_apellido_materno = txt_apellido_materno;
    }

    public void setTxt_apellido_paterno(JTextField txt_apellido_paterno) {
        this.txt_apellido_paterno = txt_apellido_paterno;
    }

    public void setTxt_password(JPasswordField txt_password) {
        this.txt_password = txt_password;
    }

    public void setTxt_usuario(JTextField txt_usuario) {
        this.txt_usuario = txt_usuario;
    }

    public JTextField getTxt_apellido_materno() {
        return txt_apellido_materno;
    }
//public String gettxt_nombre(){
//    return txt_nombre;
//}
    public JTextField getTxt_apellido_paterno() {
        return txt_apellido_paterno;
    }

    public JTextField getTxt_dni() {
        return txt_dni;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public JPasswordField getTxt_password() {
        return txt_password;
    }

    public JTextField getTxt_usuario() {
        return txt_usuario;
    }

     public javax.swing.JButton getBtn_guardar() {
        btn_guardar.setEnabled(false);
        return btn_guardar;
    }

    /**
     * @param btn_guardar the btn_guardar to set
     */
    public void setBtn_guardar(javax.swing.JButton btn_guardar) {
        this.btn_guardar = btn_guardar;
    }

//    

    public javax.swing.JButton getBtn_actualizar() {
        btn_actualizar.setEnabled(false);
        return btn_actualizar;
    }

    /**
     * @param btn_actualizar the btn_actualizar to set
     */
    public void setBtn_actualizar(javax.swing.JButton btn_actualizar) {
        this.btn_actualizar = btn_actualizar;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_guardar;
    public static com.toedter.calendar.JDateChooser calendario;
    public static javax.swing.JComboBox jComboBox2;
    public static javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcb_automatico;
    public static javax.swing.JTextField txt_apellido_materno;
    public static javax.swing.JTextField txt_apellido_paterno;
    public static javax.swing.JTextField txt_dni;
    public static javax.swing.JTextField txt_fecha;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JPasswordField txt_password;
    public static javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    public void setJcb_automatico(JCheckBox jcb_automatico) {
        this.jcb_automatico = jcb_automatico;
    }

//       public String get() {
//        return h_entrada;

    public JCheckBox getJcb_automatico() {
         jcb_automatico.setEnabled(false);
        return jcb_automatico;
    }
    

}
