/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;



//import Formularios.Login;
import PRESENTACION.Login_1;
import DATOS.Pool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class validarlogin {

Pool metodospool = new Pool();

public int validar_ingreso(){

    String Usuario = Login_1.txtusuario.getText();
    String Password = String.valueOf(Login_1.txtpassword.getPassword());

    int resultado=0;
    
    String SSQL="SELECT * FROM usuario WHERE Usuario='"+Usuario+"' AND Password=('"+Password+"')";

    Connection conect = null;

    try {

        conect = metodospool.dataSource.getConnection();
        Statement st = conect.createStatement();
        ResultSet rs = st.executeQuery(SSQL);

        if(rs.next()){

            resultado=1;

        }

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

    }finally{


        try {

            conect.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

        }

    }

return resultado;

}

}
