/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ACER
 */
public class cls_conexionbd {
                             //jdbc:mysql://Localhost:3307/trabajo"
    public static String url = "jdbc:mysql://Localhost:3307/base_final";
    public static String usuario = "root";
    public static String contraseña = "";
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static Connection conectar(){
        Connection conexion=null;
        try{
            Class.forName(clase);
            conexion= DriverManager.getConnection(url, usuario,contraseña);
            System.out.print("Conexion Establecaida ");
        }catch(Exception e){
            System.out.print(e);
        }
        return conexion;
    }
            
}
