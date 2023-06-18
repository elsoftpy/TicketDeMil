/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antit
 */
public class Empleados {
    public static String id;
    public static String idUsuario;
    
    public static List<String>getEmpleado()
    {
        List<String> empleado = new ArrayList<>();
        empleado.add(id);
        empleado.add(idUsuario);
        
        return empleado;
    }
    
    public static void setEmpleado(String idEmpleado, String userId )
    {
        id = idEmpleado;
        idUsuario = userId;
    }
    
    @Override
    public String toString()
    {
        return id;
    }
}
