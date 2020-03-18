
package DATOS;

import DATOS.Pool;
import LOGICA.RESULT_LOG;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Consultas_logs {
    Pool metodospool = new Pool();
    
    public int Buscar_id_usuario (String usuario){
        int id_usuario=0;
        PreparedStatement ps = null;
        ResultSet rs=null;

    Connection con = null;

    String SSQL = "SELECT * FROM usuario WHERE Usuario=?";
        try {
            con = metodospool.dataSource.getConnection();
            
            ps= con.prepareStatement(SSQL);
            ps.setString(1, usuario);
            rs=ps.executeQuery();
            while(rs.next()){
                id_usuario=Integer.parseInt(rs.getString("ID_usuario")); 
                System.out.println("id usuario : "+id_usuario);
            }
            return id_usuario;
        } catch (Exception e) {
            System.out.println("error en busqueda "+e);
            return 0;
        }

    }
    
    
    public int Guardar_log( int id_usuario, String fecha, String h_inicio, String h_salida){

    int resultado = 0;

    Connection con = null;

    String SSQL = "INSERT INTO log ( ID_USUARIO, FECHA, HORA_INGRESO, HORA_SALIDA) "
                + "VALUES ( ?, ?, ?, ?)";
        try {
            con = metodospool.dataSource.getConnection();
            PreparedStatement psql = con.prepareStatement(SSQL);
            //psql.setInt(1, ID_usuario);
            psql.setInt(1, id_usuario);
            psql.setString(2, fecha);
            psql.setString(3, h_inicio);
            psql.setString(4, h_salida);           
            resultado = psql.executeUpdate();
            psql.close();
            
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información logs :\n"
                                         + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            return resultado;
        }finally{
            try {            
                if(con!=null){
                    con.close();
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                         + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);

            }    
        }
        
    
}  
    
    public LinkedList Listar_logs () {
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
//                System.out.println("tamaño de resultado: "+resultado.size());
            }
                
                return resultado;
                
            }

         catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscarlist datos");
            return null;
    }
    
        
     
}
public LinkedList Listar_logs_fecha (String Fecha) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        
        LinkedList<RESULT_LOG> resultado = new LinkedList<RESULT_LOG>();
        String usuario;
        
        Date fecha;
        Time h_ingreso, h_salida;
        RESULT_LOG r_log;
        
        
        String sql= "SELECT USUARIO,FECHA, HORA_INGRESO, HORA_SALIDA FROM log INNER JOIN Usuario where  (log.ID_USUARIO=usuario.ID_usuario) and FECHA='"+Fecha+"'" ;
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
