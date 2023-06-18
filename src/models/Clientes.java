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
public class Clientes {
    public static String id;
    public static String idUsuario;
    
    public static List<String>getClientes()
    {
        List<String> cliente = new ArrayList<>();
        cliente.add(id);
        cliente.add(idUsuario);
        
        return cliente;
    }
    
    public static void setCliente(String idCliente, String userId )
    {
        id = idCliente;
        idUsuario = userId;
    }
    
    @Override
    public String toString()
    {
        return id;
    }
}
