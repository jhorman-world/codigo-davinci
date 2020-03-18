/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import DATOS.Consultas_ingreso;
import DATOS.MetodosBD;
import LOGICA.RESULT_CBBOX_PROVEIDO_USU;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author ADMIISTRADOR
 */
public class PRUEBASSSSSSSSSSSSSS {
    public static void main(String[] args) {
        Date date = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH:mm");
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            //DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println("fecha: "+dateFormat.format(date));
            System.out.println("hora :"+hourFormat.format(date));   
                  
            
    }
}
