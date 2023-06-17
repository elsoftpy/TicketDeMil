/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketdemil;

import ticketdemil.Formularios.LoginForm;
import java.awt.Color;

/**
 *
 * @author antit
 */
public class TicketDeMil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea la instancia del login form como formulario inicial de la app
        LoginForm loginForm = new LoginForm();
        // muestra el login form
        loginForm.setVisible(true);
        // setea el tamaño inicial del formulario de acuerdo a la propiedad preferredSize
        loginForm.pack();
        // centra el formulario en la pantalla
        loginForm.setLocationRelativeTo(null);
    }
    
}
