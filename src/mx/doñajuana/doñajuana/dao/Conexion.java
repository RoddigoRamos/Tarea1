/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.doñajuana.doñajuana.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class Conexion {

    private static Conexion conexion;
    private Connection connection;

    private Conexion() {

    }

    public static Conexion getInstance() {
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }

    public Connection getConexion(){
        if(this.connection == null){
            String driver = "org.postgresql.Driver";
            String cadenaConexion = "jdbc:postgresql://localhost:5432/usuarios";
            String user = "usuarios";
            String password = "123456";
            
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(
                        cadenaConexion, user, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger
                    (Conexion.class.getName())
                        .log(Level.SEVERE, null, ex); //genera archivos de log que nos dice elc omportamiento de la accion (excepciones, errores, fallos)
                //TODO atender recuperación a fallos.
            }
        }
        return connection;
    }
    
}
