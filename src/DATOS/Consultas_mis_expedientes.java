/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import LOGICA.RESULT_LOG;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIISTRADOR
 */
public class Consultas_mis_expedientes {
    Pool metodospool = new Pool();
    
     public LinkedList Listar_expedientes (int id_usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        
        LinkedList<RESULT_LOG> resultado = new LinkedList<RESULT_LOG>();
        String usuario;
        
        Date fecha;
        Time h_ingreso, h_salida;
        RESULT_LOG r_log;
        
        
        String sql= "SELECT USUARIO,FECHA, HORA_INGRESO, HORA_SALIDA FROM log INNER JOIN Usuario where log.ID_USUARIO=usuario.ID_usuario" ;
        try {
            con = metodospool.dataSource.getConnection();
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                usuario= rs.getString(1);
                fecha=rs.getDate(2);
                h_ingreso=rs.getTime(3);
                h_salida=rs.getTime(4);
                r_log= new RESULT_LOG( usuario, fecha, h_ingreso, h_salida);
                resultado.add(r_log);
                System.out.println("tamaño de resultado: "+resultado.size());
            }
                
                return resultado;
                
            }

         catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscarlist datos");
            return null;
    }
    
        
     
}
}
