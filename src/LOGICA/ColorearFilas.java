/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;


public class ColorearFilas extends DefaultTableCellRenderer {
    

@Override
public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){

    
    
super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);


    if (table.getValueAt(row, 1).toString().equals("jhorman quispe acuña") ) {

         setBackground(Color.WHITE);

    } else if(table.getValueAt(row, 1).toString().equals("gaby rojas mallqui")){

         setBackground(Color.YELLOW);

    } else if(table.getValueAt(row, 1).toString().equals("percy berrocal flores")){

         setBackground(Color.red);

    } else {

         setBackground(Color.WHITE);
    }

 return this;


}



}

            
