/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import java.sql.*;
import java.util.List;

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
    
    public void ejecutarInsert(List<String> campos) throws Exception
    {
        CallableStatement cst;
        try{
            Connection cn;
            cn = DBConnection.conectarDB();
            //cst = cn.prepareCall("{call ?(?)}" );
            StringBuilder builder = new StringBuilder();
            for (String campo : campos) {
                builder.append("?,");
            }
            String parametros = builder.deleteCharAt(builder.length() - 1).toString();
            cst = cn.prepareCall("{call ?("+parametros+")}") ;
            int index = 1;
            cst.setString(index, nombreSP);
            for(String campo : campos){
                index++;
                cst.setString(index++, campo);
            }
            cst.execute();
            cn.close();
        }catch(SQLException ex){
            throw new Exception(ex.getMessage());
        }
    }
    
    public void ejecutarDelete(int id) throws Exception
    {
        CallableStatement cst;
        
        try{
            Connection cn;
            cn = DBConnection.conectarDB();
            cst = cn.prepareCall("{call ?(?)}" );
            cst.setString(1, nombreSP);
            cst.setInt(2, id);
            cst.execute();
            cn.close();
        }catch(SQLException ex){
            throw new Exception(ex.getMessage());
        }
    }
    
}
