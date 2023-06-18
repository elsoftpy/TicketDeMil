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
public class ProductoEditarForm extends javax.swing.JPanel {

    // en esta variable vamos a guardar el contenedor de los paneles
    JPanel cardsPanel;
    /**
     * Creates new form FrmEditarProducto
     */
    public ProductoEditarForm() {
        initComponents();
        this.setBackground(PaletaColores.peach);
        lblTituloForm.setForeground(Color.red);
        lblNombre.setForeground(PaletaColores.linen);
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
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTituloForm.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblTituloForm.setText("Insertar Producto");

        lblNombre.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre del producto");

        txtNombre.setBorder(null);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblTituloForm))
                                .addGap(0, 147, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloForm)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // AGREGAR VALIDACIONES

        guardarRegistro();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        guardarRegistro();
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNombre.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyReleased
        txtNombre.setText("");
    }//GEN-LAST:event_btnCancelarKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarRegistro();
    }//GEN-LAST:event_formComponentShown

    private void cargarRegistro() {
        
        Connection cn = DBConnection.conectarDB();
        if(cn == null){
            JOptionPane.showMessageDialog(this,"No hay conexión a la BD");
        }else{
            try{
                int id = OperacionesRegistros.idRegistroEditar;
                // sentencia sql para buscar todos los productos
                String sql = "SELECT * FROM productos p where id_producto = ?";
                
                // prepara la sentencia sql para dar mayor seguridad a la aplicación
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                st.setInt(1, id);

                // ejecuta la consulta y guarda el resultado en una variable tipo result set
                ResultSet rs = st.executeQuery();
                // recorrer el result set con un while
                if(rs.next()){
                    // asignamos los valores al campo correspondiente
                    txtNombre.setText(rs.getString("nombre_producto"));
                }else{
                    JOptionPane.showMessageDialog(this,"Registro no encontrado");
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }

    private void guardarRegistro() {
        //crea una lista para los campos a insertar
        List<String> campos = new ArrayList<>();
        // asignar campo por campo los valores a la lista
        campos.add(String.valueOf(OperacionesRegistros.idRegistroEditar));
        campos.add(txtNombre.getText());
        // insertar el registro
        OperacionesRegistros.actualizar(campos, "sp_actualizar_producto");
        // limpiar campos
        txtNombre.setText("");
        OperacionesRegistros.idRegistroEditar = 0;
        // se instancia los formularios a los que van a llevar los botones Nuevo y Editar
        ProductoVerForm productoVerForm = new ProductoVerForm();
        // encuentra el Panel padre
        cardsPanel = (JPanel) btnGuardar.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnNuevoProducto
        ControladorMenu.nombreMenuNuevo = "btnVerProducto";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario y pasa un nuevo nombre para poder identificarlo, en este caso nuevoProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, productoVerForm, "verProducto");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
