
package LOGICA;



import PRESENTACION.BUSCAR_EXPEDIENTES;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import static java.awt.SystemColor.text;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static javafx.scene.text.Font.font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class INTERFAZCOD1 {
    public class interfaz_detalle extends JFrame{
        
        public interfaz_detalle(){        
        super("DETALLES DE DOCUMENTO");        
        this.setSize(800,600);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);       
                }
        
}
    public void  tex_area(){
        
         
    JTextArea jtx = new JTextArea(30,60);
        jtx.setLineWrap(true);
        jtx.setWrapStyleWord(true);
        String salto = System.lineSeparator();
        String text = "REGISTRO CATASTRO : "+salto
                +" "+salto
                    + "FOLIOS : "+salto
                +" "+salto
                    + "EXPEDIENTE : "+salto
                +" "+salto
                    + "TIPO DE DOCUMENTO : "+salto
                +" "+salto
                    + "ADMINISTRADO : "+salto
                +" "+salto
                    + "ASUNTO : "+salto
                +" "+salto
                    + "DIRECCION : "+salto
                +" "+salto
                    + "MONTO PAGADO : "+salto
                +" "+salto
                    + "FECHA DE RECEPCION : "+salto
                +" "+salto
                    + "PROVEIDO :"+salto
                +" "+salto
                    + "FECHA DE PROVEIDO : "+salto
                +" "+salto
                    + "N° DE INFORME : "+salto
                +" "+salto
                    + "FECHA DE ENTREGA : "+salto
                +" "+salto
                    + "ENTREGADO AL USUARIO : ";
        
        jtx.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(jtx);
        jtx.setEditable(false);
        jtx.setForeground(Color.BLACK);
        jtx.setBackground(Color.WHITE);
          jtx.setText(text);
          Font font = new Font("PLAIN", Font.ITALIC, 16);
          jtx.setFont(font);
          interfaz_detalle INTERFAZ = new interfaz_detalle();        
            INTERFAZ.setVisible(true);
            
     
        INTERFAZ.add(scroll);
        INTERFAZ.pack();//método utilizado para que se muestren los //elementos de la ventana
        INTERFAZ.setVisible(true);
    
    }   
    
    
    public void btn_tabala(JTable tbl_digital){
    //ModeloTabla=new DefaultTableModel();
    Calendar c1 = GregorianCalendar.getInstance();
        c1.set(1980, 11, 23);
        Date fecha1 = c1.getTime();
        c1.set(1987, 07, 11);
        Date fecha2 = c1.getTime();
        c1.set(1971, 02, 01);
        Date fecha3 = c1.getTime();

        // Esta lista contiene los nombres que se mostrarán en el encabezado de cada columna de la grilla
        String[] columnas = new String[]{
            "N! de registro",
            "nombre de documento",
            "fecha ",
            "obs",
            "Botón"};

        // Estos son los tipos de datos de cada columna de la lista
        final Class[] tiposColumnas = new Class[]{
            java.lang.String.class,
            java.lang.String.class,            
            Date.class,
            java.lang.String.class,
            JButton.class // <- noten que aquí se especifica que la última columna es un botón
        };

        // Agrego los registros que contendrá la grilla.
        // Observen que el último campo es un botón
        Object[][] datos = new Object[][]{
            {1025,"infomrme de respuesta N°23",fecha1,"documento tipo word",new JButton("VER")},
            {5858,"infomrme de respuesta N°32",fecha2,"documento tipo word",new JButton("VER")},
            {7725,"infomrme de respuesta N°50",fecha3,"documento tipo word",new JButton("VER")},
        };

        // Defino el TableModel y le indico los datos y nombres de columnas
        tbl_digital.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                columnas) {
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
            Class[] tipos = tiposColumnas;

            @Override
            public Class getColumnClass(int columnIndex) {
                // Este método es invocado por el CellRenderer para saber que dibujar en la celda,
                // observen que estamos retornando la clase que definimos de antemano.
                return tipos[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                // Sobrescribimos este método para evitar que la columna que contiene los botones sea editada.
                return !(this.getColumnClass(column).equals(JButton.class));
            }
        });

        // El objetivo de la siguiente línea es indicar el CellRenderer que será utilizado para dibujar el botón
        tbl_digital.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                /**
                 * Observen que todo lo que hacemos en éste método es retornar el objeto que se va a dibujar en la 
                 * celda. Esto significa que se dibujará en la celda el objeto que devuelva el TableModel. También 
                 * significa que este renderer nos permitiría dibujar cualquier objeto gráfico en la grilla, pues 
                 * retorna el objeto tal y como lo recibe.
                 */
                return (Component) objeto;
            }
        });

        /**
         * Por último, agregamos un listener que nos permita saber cuando fue pulsada la celda que contiene el botón.
         * Noten que estamos capturando el clic sobre JTable, no el clic sobre el JButton. Esto también implica que en 
         * lugar de poner un botón en la celda, simplemente pudimos definir un CellRenderer que hiciera parecer que la 
         * celda contiene un botón. Es posible capturar el clic del botón, pero a mi parecer el efecto es el mismo y 
         * hacerlo de esta forma es más "simple"
         */
        tbl_digital.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tbl_digital.rowAtPoint(e.getPoint());
                int columna = tbl_digital.columnAtPoint(e.getPoint());

                /**
                 * Preguntamos si hicimos clic sobre la celda que contiene el botón, si tuviéramos más de un botón 
                 * por fila tendríamos que además preguntar por el contenido del botón o el nombre de la columna
                 */
                if (tbl_digital.getModel().getColumnClass(columna).equals(JButton.class)) {
                    /**
                     * Aquí pueden poner lo que quieran, para efectos de este ejemplo, voy a mostrar
                     * en un cuadro de dialogo todos los campos de la fila que no sean un botón.
                     */
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < tbl_digital.getModel().getColumnCount(); i++) {
                        if (!tbl_digital.getModel().getColumnClass(i).equals(JButton.class)) {
                            sb.append("\n").append(tbl_digital.getModel().getColumnName(i)).append(": ").append(tbl_digital.getModel().getValueAt(fila, i));
                        }
                    }
                    Icon icono= new ImageIcon(getClass().getResource("140x140sf.png"));
                    //JOptionPane.showMessageDialog(null,"interfaz de prueba");
                    JOptionPane.showMessageDialog(null, "mensaje de prueba sobre documento s buscados", null, fila, icono);
                }
            }
        });
    
    }
    
   
}
