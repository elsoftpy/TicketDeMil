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
    static final String DB_URL =  "jdbc:sqlserver://localhost\\elijahspire:1433;databaseName=Cine;encrypt=true;trustServerCertificate=true";
    static final String USUARIO = "sa";
    static final String PASSWORD = "asstalavista";

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
