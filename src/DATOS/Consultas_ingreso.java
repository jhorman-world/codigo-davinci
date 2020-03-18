/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import LOGICA.RESULT_LOG;
import LOGICA.RESULT_TRAMITE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIISTRADOR
 */
public class Consultas_ingreso {
    Pool metodospool = new Pool();
    
     public int Guardar_administrado( int id, String nombre, String apellido, String direccion){

    int resultado = 0;

    Connection con = null;
//INSERT INTO `administrado` (`ID_ADMINISTRADO`, `NOMBRE`, `APELLIDO`, `DIRECCION`) VALUES (NULL, 'Gabriela María', 'Rojas Mallqui', 'Jr. España 213');
    String SSQL = "INSERT INTO administrado (ID_ADMINISTRADO, NOMBRE, APELLIDO, DIRECCION) "
                + "VALUES (?, ?, ?, ?)";
        try {
            con = metodospool.dataSource.getConnection();
            PreparedStatement psql = con.prepareStatement(SSQL);
        
            psql.setInt(1, id);
            psql.setString(2, nombre);
            psql.setString(3, apellido);
            psql.setString(4, direccion);
                      
            resultado = psql.executeUpdate();
            psql.close();
            
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información ingreso :\n"
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
    
     public int Guardar_monto( int id, String tipo, double cantidad){

    int resultado = 0;

    Connection con = null;
//INSERT INTO `monto` (`ID_MONTO`, `TIPO`, `CANTIDAD`) VALUES (NULL, 'Licencias', '123.5');
    String SSQL = "INSERT INTO monto (`ID_MONTO`, `TIPO`, `CANTIDAD`) "
                + "VALUES (?, ?, ?)";
        try {
            con = metodospool.dataSource.getConnection();
            PreparedStatement psql = con.prepareStatement(SSQL);
        
            psql.setInt(1, id);
            psql.setString(2, tipo);
            psql.setDouble(3, cantidad);
            
            resultado = psql.executeUpdate();
            psql.close();
            
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información monto :\n"
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
    
     public int Guardar_plazo( int id, String inicio, String fin){
         
         int resultado = 0;

    Connection con = null;
    //INSERT INTO `plazo` (`ID_PLAZO`, `INICIO`, `FIN`) VALUES (NULL, '2020-02-10', '2020-02-25');
    String SSQL = "INSERT INTO plazo (`ID_PLAZO`, `INICIO`, `FIN`) "
                + "VALUES (?, ?, ?)";
        try {
            con = metodospool.dataSource.getConnection();
            PreparedStatement psql = con.prepareStatement(SSQL);
            
            psql.setInt(1, id);
            psql.setString(2, inicio);
            psql.setString(3, fin);
            
            
            resultado = psql.executeUpdate();
            psql.close();
            
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información monto :\n"
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
     
     public int Guardar_doc_ingreso (int id, int n_folios, String f_entrada, String tipo, String detalle, String asunto){
          
         int resultado = 0;

        Connection con = null;
        //INSERT INTO `documento_ing` (`ID_DOC_ING`, `N_FOLIOS`, `F_INGRESO`, `TIPO`, `DETALLE`, `ASUNTO`, 
        //`ID_MONTO`, `ID_ADMINISTRADO`) VALUES (NULL, '', NULL, '', '', NULL, '', '')
        String SSQL = "INSERT INTO `documento_ing` (`ID_DOC_ING`, `N_FOLIOS`, `F_INGRESO`, `TIPO`, `DETALLE`, `ASUNTO`,`ID_MONTO`, `ID_ADMINISTRADO`) "
                    + "VALUES (?, ?, ?,?, ?, ?,?,?)";
        try {
            con = metodospool.dataSource.getConnection();
            PreparedStatement psql = con.prepareStatement(SSQL);
            
            psql.setInt(1, id);
            psql.setInt(2, n_folios);
            psql.setString(3, f_entrada);   
            psql.setString(4,tipo );
            psql.setString(5,detalle );
            psql.setString(6,asunto );
            psql.setInt(7, id);
            psql.setInt(8, id);
            
            
            resultado = psql.executeUpdate();
            psql.close();
            
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información monto :\n"
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

     
private Date Mdificar_Plazo_FInal (int id, int tipo){
    
    return null;
}    
     
     public int Ultimo_Id_tramite (){

        int id_tramite=0;
        PreparedStatement ps = null;
        ResultSet rs=null;

        Connection con = null;

        //SELECT MAX(ID_DOC_ING) FROM `documento_ing`
        String SSQL = "SELECT MAX(ID_TRAMITE) FROM `tramite`";
            try {
                con = metodospool.dataSource.getConnection();
                ps= con.prepareStatement(SSQL);        
                rs=ps.executeQuery();
                if (rs.wasNull()) {
                    return 0;
                } else { 
                    while(rs.next()){
                    id_tramite=Integer.parseInt(rs.getString("MAX(ID_TRAMITE)")); 
                    System.out.println("ultimo id tramite : "+id_tramite);
                    }
                    return id_tramite;
                }
   
            } catch (Exception e) {
                System.out.println("error en busqueda "+e);
                return 0;
            }

     }
     
     public int Guardar_tramite(int id, int N_EXP, int AÑO){
         
         int ID_DOC_ING=id;        
         int ID_PLAZO=id;

         int resultado = 0;

        Connection con = null;
        //INSERT INTO `tramite` (`ID_TRAMITE`, `N_EXP`, `ID_DOC_ING`, `ID_DOC_SAL`, `ID_PLAZO`, `AÑO`) VALUES (NULL, '856', '5', NULL, '4', '2020');
        String SSQL = "INSERT INTO `tramite` (`ID_TRAMITE`, `N_EXP`, `ID_DOC_ING`, `ID_DOC_SAL`, `ID_PLAZO`, `AÑO`)"
                    + "VALUES (?,?,?,?,?,?)";
            try {
                con = metodospool.dataSource.getConnection();
                PreparedStatement psql = con.prepareStatement(SSQL);

                psql.setInt(1, id);
                psql.setInt(2, N_EXP);
                psql.setInt(3, ID_DOC_ING);
                psql.setString(4, null);
                psql.setInt(5, ID_PLAZO);
                psql.setInt(6, AÑO);

                resultado = psql.executeUpdate();
                psql.close();

                return resultado;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información ingreso :\n"
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
        
     public boolean Buscar_nro_reg(int nro_reg) {
         
       int nro=0;
        PreparedStatement ps = null;
        ResultSet rs=null;

        Connection con = null;

        //SELECT MAX(ID_DOC_ING) FROM `documento_ing`
        String SSQL = "SELECT * FROM `documento_ing` WHERE `ID_DOC_ING`=?";
            try {
            con = metodospool.dataSource.getConnection();
            
            ps= con.prepareStatement(SSQL);
            ps.setInt(1, nro_reg);
            rs=ps.executeQuery();
            while(rs.next()){
                nro=Integer.parseInt(rs.getString("ID_DOC_ING"));     
            }
              if (nro!=0){
                  return true;
              }  else{
                  return false;
              }
            } catch (Exception e) {
                System.out.println("error en busqueda de nro_reg"+e);
                return false;
            }
    }  
     
     
      public LinkedList Listar_tramite_existente (int N_REG) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        
        LinkedList<RESULT_TRAMITE> resultado = new LinkedList<RESULT_TRAMITE>();
        
        String tipo_monto, tipo_doc_ing,detalle,asunto, nombre, apellido, direccion;
        int cantidad;
        RESULT_TRAMITE r_tramite;
        
//        SELECT MONTO.TIPO,CANTIDAD, documento_ing.TIPO, DETALLE, ASUNTO,NOMBRE, APELLIDO, DIRECCION FROM MONTO INNER JOIN documento_ing ON MONTO.ID_MONTO=documento_ing.ID_MONTO INNER JOIN administrado ON documento_ing.ID_ADMINISTRADO=administrado.ID_ADMINISTRADO INNER JOIN tramite ON tramite.ID_DOC_ING=documento_ing.ID_DOC_ING WHERE tramite.ID_TRAMITE=1
        String sql= "SELECT MONTO.TIPO,CANTIDAD, documento_ing.TIPO, DETALLE, ASUNTO,NOMBRE, APELLIDO, DIRECCION FROM MONTO INNER JOIN documento_ing ON MONTO.ID_MONTO=documento_ing.ID_MONTO INNER JOIN administrado ON documento_ing.ID_ADMINISTRADO=administrado.ID_ADMINISTRADO INNER JOIN tramite ON tramite.ID_DOC_ING=documento_ing.ID_DOC_ING WHERE tramite.ID_TRAMITE=?" ;
        try {
            con = metodospool.dataSource.getConnection();
            ps= con.prepareStatement(sql);
            ps.setInt(1, N_REG);
            rs=ps.executeQuery();
            
            while(rs.next()){
                tipo_monto= rs.getString(1);
                cantidad=rs.getInt(2);
                tipo_doc_ing=rs.getString(3);
                detalle=rs.getString(4);
                asunto= rs.getString(5);
                nombre= rs.getString(6);
                apellido= rs.getString(7);
                direccion= rs.getString(8);
                r_tramite= new RESULT_TRAMITE( tipo_monto,cantidad, tipo_doc_ing,detalle,asunto, nombre, apellido, direccion);
                resultado.add(r_tramite);
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
     
}
