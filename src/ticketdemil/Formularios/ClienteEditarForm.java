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
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author antit
 */
public class ClienteEditarForm extends javax.swing.JPanel {

    // en esta variable vamos a guardar el contenedor de los paneles
    JPanel cardsPanel;
    /**
     * Creates new form ClienteEditarForm
     */
    public ClienteEditarForm() {
        initComponents();
        this.setBackground(PaletaColores.peach);
        lblTituloForm.setForeground(Color.red);
        lblNombreUsuario.setForeground(PaletaColores.linen);
        lblNombre.setForeground(PaletaColores.linen);
        lblApellido.setForeground(PaletaColores.linen);
        lblEmail.setForeground(PaletaColores.linen);
        lblTelefono.setForeground(PaletaColores.linen);
        lblPassword.setForeground(PaletaColores.linen);
        lblPassword.setVisible(false);
        txtPassword.setVisible(false);
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
        lblNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTituloForm.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblTituloForm.setText("Modificar Cliente");

        lblNombreUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre");

        txtNombreUsuario.setBorder(null);

        lblPassword.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.setPreferredSize(new java.awt.Dimension(64, 16));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setBorder(null);

        lblApellido.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblApellido.setText("Apellido");

        txtApellido.setBorder(null);

        lblEmail.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setBorder(null);

        lblTelefono.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblTelefono.setText("Teléfono");

        txtTelefono.setBorder(null);

        btnGuardar.setBackground(new java.awt.Color(153, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnGuardarKeyReleased(evt);
            }
        });

        btnCancelar.setBackground(java.awt.Color.red);
        btnCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnCancelarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreUsuario)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblApellido)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(lblTelefono)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(lblPassword)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblTituloForm))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        //
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // AGREGAR VALIDACIONES

        guardarRegistro();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        guardarRegistro();
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limpiarCampos();
        }
    }//GEN-LAST:event_btnCancelarKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarRegistro();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void guardarRegistro() {
        //crea una lista para los campos a insertar
        List<String> campos = new ArrayList<>();
        // asignar campo por campo los valores a la lista
        campos.add(String.valueOf(OperacionesRegistros.idRegistroEditar));
        campos.add(txtNombreUsuario.getText());
        campos.add(txtNombre.getText());
        campos.add(txtApellido.getText());
        campos.add(txtEmail.getText());
        campos.add(txtTelefono.getText());
        // insertar el registro
        OperacionesRegistros.actualizar(campos, "sp_actualizar_cliente");
        // limpiar campos
        limpiarCampos();
        OperacionesRegistros.idRegistroEditar = 0;
        // se instancia los formularios a los que van a llevar los botones Nuevo y Editar
        ClienteVerForm clienteVerForm = new ClienteVerForm();
        // encuentra el Panel padre
        cardsPanel = (JPanel) btnGuardar.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnNuevoEmpleado
        ControladorMenu.nombreMenuNuevo = "btnVerCliente";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario y pasa un nuevo nombre para poder identificarlo, en este caso nuevoEmpleado
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, clienteVerForm, "verCliente");
    }

    private void limpiarCampos() {
        txtNombreUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
    }

    private void cargarRegistro() {
        Connection cn = DBConnection.conectarDB();
        if(cn == null){
            JOptionPane.showMessageDialog(
                    this,
                    "No hay conexión a la BD",
                    "Demonios",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                int id = OperacionesRegistros.idRegistroEditar;
                // sentencia sql para buscar todos los empleados
                String sql = "SELECT u.username, u.nombre, u.apellido, u.email, u.telefono "
                        + "FROM clientes c "
                        + "INNER JOIN usuarios u "
                        + "ON c.id_usuario = u.id_usuario "
                        + "WHERE u.id_usuario = ?";
                
                // prepara la sentencia sql para dar mayor seguridad a la aplicación
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                st.setInt(1, id);

                // ejecuta la consulta y guarda el resultado en una variable tipo result set
                ResultSet rs = st.executeQuery();
                // recorrer el result set con un while
                if(rs.next()){
                    // asignamos los valores al campo correspondiente
                    txtNombreUsuario.setText(rs.getString("username"));
                    txtNombre.setText(rs.getString("nombre"));
                    txtApellido.setText(rs.getString("apellido"));
                    txtEmail.setText(rs.getString("email"));
                    txtTelefono.setText(rs.getString("telefono"));
                }else {
                    JOptionPane.showMessageDialog(
                        this,
                        "Registro no encontrado",
                        "Demonios",
                        JOptionPane.ERROR_MESSAGE);
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage(),
                        "Demonios",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
