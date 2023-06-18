/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketdemil.Formularios;

import global.ControladorMenu;
import global.PaletaColores;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author antit
 */
public class MenuForm extends javax.swing.JFrame {

    // variable para instanciar el panel que contiene el diseño de la aplicación
    CardLayout cardLayout;
    JButton activeBtn;
    ProductoVerForm productoVerForm = new ProductoVerForm();
    ProductoNuevoForm productoNuevoForm = new ProductoNuevoForm();
    ProductoEditarForm productoEditarForm = new ProductoEditarForm();
    ClienteVerForm clienteVerForm = new ClienteVerForm();
    ClienteNuevoForm clienteNuevoForm = new ClienteNuevoForm();
    ClienteEditarForm clienteEditarForm = new ClienteEditarForm();
    EmpleadoVerForm empleadoVerForm = new EmpleadoVerForm();
    EmpleadoNuevoForm empleadoNuevoForm = new EmpleadoNuevoForm();
    EmpleadoEditarForm empleadoEditarForm = new EmpleadoEditarForm();
    TicketVerForm ticketVerForm = new TicketVerForm();
    TicketNuevoForm ticketNuevoForm = new TicketNuevoForm();
    TicketEditarForm ticketEditarForm = new TicketEditarForm();
    
    
    
    /**
     * Creates new form MenuForm
     */
    public MenuForm() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        // se instancia el panel principal
        cardLayout = (CardLayout) CardsPanel.getLayout();
        //activeBtn = (JButton) menuVerProductos;
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
        jSeparator1 = new javax.swing.JSeparator();
        lblMenuProducto = new javax.swing.JLabel();
        menuVerProductos = new javax.swing.JButton();
        menuNuevoProductos = new javax.swing.JButton();
        menuEditarProducto = new javax.swing.JButton();
        lblMenuCliente = new javax.swing.JLabel();
        menuVerCliente = new javax.swing.JButton();
        menuNuevoCliente = new javax.swing.JButton();
        menuEditarCliente = new javax.swing.JButton();
        lblMenuEmpleado = new javax.swing.JLabel();
        menuVerEmpleado = new javax.swing.JButton();
        menuNuevoEmpleado = new javax.swing.JButton();
        menuEditarEmpleado = new javax.swing.JButton();
        lblMenuTicket = new javax.swing.JLabel();
        menuNuevoTicket = new javax.swing.JButton();
        menuVerTicket = new javax.swing.JButton();
        menuEditarTicket = new javax.swing.JButton();
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

