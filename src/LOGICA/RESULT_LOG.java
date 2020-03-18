/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author ADMIISTRADOR
 */
public class RESULT_LOG {

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getH_ingreso() {
        return h_ingreso;
    }

    public void setH_ingreso(Time h_ingreso) {
        this.h_ingreso = h_ingreso;
    }

    public Time getH_salida() {
        return h_salida;
    }

    public void setH_salida(Time h_salida) {
        this.h_salida = h_salida;
    }
    String usuario;
    Date fecha;
    Time h_ingreso, h_salida;

    public RESULT_LOG(String usuario, Date fecha, Time h_ingreso, Time h_salida) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.h_ingreso = h_ingreso;
        this.h_salida = h_salida;
    }

    
}