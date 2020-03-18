package LOGICA;

public class RESULT_CBBOX_PROVEIDO_USU {
     public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    String id_rol,nombre,ap_paterno,usuario;
    public RESULT_CBBOX_PROVEIDO_USU(String id_rol, String nombre, String ap_paterno, String usuario) {
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.usuario = usuario;
    }
}
