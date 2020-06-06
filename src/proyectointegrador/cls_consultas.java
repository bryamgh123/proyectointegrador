/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class cls_consultas {

    public JTable Consulta(String NomTabla, JTable Tabla, String InstruccionSQL) {
        cls_conexion obj = new cls_conexion();

        if (NomTabla.equals("Tabla")) {
            obj.CargarTabla(InstruccionSQL,  Tabla);
        }
        if (NomTabla.equals("ID")) {
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if (NomTabla.equals("Modelos")) {
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        
        return Tabla;
    }
}
