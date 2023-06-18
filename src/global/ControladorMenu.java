/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import ticketdemil.Formularios.ClienteEditarForm;
import ticketdemil.Formularios.ClienteNuevoForm;
import ticketdemil.Formularios.ClienteVerForm;
import ticketdemil.Formularios.EmpleadoEditarForm;
import ticketdemil.Formularios.EmpleadoNuevoForm;
import ticketdemil.Formularios.EmpleadoVerForm;
import ticketdemil.Formularios.ProductoEditarForm;
import ticketdemil.Formularios.ProductoNuevoForm;
import ticketdemil.Formularios.ProductoVerForm;
import ticketdemil.Formularios.TicketEditarForm;
import ticketdemil.Formularios.TicketNuevoForm;
import ticketdemil.Formularios.TicketVerForm;

/**
 *
 * @author antit
 */
public class ControladorMenu {
    public static String nombreMenuActivo;
    public static String nombreMenuNuevo;
    
    public static void cambiarBotonActivo(JPanel cardsPanel)
    {
        JSplitPane splitPane = (JSplitPane) cardsPanel.getParent();
        Component[] splitPaneComponents = splitPane.getComponents();
        JButton currentBtn = new JButton("dummy");
        JButton activeBtn = new JButton("dummy");
        for (Component splitPaneComponent : splitPaneComponents) {
            if(splitPaneComponent instanceof JPanel jPanel){
                if(splitPaneComponent.getName().equals("menuPanel")){
                    Component[] components = jPanel.getComponents();
                    for(Component component : components){
                        if(component instanceof JButton jButton){
                            if(component.getName().equals(nombreMenuNuevo)){
                                currentBtn = jButton;
                            }
                            if(component.getName().equals(nombreMenuActivo)){
                                activeBtn = jButton;
                            }                            
                        }
                    }
                    //currentBtn.setBorderPainted(false);
                    activeBtn.setBackground(PaletaColores.salmon);
                    currentBtn.setBackground(Color.red);
                    nombreMenuActivo = currentBtn.getName();
                    break;
                }
            }
        }
    }
    
    public static void cambiarFormulario(CardLayout cardLayout, JPanel cardsPanel, JPanel form, String nombreForm)
    {
        //CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        cardsPanel.add(form, nombreForm);
        cardLayout.show(cardsPanel, nombreForm);
        //cambiarBotonActivo((JButton) evt.getSource());
        SwingUtilities.updateComponentTreeUI(cardsPanel);
        cardsPanel.repaint();
    }
}
