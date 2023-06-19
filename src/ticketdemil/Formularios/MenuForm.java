/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketdemil.Formularios;

import global.ControladorMenu;
import java.awt.CardLayout;
import java.util.List;
import models.Usuarios;

/**
 *
 * @author antit
 */
public class MenuForm extends javax.swing.JFrame {

    // variable para instanciar el panel que contiene el diseño de la aplicación
    CardLayout cardLayout;
    ProductoVerForm productoVerForm = new ProductoVerForm();
    ProductoNuevoForm productoNuevoForm = new ProductoNuevoForm();
    ClienteVerForm clienteVerForm = new ClienteVerForm();
    ClienteNuevoForm clienteNuevoForm = new ClienteNuevoForm();
    EmpleadoVerForm empleadoVerForm = new EmpleadoVerForm();
    EmpleadoNuevoForm empleadoNuevoForm = new EmpleadoNuevoForm();
    TicketVerForm ticketVerForm = new TicketVerForm();
    TicketNuevoForm ticketNuevoForm = new TicketNuevoForm();
    
    
    
    /**
     * Creates new form MenuForm
     */
    public MenuForm() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        // se instancia el panel principal
        cardLayout = (CardLayout) CardsPanel.getLayout();
        List<String> usuario = Usuarios.getUsuario();
        lblUsuarioConectado.setText(usuario.get(1));
        lblRolUsuario.setText("Empleado");
        if(usuario.get(6).equals("C")){
            lblRolUsuario.setText("Cliente");
            lblMenuProducto.setVisible(false);
            lblMenuCliente.setVisible(false);
            lblMenuEmpleado.setVisible(false);
            menuVerProductos.setVisible(false);
            menuNuevoProducto.setVisible(false);
            menuVerClientes.setVisible(false);
            menuNuevoCliente.setVisible(false);
            menuVerEmpleados.setVisible(false);
            menuNuevoEmpleado.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        MenuPanel = new javax.swing.JPanel();
        lblLogoMenu = new javax.swing.JLabel();
        lblMenuTicket = new javax.swing.JLabel();
        menuVerTickets = new javax.swing.JButton();
        menuNuevoTicket = new javax.swing.JButton();
        lblMenuProducto = new javax.swing.JLabel();
        menuVerProductos = new javax.swing.JButton();
        menuNuevoProducto = new javax.swing.JButton();
        lblMenuEmpleado = new javax.swing.JLabel();
        menuVerEmpleados = new javax.swing.JButton();
        menuNuevoEmpleado = new javax.swing.JButton();
        lblMenuCliente = new javax.swing.JLabel();
        menuVerClientes = new javax.swing.JButton();
        menuNuevoCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        lblUsuarioConectado = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblRolUsuario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        CardsPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerSize(0);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(800, 500));

        MenuPanel.setBackground(new java.awt.Color(242, 135, 117));
        MenuPanel.setMinimumSize(new java.awt.Dimension(250, 500));
        MenuPanel.setName("menuPanel"); // NOI18N
        MenuPanel.setPreferredSize(new java.awt.Dimension(250, 500));

        lblLogoMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pedazo de logo 100px.png"))); // NOI18N
        lblLogoMenu.setMinimumSize(new java.awt.Dimension(180, 142));
        lblLogoMenu.setPreferredSize(new java.awt.Dimension(180, 142));

        lblMenuTicket.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuTicket.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuTicket.setText("Ticket");

