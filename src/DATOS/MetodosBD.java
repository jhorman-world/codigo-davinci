package DATOS;

import DATOS.Pool;
import LOGICA.RESULT_CBBOX_PROVEIDO_USU;
import LOGICA.RESULT_LISTAR_EXPE;
import LOGICA.RESULT_LOG;
import PRESENTACION.MENU_USUARIO_PRINCIPAL_1;
import PRESENTACION.MIS_EXPEDIENTES;
import PRESENTACION.PROVEIDOS;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MetodosBD {
    
Pool metodospool = new Pool();
    
public int Guardar(String Nombre, String AP_paterno, String AP_materno, String DNI, 
                   String Password, String Usuario, String ID_rol, String estado, String Fecha_registro){

int resultado = 0;

Connection con = null;

String SSQL = "INSERT INTO usuario ( Nombre,  AP_paterno,  AP_materno,  DNI, \n" +
"                    Password,  Usuario,  ID_rol,  estado, Fecha_registro) "
            + "VALUES ( ?, ?, ?, ?, ?,?,?,?,?)";


    try {
    
        con = metodospool.dataSource.getConnection();
        
        PreparedStatement psql = con.prepareStatement(SSQL);
        //psql.setInt(1, ID_usuario);
        psql.setString(1, Nombre);
        psql.setString(2, AP_paterno);
        psql.setString(3, AP_materno);
        psql.setString(4, DNI);
        psql.setString(5, Password);
        psql.setString(6, Usuario);
        psql.setString(7, ID_rol);
        psql.setString(8, estado);
        psql.setString(9, Fecha_registro);
      
        resultado = psql.executeUpdate();
        
        psql.close();
                    
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        
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
    return resultado;
    
}       
  


public int guardar_imagenpdf( String documento, String nombre_administrado,String tipo_documento ){
  File docum = new File(documento);
  
int resultado = 0;
Connection con = null;
    String SSQL= "INSERT INTO documento (documento, nombre_administrado, tipo_docuemnto)+ Values(?,?,?)";
try {
        
        FileInputStream convertir_imagen = new FileInputStream (docum);
        con = metodospool.dataSource.getConnection();
        
        PreparedStatement psql = con.prepareStatement(SSQL);
        psql.setBlob(1, convertir_imagen,docum.length());
        psql.setString(2, nombre_administrado);
        psql.setString(3, tipo_documento);
      
        resultado = psql.executeUpdate();
        
        psql.close();
                    
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        
    } catch (FileNotFoundException ex) {
    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información (pdf):\n"
                                     + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
    
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

    return resultado;
    
   
    

}
    

//Pool metodospool = new Pool();
DefaultTableModel ModeloTabla;
public void Buscar_usu(String valor, String filtro, JTable tbl_consulta){
    //filtro=txt_busqueda.getText();
    String [] columnas={"ID","Nombres","Ap. paterno","Ap. materno","DNI", "password", "usuario","rol", "Estado", "Fecha de registro"};
    String [] registro=new String[10];
    ModeloTabla=new DefaultTableModel(null,columnas); 
    String SSQL;
    Connection conect = null;
 
    if(filtro.equals("Nombre")){
    
        SSQL= "SELECT ID_usuario, Nombre,AP_paterno, AP_materno, DNI, Password, Usuario, ID_rol "
              + ",estado,Fecha_registro FROM usuario WHERE Nombre LIKE '%"+valor+"%'";
        
    }else if(filtro.equals("DNI")){
    
        SSQL= "SELECT ID_usuario, Nombre,AP_paterno, AP_materno, DNI, Password, Usuario, ID_rol "
              + ",estado,Fecha_registro FROM usuario WHERE DNI LIKE '%"+valor+"%'";
    
    }else{    
        SSQL= "SELECT ID_usuario, Nombre,AP_paterno, AP_materno, DNI, Password, Usuario, ID_rol "
              + ",estado,Fecha_registro FROM usuario WHERE ID_usuario LIKE '%"+valor+"%'";
        }  
                
    try {

        conect = metodospool.dataSource.getConnection();
        PreparedStatement st = conect.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();

        while (rs.next()){
          
            registro[0]=rs.getString("ID_usuario");
            registro[1]=rs.getString("Nombre");
            registro[2]=rs.getString("AP_paterno");
            registro[3]=rs.getString("AP_materno");
            registro[4]=rs.getString("DNI");
            registro[5]=rs.getString("Password");
            registro[6]=rs.getString("Usuario");
            registro[7]=rs.getString("ID_rol");
            registro[8]=rs.getString("estado");
            registro[9]=rs.getString("Fecha_registro");
            ModeloTabla.addRow(registro);           
        }        
        tbl_consulta.setModel(ModeloTabla);

    } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    
    }finally{

        if(conect!=null){        
            try {
                conect.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

            }      
        }        
    }

}


public void mis_expedientes(){
    String [] registro=new String[10];
    String SSQL;
    Connection conect = null;
    SSQL="SELECT N_EXP, NOMBRE, TIPO,DETALLE,F_INGRESO FROM tramite INNER JOIN administrado ON tramite.ID_TRAMITE= administrado.ID_ADMINISTRADO INNER JOIN documento_ing ON tramite.ID_TRAMITE = documento_ing.ID_DOC_ING";
                   
    try {

        conect = metodospool.dataSource.getConnection();
        PreparedStatement st = conect.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();
        DefaultTableModel model = (DefaultTableModel) MIS_EXPEDIENTES.tbl_expedientes.getModel();
        while (rs.next()){
          //model[0]=rs.getString("N_EXP");
            registro[0]=rs.getString("N_EXP");
            registro[1]=rs.getString("NOMBRE");
            registro[2]=rs.getString("TIPO");
            registro[3]=rs.getString("DETALLE");
            registro[5]=rs.getString("F_INGRESO");
            
            model.addRow(registro);           
        }        
        MIS_EXPEDIENTES.tbl_expedientes.setModel(model);

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    
    }finally{

        if(conect!=null){        
            try {
                conect.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

            }      
        }        
    }
}
public String Buscar_id_rol (String usuario){
        String id_rol=null;
        String val_rol=null;
        PreparedStatement ps = null;
        ResultSet rs=null;

    Connection con = null;

    String SSQL = "SELECT ID_rol from usuario WHERE Usuario=?";
        try {
            con = metodospool.dataSource.getConnection();
            
            ps= con.prepareStatement(SSQL);
            ps.setString(1, usuario);
            rs=ps.executeQuery();
            while(rs.next()){
                id_rol=rs.getString("ID_rol");
                val_rol=id_rol;
                System.out.println("id rol : "+id_rol);
                                  
            }
            //if (id_rol.equals("Secretaria")) {
              //      MENU_USUARIO_PRINCIPAL_1.sm_nuevo_usuario.setEnabled(false);
                    //MENU_USUARIO_PRINCIPAL_1.sm_nuevo_ad.setEnabled(false);
              //  }
            switch(id_rol)
            {
                case "Secretaria":
                    MENU_USUARIO_PRINCIPAL_1.sm_nuevo_usuario.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_nuevo_ad.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_busq_usuario.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_busq_logs.setEnabled(false);
                case "Administrativo":
                    MENU_USUARIO_PRINCIPAL_1.sm_nuevo_usuario.setEnabled(false);
                    MIS_EXPEDIENTES.btn_proveido.setEnabled(false);
                case "Ingeniero":
                    MENU_USUARIO_PRINCIPAL_1.sm_nuevo_usuario.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_nuevo_ad.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_busq_usuario.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_busq_logs.setEnabled(false);
                    MIS_EXPEDIENTES.btn_proveido.setEnabled(false);
                case "Notificador":
                     MENU_USUARIO_PRINCIPAL_1.sm_nuevo_usuario.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_nuevo_ad.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_busq_usuario.setEnabled(false);
                    MENU_USUARIO_PRINCIPAL_1.sm_busq_logs.setEnabled(false);
                    MIS_EXPEDIENTES.btn_proveido.setEnabled(false);
                default: ;

            }
            
           return id_rol;           
        } catch (Exception e) {
            System.out.println("error en busqueda "+e);
           return null;
        }

    }

public String Buscar_inic_sec (String usuario){
        String secioninic=null;
        String secioninic2=null;
        String valinic=null;
        PreparedStatement ps = null;
        ResultSet rs=null;

    Connection con = null;

    String SSQL = "SELECT Nombre,AP_paterno,AP_materno from usuario WHERE Usuario=?";
        try {
            con = metodospool.dataSource.getConnection();
            
            ps= con.prepareStatement(SSQL);
            ps.setString(1, usuario);
            rs=ps.executeQuery();
            while(rs.next()){
                secioninic=rs.getString("Nombre"); 
                secioninic2=rs.getString("AP_paterno"); 
                valinic=secioninic+" "+secioninic2;
                System.out.println("sesion iniciada por : "+valinic);
                MIS_EXPEDIENTES.lbl_sesion.setText(" "+valinic);
            }
            
           return valinic;
        } catch (Exception e) {
            System.out.println("error en busqueda "+e);
           return null;
        }

    }

public int guardar_proveido(String NOMBRE_PROV,String ID_DOC_ING){

    int resultado = 0;

Connection con = null;

String SSQL = "INSERT INTO proveido ( NOMBRE_PROV,ID_DOC_ING) "
            + "VALUES ( ?, ?)";


    try {
    
        con = metodospool.dataSource.getConnection();
        
        PreparedStatement psql = con.prepareStatement(SSQL);
        //psql.setInt(1, ID_usuario);
        psql.setString(1, NOMBRE_PROV);
        psql.setString(2, ID_DOC_ING);
                     
        resultado = psql.executeUpdate();
        
        psql.close();
                    
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        
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
    return resultado;

}

public LinkedList listar_expe(){
        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con = null;
        
LinkedList<RESULT_CBBOX_PROVEIDO_USU> resultado = new LinkedList<RESULT_CBBOX_PROVEIDO_USU>();
        String id_rol,nombre,ap_paterno,usuario;
        RESULT_CBBOX_PROVEIDO_USU r_log_prov;
        
        
        String sql= "SELECT ID_rol,NOMBRE,AP_paterno,Usuario FROM usuario ORDER BY NOMBRE ASC" ;
        try {
            con = metodospool.dataSource.getConnection();
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                id_rol= rs.getString(1);
                nombre=rs.getString(2);
                ap_paterno=rs.getString(3);
                usuario=rs.getString(4);
                r_log_prov= new RESULT_CBBOX_PROVEIDO_USU( id_rol, nombre, ap_paterno, usuario);
                resultado.add(r_log_prov);
            }                
                return resultado;                
            }
         catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscarlist datos");
            return null;}
        
}

public LinkedList ver_mis_expe(){
        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con = null;
        
LinkedList<RESULT_LISTAR_EXPE> resultado = new LinkedList<RESULT_LISTAR_EXPE>();
        String n_expe,nombre,tipo,detalle,proveido_a,fecha,n_de_informe;
        RESULT_LISTAR_EXPE r_mis_expe;
        
        
        String sql= "SELECT N_EXP, CONCAT(NOMBRE,' ', APELLIDO), TIPO,DETALLE,NOMBRE_PROV,F_INGRESO,ID_RPTA FROM tramite INNER JOIN administrado ON tramite.ID_TRAMITE= administrado.ID_ADMINISTRADO INNER JOIN documento_ing ON tramite.ID_TRAMITE = documento_ing.ID_DOC_ING INNER JOIN proveido ON documento_ing.ID_DOC_ING=proveido.ID_PROVEIDO" ;
        try {
            con = metodospool.dataSource.getConnection();
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                n_expe= rs.getString(1);
                nombre=rs.getString(2);
                tipo=rs.getString(3);
                detalle=rs.getString(4);
                proveido_a=rs.getString(5);
                fecha=rs.getString(6);
                n_de_informe=rs.getString(7);
                r_mis_expe= new RESULT_LISTAR_EXPE( n_expe,nombre,tipo,detalle,proveido_a,fecha,n_de_informe);
                resultado.add(r_mis_expe);
            }                
                return resultado;                
            }
         catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscarlist datos");
            return null;}
        
}
public int actualizar_proveido(String NOMBRE_PROV,String F_PROVEIDO,String HORA_PROV,String ID_USUARIO,String ID_RPTA,String ID_DOC_ING){
int resultado = 0;
Connection con = null;
String SSQL = "UPDATE proveido  SET  NOMBRE_PROV,F_PROVEIDO,HORA_PROV,ID_USUARIO,ID_RPTA WHERE ID_DOC_ING='"
              + "VALUES ( ?,?,?,?,?,?)";
    try {    
        con = metodospool.dataSource.getConnection();        
        PreparedStatement psql = con.prepareStatement(SSQL);
        //psql.setInt(1, ID_usuario);
        psql.setString(1, NOMBRE_PROV);
        psql.setString(2, F_PROVEIDO);
        psql.setString(3, HORA_PROV);
        psql.setString(4, ID_USUARIO);
        psql.setString(5,ID_RPTA); 
        //psql.setString(6, ID_DOC_ING);
        
                
        resultado = psql.executeUpdate();        
        psql.close();
        System.out.println(psql);
    } catch (SQLException e) {    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);        
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
    return resultado;
}
}
      