/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ticketdemil.Formularios;

import global.ControladorMenu;
import global.DBConnection;
import global.OperacionesRegistros;
import global.PaletaColores;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antit
 */
public class ClienteVerForm extends javax.swing.JPanel {
    // en esta variable vamos a guardar el contenedor de los paneles
    JPanel cardsPanel;
    // se instancias los formularios a los que van a llevar los botones Nuevo y Editar
    ClienteNuevoForm clienteNuevoForm = new ClienteNuevoForm();
    ClienteEditarForm clienteEditarForm = new ClienteEditarForm();
    /**
     * Creates new form FrmVerClientes
     */
    public ClienteVerForm() {
        initComponents();
        this.setBackground(PaletaColores.peach);
        lblTituloForm.setForeground(Color.red);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloForm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTituloForm.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblTituloForm.setForeground(new java.awt.Color(234, 228, 143));
        lblTituloForm.setText("Listado de Clientes");

        clientesTable.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        clientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "NOMBRE", "APELLIDO", "EMAIL", "TELEFONO"
            }
        ));
        clientesTable.setOpaque(false);
        jScrollPane1.setViewportView(clientesTable);

<<<<<<< Updated upstream
        btnBorrar.setBackground(java.awt.Color.red);
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
=======
        btnNuevo.setBackground(new java.awt.Color(153, 204, 0));
        btnNuevo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnNuevoKeyReleased(evt);
>>>>>>> Stashed changes
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 204, 255));
        btnEditar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        btnEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEditarKeyReleased(evt);
            }
        });

        btnBorrar.setBackground(java.awt.Color.red);
        btnBorrar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        btnBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnBorrarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla();       
    }//GEN-LAST:event_formComponentShown

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevoRegistro();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevoKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            nuevoRegistro();
        }
    }//GEN-LAST:event_btnNuevoKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
<<<<<<< Updated upstream
        int a = tblVerClientes.getSelectedRow();
        
        OperacionesRegistros.idRegistroEditar = Integer.parseInt(tblVerClientes.getValueAt(a, 0).toString());

        // encuentra el Panel padre
        cardsPanel = (JPanel) btnNuevo.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnEditarCliente
        ControladorMenu.nombreMenuNuevo = "btnEditarCliente";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario pasando el objeto del nuevo form (en este caso productoEditarForm) y pasa un nuevo nombre para poder identificarlo, en este caso editarProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, clienteEditarForm, "editarCliente");
=======
        editarRegistro();
>>>>>>> Stashed changes
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditarKeyReleased
        editarRegistro();
    }//GEN-LAST:event_btnEditarKeyReleased

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBorrarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            borrarRegistro();
        }
    }//GEN-LAST:event_btnBorrarKeyReleased

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblVerClientes.getModel();
        int a = tblVerClientes.getSelectedRow();
        OperacionesRegistros.eliminar(model, a, "sp_borrar_cliente");
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTable clientesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloForm;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel dt = (DefaultTableModel) clientesTable.getModel();
        dt.setRowCount(0);
        java.sql.Connection cn = DBConnection.conectarDB();
        if(cn == null){
            JOptionPane.showMessageDialog(this,"No hay conexión a la BD");
        }else{
            try{
                // sentencia sql para buscar todos los clientes
                String sql = "SELECT U.ID_USUARIO, U.USERNAME, U.NOMBRE, U.APELLIDO,"
                        + " U.EMAIL, U.TELEFONO "
                        + "FROM CLIENTES CL "
                        + "INNER JOIN USUARIOS U ON CL.ID_USUARIO=U.ID_USUARIO";
                // prepara la sentencia sql para dar mayor seguridad a la aplicación
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                

                // ejecuta la consulta y guarda el resultado en una variable tipo result set
                ResultSet rs = st.executeQuery();
                // si el result set tiene registros (nos logueamos correctamente)
                while(rs.next()){
                    //carga el id del cliente en la variable id
                    //String id = String.valueOf(rs.getInt("id_producto"));
                    // carga el nombre del producto en la variable nombre
                    //String nombre = rs.getString("nombre_producto");
                    
                    String datosTabla[] = {
                        String.valueOf(rs.getInt("id_usuario")),
                        rs.getString("username"),
                        rs.getString("nombre"), 
                        rs.getString("apellido"),
                        rs.getString("email"), 
                        rs.getString("telefono")
                    };
                    dt.addRow(datosTabla);
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }

    private void editarRegistro() {
        int a = clientesTable.getSelectedRow();
        if(a < 0)
        {
            JOptionPane.showMessageDialog(
                    null, 
                    "Debe seleccionar un registro",
                    "Chake",
                    JOptionPane.WARNING_MESSAGE);
        }else{
            OperacionesRegistros.idRegistroEditar = Integer.parseInt(clientesTable.getValueAt(a, 0).toString()) ;
            // encuentra el Panel padre
            cardsPanel = (JPanel) btnNuevo.getParent().getParent();
            // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnEditarCliente
            ControladorMenu.nombreMenuNuevo = "btnEditarCliente";
            // cambiar de color el botón activo
            ControladorMenu.cambiarBotonActivo(cardsPanel);
            // trae el layout del pnael padre
            CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
            // cambia el formulario pasando el objeto del nuevo form (en este caso productoEditarForm) y pasa un nuevo nombre para poder identificarlo, en este caso editarProducto
            ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, clienteEditarForm, "editarCliente");
        }
    }

    private void nuevoRegistro() {
        // encuentra el Panel padre
        cardsPanel = (JPanel) btnNuevo.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnNuevoProducto
        ControladorMenu.nombreMenuNuevo = "btnNuevoCliente";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del panel padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario y pasa un nuevo nombre para poder identificarlo, en este caso nuevoProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, clienteNuevoForm, "nuevoCliente");
    }

    private void borrarRegistro() {
        DefaultTableModel model = (DefaultTableModel) clientesTable.getModel();
        int a = clientesTable.getSelectedRow();
        OperacionesRegistros.eliminar(model, a, "sp_borrar_cliente");
    }
    
    

}
