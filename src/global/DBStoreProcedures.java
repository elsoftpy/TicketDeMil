/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import java.sql.*;

/**
 *
 * @author antit
 */
public class DBStoreProcedures {
    private String nombreSP;
    
    public DBStoreProcedures(String nombre)
    {
        nombreSP = nombre;
    }
    
    public void ejecutarDelete(int id) throws Exception
    {
        CallableStatement cst;
        
        try{
            //cst = DBConnection.conectarDB().prepareCall("{call "+ nombreSP +"(?)}" );
            cst = DBConnection.conectarDB().prepareCall("{call ?(?)}" );
            cst.setString(1, nombreSP);
            cst.setInt(2, id);
            //return  cst.execute();
        }catch(SQLException ex){
            //throw new Exception(ex.getMessage());
            throw new Exception("tkk la erea");
        }
    }
    
}
