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
public class cls_metodos {
     proyectointegrador.cls_conexion obj= new proyectointegrador.cls_conexion();
    public void CargarDatos(JTable Tabla) {
        obj.CargarTabla("SELECT id_busq as ID, mode_busq as Modelo, cara_busq as Caracteristica, colo_busq as Color, cant_busq as Tamaño, prec_busq as Precio  from tabla_busq_venta;", Tabla);
    } 
   
}