        menuNuevoProductos.setBackground(new java.awt.Color(242, 135, 117));
        menuNuevoProductos.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuNuevoProductos.setForeground(new java.awt.Color(255, 255, 255));
        menuNuevoProductos.setText("Nuevo producto");
        menuNuevoProductos.setBorder(null);
        menuNuevoProductos.setBorderPainted(false);
        menuNuevoProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevoProductos.setFocusPainted(false);
        menuNuevoProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNuevoProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuNuevoProductos.setName("btnNuevoProducto"); // NOI18N
        menuNuevoProductos.setPreferredSize(new java.awt.Dimension(0, 22));
        menuNuevoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoProductosActionPerformed(evt);
            }
        });

        menuEditarProducto.setBackground(new java.awt.Color(242, 135, 117));
        menuEditarProducto.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        menuEditarProducto.setText("Editar producto");
        menuEditarProducto.setBorder(null);
        menuEditarProducto.setBorderPainted(false);
        menuEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEditarProducto.setFocusPainted(false);
        menuEditarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuEditarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEditarProducto.setName("btnEditarProducto"); // NOI18N
        menuEditarProducto.setPreferredSize(new java.awt.Dimension(0, 22));
        menuEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarProductoActionPerformed(evt);
            }
        });

        lblMenuCliente.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuCliente.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCliente.setText("Cliente");

        menuVerCliente.setBackground(new java.awt.Color(242, 135, 117));
        menuVerCliente.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerCliente.setForeground(new java.awt.Color(255, 255, 255));
        menuVerCliente.setText("Ver clientes");
        menuVerCliente.setBorder(null);
        menuVerCliente.setBorderPainted(false);
        menuVerCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerCliente.setFocusPainted(false);
        menuVerCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerCliente.setName("btnVerCliente"); // NOI18N
        menuVerCliente.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerClienteActionPerformed(evt);
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

        menuEditarCliente.setBackground(new java.awt.Color(242, 135, 117));
        menuEditarCliente.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        menuEditarCliente.setText("Editar cliente");
        menuEditarCliente.setBorder(null);
        menuEditarCliente.setBorderPainted(false);
        menuEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEditarCliente.setFocusPainted(false);
        menuEditarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuEditarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEditarCliente.setName("btnEditarCliente"); // NOI18N
        menuEditarCliente.setPreferredSize(new java.awt.Dimension(0, 22));
        menuEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarClienteActionPerformed(evt);
            }
        });

        lblMenuEmpleado.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuEmpleado.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuEmpleado.setText("Empleado");

        menuVerEmpleado.setBackground(new java.awt.Color(242, 135, 117));
        menuVerEmpleado.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        menuVerEmpleado.setText("Ver empleados");
        menuVerEmpleado.setBorder(null);
        menuVerEmpleado.setBorderPainted(false);
        menuVerEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerEmpleado.setFocusPainted(false);
        menuVerEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerEmpleado.setName("btnVerEmpleado"); // NOI18N
        menuVerEmpleado.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerEmpleadoActionPerformed(evt);
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

        menuEditarEmpleado.setBackground(new java.awt.Color(242, 135, 117));
        menuEditarEmpleado.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuEditarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        menuEditarEmpleado.setText("Editar empleado");
        menuEditarEmpleado.setBorder(null);
        menuEditarEmpleado.setBorderPainted(false);
        menuEditarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEditarEmpleado.setFocusPainted(false);
        menuEditarEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuEditarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEditarEmpleado.setName("btnEditarEmpleado"); // NOI18N
        menuEditarEmpleado.setPreferredSize(new java.awt.Dimension(0, 22));
        menuEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarEmpleadoActionPerformed(evt);
            }
        });

        lblMenuTicket.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblMenuTicket.setForeground(new java.awt.Color(204, 255, 0));
        lblMenuTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuTicket.setText("Ticket");

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
        menuNuevoTicket.setName("btnVerTicket"); // NOI18N
        menuNuevoTicket.setPreferredSize(new java.awt.Dimension(0, 22));
        menuNuevoTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoTicketActionPerformed(evt);
            }
        });

        menuVerTicket.setBackground(new java.awt.Color(242, 135, 117));
        menuVerTicket.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuVerTicket.setForeground(new java.awt.Color(255, 255, 255));
        menuVerTicket.setText("Ver ticket");
        menuVerTicket.setBorder(null);
        menuVerTicket.setBorderPainted(false);
        menuVerTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerTicket.setFocusPainted(false);
        menuVerTicket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVerTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuVerTicket.setName("btnNuevoTicket"); // NOI18N
        menuVerTicket.setPreferredSize(new java.awt.Dimension(0, 22));
        menuVerTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerTicketActionPerformed(evt);
            }
        });

        menuEditarTicket.setBackground(new java.awt.Color(242, 135, 117));
        menuEditarTicket.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        menuEditarTicket.setForeground(new java.awt.Color(255, 255, 255));
        menuEditarTicket.setText("Editar ticket");
        menuEditarTicket.setBorder(null);
        menuEditarTicket.setBorderPainted(false);
        menuEditarTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEditarTicket.setFocusPainted(false);
        menuEditarTicket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuEditarTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEditarTicket.setName("btnEditarTicket"); // NOI18N
        menuEditarTicket.setPreferredSize(new java.awt.Dimension(0, 22));
        menuEditarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblLogoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenuProducto))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuNuevoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenuCliente))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuVerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenuEmpleado))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenuTicket))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuVerTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuNuevoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menuEditarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblMenuProducto)
                .addGap(6, 6, 6)
                .addComponent(menuVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuNuevoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblMenuCliente)
                .addGap(6, 6, 6)
                .addComponent(menuVerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblMenuEmpleado)
                .addGap(6, 6, 6)
                .addComponent(menuVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblMenuTicket)
                .addGap(6, 6, 6)
                .addComponent(menuVerTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuNuevoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuEditarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 608, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
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

    private void menuVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerProductosActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, productoVerForm, "verProducto");
        ControladorMenu.nombreMenuNuevo = "btnVerProducto";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerProductosActionPerformed

    private void menuNuevoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoProductosActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, productoNuevoForm, "nuevoProducto");
        ControladorMenu.nombreMenuNuevo = "btnNuevoProducto";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoProductosActionPerformed

    private void menuEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarProductoActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, productoEditarForm, "editarProducto");
        ControladorMenu.nombreMenuNuevo = "btnEditarProducto";
        ControladorMenu.cambiarBotonActivo(CardsPanel);    }//GEN-LAST:event_menuEditarProductoActionPerformed

    private void menuVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerClienteActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, clienteVerForm, "verCliente");
        ControladorMenu.nombreMenuNuevo = "btnVerCliente";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerClienteActionPerformed

    private void menuNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoClienteActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, clienteNuevoForm, "nuevoCliente");
        ControladorMenu.nombreMenuNuevo = "btnNuevoCliente";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoClienteActionPerformed

    private void menuEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarClienteActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, clienteEditarForm, "editarCliente");
        ControladorMenu.nombreMenuNuevo = "btnEditarCliente";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuEditarClienteActionPerformed

    private void menuVerEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerEmpleadoActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, empleadoVerForm, "verEmpleado");
        ControladorMenu.nombreMenuNuevo = "btnVerEmpleado";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerEmpleadoActionPerformed

    private void menuNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoEmpleadoActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, empleadoNuevoForm, "nuevoEmpleado");
        ControladorMenu.nombreMenuNuevo = "btnNuevoEmpleado";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoEmpleadoActionPerformed

    private void menuEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarEmpleadoActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, empleadoEditarForm, "editarProducto");
        ControladorMenu.nombreMenuNuevo = "btnEditarEmpleado";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuEditarEmpleadoActionPerformed

    private void menuNuevoTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoTicketActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, ticketNuevoForm, "nuevoTicket");
        ControladorMenu.nombreMenuNuevo = "btnNuevoTicket";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuNuevoTicketActionPerformed

    private void menuVerTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerTicketActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, ticketVerForm, "verTicket");
        ControladorMenu.nombreMenuNuevo = "btnVerTicket";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuVerTicketActionPerformed

    private void menuEditarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarTicketActionPerformed
        ControladorMenu.cambiarFormulario(cardLayout, CardsPanel, ticketEditarForm, "editarTicket");
        ControladorMenu.nombreMenuNuevo = "btnEditarTicket";
        ControladorMenu.cambiarBotonActivo(CardsPanel);
    }//GEN-LAST:event_menuEditarTicketActionPerformed

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
    private javax.swing.JPanel homePanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMenuCliente;
    private javax.swing.JLabel lblMenuEmpleado;
    private javax.swing.JLabel lblMenuProducto;
    private javax.swing.JLabel lblMenuTicket;
    private javax.swing.JButton menuEditarCliente;
    private javax.swing.JButton menuEditarEmpleado;
    private javax.swing.JButton menuEditarProducto;
    private javax.swing.JButton menuEditarTicket;
    private javax.swing.JButton menuNuevoCliente;
    private javax.swing.JButton menuNuevoEmpleado;
    private javax.swing.JButton menuNuevoProductos;
    private javax.swing.JButton menuNuevoTicket;
    private javax.swing.JButton menuVerCliente;
    private javax.swing.JButton menuVerEmpleado;
    private javax.swing.JButton menuVerProductos;
    private javax.swing.JButton menuVerTicket;
    // End of variables declaration//GEN-END:variables

//    private void cambiarBotonActivo(JButton currentBtn) {
//        currentBtn.setBorderPainted(false);
//        activeBtn.setBackground(PaletaColores.salmon);
//        currentBtn.setBackground(Color.red);
//        activeBtn = currentBtn;
//    }
}
