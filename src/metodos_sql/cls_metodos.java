/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class cls_metodos {
    public static cls_conexionbd cnx= new cls_conexionbd();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_num=0;
    
    public int guardar(String nombre , String apellidos ,String correo, String contraseña){
        int resultado =0;
        Connection conexion=null;
        
        String sentencia_guardar=("INSERT INTO usuarios (nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)");
        try{
            conexion= cls_conexionbd.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        }catch(Exception e){
          System.out.println(e);
        }
        return resultado;
    }
  public static String buscarNombre(String correo){
      String busqueda_nombre= null;
      Connection conexion= null;
      try{
          conexion = cls_conexionbd.conectar();
          String sentencia_buscar =("SELECT nombre, apellidos from usuarios where correo = '" + correo + "' ");
          sentencia_preparada = conexion.prepareCall(sentencia_buscar);
          resultado = sentencia_preparada.executeQuery();
          if(resultado.next()){
              String nombre = resultado.getString("nombre");
              String apellidos = resultado.getString("apellidos");
              busqueda_nombre = (nombre + " " +apellidos);
              
          }
          conexion.close();
          
      }catch (Exception e){
          System.out.println(e);
      }
        return busqueda_nombre;
     
  }
  public static String buscarUsuarioRegistrado(String correo, String contraseña){
      String busqueda_usuario = null;
      Connection conexion = null;
      try{
          conexion = cls_conexionbd.conectar();
          String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña from usuarios where correo = '"+correo+"'&& contraseña = '"+contraseña+"'  ");
          sentencia_preparada= conexion.prepareStatement(sentencia_buscar_usuario);
          resultado = sentencia_preparada.executeQuery();
          if(resultado.next()){
              busqueda_usuario = "Usuario encontrado";
          }else{
              busqueda_usuario = "Usuario no encontrado";
          }
      }catch(Exception e){
          System.out.println(e);
          
      }
      return busqueda_usuario;
  }
  // Lo que hacemos es sólo preguntar si el Código de Error de la Excepción atrapada es igual al Código de Error para 
  //Duplicate Entry o Entidades Duplicadas (Campos Únicos) que es 1062. 
  //Si es igual significa que se está queriendo ingresar un dato en un campo unique que ya existe en la tabla.
  public static int RegistrarFuncionario(String nombre , String apellidos ,String correo, String contraseña) {
    //String busqueda_usuario = null;
      Connection conexion = null;
        try {
            int ingresados = 0;
            conexion = cls_conexionbd.conectar();
            
            String query = "INSERT INTO usuarios (nombre,apellidos,correo,contraseña)  VALUES (?,?,?,?)";
                cls_conexionbd.conectar();
                     sentencia_preparada = conexion.prepareStatement(query);
                     sentencia_preparada.setString(1, nombre);
                     sentencia_preparada.setString(2, apellidos);
                     sentencia_preparada.setString(3, correo);
                     sentencia_preparada.setString(4, contraseña);
                     ingresados = sentencia_preparada.executeUpdate();
                
                return ingresados;
        } 
        catch (SQLException e) 
        {
            if (e.getErrorCode() == 1062)
                JOptionPane.showMessageDialog (null, "¡El correo ya existe!", "Correo Duplicado", JOptionPane.ERROR_MESSAGE);
            
            else
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
            return 0;
        }
    }
}
