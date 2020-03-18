/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

/**
 *
 * @author ADMIISTRADOR
 */
public class RESULT_TRAMITE {

    public String getTipo_monto() {
        return tipo_monto;
    }

    public void setTipo_monto(String tipo_monto) {
        this.tipo_monto = tipo_monto;
    }

    public String getTipo_doc_ing() {
        return tipo_doc_ing;
    }

    public void setTipo_doc_ing(String tipo_doc_ing) {
        this.tipo_doc_ing = tipo_doc_ing;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    String tipo_monto, tipo_doc_ing,detalle,asunto, nombre, apellido, direccion;
    int cantidad;

    public RESULT_TRAMITE(String tipo_monto, int cantidad ,String tipo_doc_ing, String detalle, String asunto, String nombre, String apellido, String direccion) {
        this.tipo_monto = tipo_monto;
        this.tipo_doc_ing = tipo_doc_ing;
        this.detalle = detalle;
        this.asunto = asunto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cantidad = cantidad;
    }
    
    
}
