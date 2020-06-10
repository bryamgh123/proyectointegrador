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
        if (NomTabla.equals("Nombre")) {
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if (NomTabla.equals("Correo")) {
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if (NomTabla.equals("Apellido")) {
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if (NomTabla.equals("DNI")){
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if (NomTabla.equals("Pais")){
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if (NomTabla.equals("Ciudad")){
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if(NomTabla.equals("Postal")){
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if(NomTabla.equals("Direccion")){
            obj.CargarTabla(InstruccionSQL, Tabla);
        }
        if(NomTabla.equals("Numero_de_tarjeta")){
            obj.CargarTabla(InstruccionSQL,Tabla);
        }
        
        
        return Tabla;
    }
}