        menuVerTickets.setBackground(new java.awt.Color(242, 135, 117));
        menuVerTickets.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerTickets.setForeground(new java.awt.Color(255, 255, 255));
        menuVerTickets.setText("Ver tickets");
        menuVerTickets.setBorder(null);
        menuVerTickets.setBorderPainted(false);
        menuVerTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerTickets.setFocusPainted(false);
        menuVerTickets.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerTickets.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerTickets.setName("btnVerTicket"); // NOI18N
        menuVerTickets.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerTicketsActionPerformed(evt);
            }
        });

        menuNuevoTicket.setBackground(new java.awt.Color(242, 135, 117));
        menuNuevoTicket.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuNuevoTicket.setForeground(new java.awt.Color(255, 255, 255));
        menuNuevoTicket.setText("Nuevo ticket");
        menuNuevoTicket.setBorder(null);
        menuNuevoTicket.setBorderPainted(false);
        menuNuevoTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevoTicket.setFocusPainted(false);
        menuNuevoTicket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNuevoTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuNuevoTicket.setName("btnNuevoTicket"); // NOI18N
        menuNuevoTicket.setPreferredSize(new java.awt.Dimension(0, 22));
        menuNuevoTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoTicketActionPerformed(evt);
            }
        });

        lblMenuProducto.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuProducto.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuProducto.setText("Producto");

        menuVerProductos.setBackground(new java.awt.Color(242, 135, 117));
        menuVerProductos.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerProductos.setForeground(new java.awt.Color(255, 255, 255));
        menuVerProductos.setText("Ver productos");
        menuVerProductos.setBorder(null);
        menuVerProductos.setBorderPainted(false);
        menuVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerProductos.setFocusPainted(false);
        menuVerProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerProductos.setMaximumSize(new java.awt.Dimension(113, 22));
        menuVerProductos.setMinimumSize(new java.awt.Dimension(113, 22));
        menuVerProductos.setName("btnVerProducto"); // NOI18N
        menuVerProductos.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerProductosActionPerformed(evt);
            }
        });

        menuNuevoProducto.setBackground(new java.awt.Color(242, 135, 117));
        menuNuevoProducto.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        menuNuevoProducto.setText("Nuevo producto");
        menuNuevoProducto.setBorder(null);
        menuNuevoProducto.setBorderPainted(false);
        menuNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevoProducto.setFocusPainted(false);
        menuNuevoProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNuevoProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuNuevoProducto.setName("btnNuevoProducto"); // NOI18N
        menuNuevoProducto.setPreferredSize(new java.awt.Dimension(0, 22));
        menuNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoProductoActionPerformed(evt);
            }
        });

        lblMenuEmpleado.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuEmpleado.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuEmpleado.setText("Empleado");

        menuVerEmpleados.setBackground(new java.awt.Color(242, 135, 117));
        menuVerEmpleados.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        menuVerEmpleados.setText("Ver empleados");
        menuVerEmpleados.setBorder(null);
        menuVerEmpleados.setBorderPainted(false);
        menuVerEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerEmpleados.setFocusPainted(false);
        menuVerEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerEmpleados.setName("btnVerEmpleado"); // NOI18N
        menuVerEmpleados.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerEmpleadosActionPerformed(evt);
            }
        });

        menuNuevoEmpleado.setBackground(new java.awt.Color(242, 135, 117));
        menuNuevoEmpleado.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuNuevoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        menuNuevoEmpleado.setText("Nuevo empleado");
        menuNuevoEmpleado.setBorder(null);
        menuNuevoEmpleado.setBorderPainted(false);
        menuNuevoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevoEmpleado.setFocusPainted(false);
        menuNuevoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNuevoEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuNuevoEmpleado.setName("btnNuevoEmpleado"); // NOI18N
        menuNuevoEmpleado.setPreferredSize(new java.awt.Dimension(0, 22));
        menuNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoEmpleadoActionPerformed(evt);
            }
        });

        lblMenuCliente.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuCliente.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCliente.setText("Cliente");

        menuVerClientes.setBackground(new java.awt.Color(242, 135, 117));
        menuVerClientes.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        menuVerClientes.setText("Ver clientes");
        menuVerClientes.setBorder(null);
        menuVerClientes.setBorderPainted(false);
        menuVerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerClientes.setFocusPainted(false);
        menuVerClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerClientes.setName("btnVerCliente"); // NOI18N
        menuVerClientes.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerClientesActionPerformed(evt);
            }
        });

        menuNuevoCliente.setBackground(new java.awt.Color(242, 135, 117));
        menuNuevoCliente.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        menuNuevoCliente.setText("Nuevo cliente");
        menuNuevoCliente.setBorder(null);
        menuNuevoCliente.setBorderPainted(false);
        menuNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevoCliente.setFocusPainted(false);
        menuNuevoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNuevoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuNuevoCliente.setName("btnNuevoCliente"); // NOI18N
        menuNuevoCliente.setPreferredSize(new java.awt.Dimension(0, 22));
        menuNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoClienteActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 255, 0));
        lblUsuario.setText("Usuario:");

        lblUsuarioConectado.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblUsuarioConectado.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioConectado.setText("login");

        lblRol.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblRol.setForeground(new java.awt.Color(204, 255, 0));
        lblRol.setText("Rol:");

        lblRolUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblRolUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblRolUsuario.setText("Cliente");

        btnSalir.setBackground(java.awt.Color.red);
        btnSalir.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.setOpaque(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSalirKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuVerClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuVerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuNuevoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuVerTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblMenuTicket)
                            .addComponent(lblMenuProducto)
                            .addComponent(lblMenuCliente)
                            .addComponent(lblMenuEmpleado)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lblLogoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuarioConectado)
                                    .addComponent(lblRolUsuario)))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblMenuTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuVerTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNuevoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenuProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenuEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuVerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenuCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblUsuarioConectado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol)
                    .addComponent(lblRolUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(MenuPanel);

        CardsPanel.setMinimumSize(new java.awt.Dimension(550, 500));
        CardsPanel.setName("cardsPanel"); // NOI18N
        CardsPanel.setPreferredSize(new java.awt.Dimension(550, 500));
        CardsPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(247, 194, 137));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        CardsPanel.add(homePanel, "card2");

        jSplitPane1.setRightComponent(CardsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNuevoTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoTicketActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, ticketNuevoForm, "nuevoTicket");
        ControladorMenu.nombreMenuNuevo = "btnNuevoTicket";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoTicketActionPerformed

    private void menuVerTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerTicketsActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, ticketVerForm, "verTicket");
        ControladorMenu.nombreMenuNuevo = "btnVerTicket";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerTicketsActionPerformed

    private void menuVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerProductosActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, productoVerForm, "verProducto");
        ControladorMenu.nombreMenuNuevo = "btnVerProducto";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerProductosActionPerformed

    private void menuNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoProductoActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, productoNuevoForm, "nuevoProducto");
        ControladorMenu.nombreMenuNuevo = "btnNuevoProducto";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoProductoActionPerformed

    private void menuVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerClientesActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, clienteVerForm, "verCliente");
        ControladorMenu.nombreMenuNuevo = "btnVerCliente";
        ControladorMenu.cambiarBotonActivo(CardsPanel);

    }//GEN-LAST:event_menuVerClientesActionPerformed

    private void menuVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerEmpleadosActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, empleadoVerForm, "verEmpleado");
        ControladorMenu.nombreMenuNuevo = "btnVerEmpleado";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerEmpleadosActionPerformed

    private void menuNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoEmpleadoActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, empleadoNuevoForm, "nuevoEmpleado");
        ControladorMenu.nombreMenuNuevo = "btnNuevoEmpleado";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoEmpleadoActionPerformed

    private void menuNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoClienteActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, clienteNuevoForm, "nuevoCliente");
        ControladorMenu.nombreMenuNuevo = "btnNuevoCliente";
        ControladorMenu.cambiarBotonActivo(CardsPanel);

    }//GEN-LAST:event_menuNuevoClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyReleased
        System.exit(0);
    }//GEN-LAST:event_btnSalirKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardsPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel homePanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMenuCliente;
    private javax.swing.JLabel lblMenuEmpleado;
    private javax.swing.JLabel lblMenuProducto;
    private javax.swing.JLabel lblMenuTicket;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioConectado;
    private javax.swing.JButton menuNuevoCliente;
    private javax.swing.JButton menuNuevoEmpleado;
    private javax.swing.JButton menuNuevoProducto;
    private javax.swing.JButton menuNuevoTicket;
    private javax.swing.JButton menuVerClientes;
    private javax.swing.JButton menuVerEmpleados;
    private javax.swing.JButton menuVerProductos;
    private javax.swing.JButton menuVerTickets;
    // End of variables declaration//GEN-END:variables


}
