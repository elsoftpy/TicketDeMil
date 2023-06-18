/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author antit
 */
public class Usuarios {
    public static String id;
    public static String username;
    public static String nombre;
    public static String apellido;
    public static String email;
    public static String telefono;
    
    public static List<String>getUsuario()
    {
        List<String> usuario = new ArrayList<>();
        usuario.add(id);
        usuario.add(username);
        usuario.add(nombre);
        usuario.add(apellido);
        usuario.add(email);
        usuario.add(telefono);
        
        return usuario;
    }
    
    public static void setUsuario(String idUsuario, String name, String nombreUsuario, String apellidoUsuario, String emailUsuario, String telefonoUsuario)
    {
        id = idUsuario;
        username = name;
        nombre = nombreUsuario;
        apellido = apellidoUsuario;
        email = emailUsuario;
        telefono = telefonoUsuario;
    }
    
    @Override
    public String toString()
    {
        return username;
    }
    
}
