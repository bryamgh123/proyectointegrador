/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import com.sun.media.jfxmedia.logging.Logger;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ACER
 */
public class cls_AdminReporte {

    private static final String URL = "jdbc:mysql://Localhost:3307/base_final?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static java.sql.Connection connection = null;

    public JasperViewer Reporte(String ruta) {
        JasperViewer obj = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexion satisfactoria");
            } catch (SQLException exep) {
                JOptionPane.showMessageDialog(null, exep.getMessage(), "Error en base de datos", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException exep) {
                JOptionPane.showMessageDialog(null, exep.getMessage(), "No se encontro el controlador", JOptionPane.ERROR_MESSAGE);
            }

            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint imprime = JasperFillManager.fillReport(reporte, null, connection);
            obj = new JasperViewer(imprime, false);
            obj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            obj.setVisible(true);

        } catch (Exception e) {
        java.util.logging.Logger.getLogger(cls_AdminReporte.class.getName()).log(Level.SEVERE, null, e);
        }
        return (obj);
    }

}
