/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

/**
 *
 * @author USUARIO
 */
public class RESULT_LISTAR_EXPE {
     public String getN_expe() {
        return n_expe;
    }

    public void setN_expe(String n_expe) {
        this.n_expe = n_expe;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String getProveido_a() {
        return proveido_a;
    }

    public void setProveido_a(String proveido_a) {
        this.proveido_a = proveido_a;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getN_de_informe() {
        return n_de_informe;
    }

    public void setN_de_informe(String n_de_informe) {
        this.n_de_informe = n_de_informe;
    }
    
    String n_expe,nombre,tipo,detalle,proveido_a,fecha,n_de_informe;
    public RESULT_LISTAR_EXPE(String n_expe,String nombre,String tipo,String detalle,String proveido_a,String fecha,String n_de_informe) {
        this.n_expe = n_expe;
        this.nombre = nombre;
        this.tipo = tipo;
        this.detalle = detalle;
        this.proveido_a=proveido_a;
        this.fecha=fecha;
        this.n_de_informe=n_de_informe;
    }
}
