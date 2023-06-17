/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketdemil;
import java.sql.*;
/**
 *
 * @author antit
 */
public class DBConnection {
    //CONEXION DE ELIAS
//    static final String DB_URL =  "jdbc:sqlserver://localhost\\elijahspire:1433;databaseName=Cine;encrypt=true;trustServerCertificate=true";
    //CONEXION DE PABLO
    static final String DB_URL =  "jdbc:sqlserver://localhost:1433;databaseName=TICKET;encrypt=true;trustServerCertificate=true";
    static final String USUARIO = "sa";
//    CONTRASEÑA DE ELIAS
//    static final String PASSWORD = "asstalavista";
    //CONTRASEÑA DE PABLO
     static final String PASSWORD = "root";
    public static Connection conectarDB(){
        try{
            Connection cn;
            cn = DriverManager.getConnection(DB_URL,USUARIO,PASSWORD);
            return cn;
       } catch (SQLException i){
            System.out.println("Error al conectar DB");
            return null;
       }
    }
}
