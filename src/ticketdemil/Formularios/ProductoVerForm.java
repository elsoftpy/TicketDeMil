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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.Usuarios;

/**
 *
 * @author antit
 */
public class ProductoVerForm extends javax.swing.JPanel {
    
    // en esta variable vamos a guardar el contenedor de los paneles
    JPanel cardsPanel;
    // se instancias los formularios a los que van a llevar los botones Nuevo y Editar
    ProductoNuevoForm productoNuevoForm = new ProductoNuevoForm();
    ProductoEditarForm productoEditarForm = new ProductoEditarForm();
    
    /**
     * Creates new form FrmVerProductos
     */
    public ProductoVerForm() {
        initComponents();
        this.setBackground(PaletaColores.peach);
        lblTituloForm.setForeground(Color.red);
        //activeBtn = (JButton) MenuForm.
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
        productosTable = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 194, 137));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTituloForm.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblTituloForm.setForeground(new java.awt.Color(234, 228, 143));
        lblTituloForm.setText("Listado de Productos");

        productosTable.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        productosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        productosTable.setOpaque(false);
        jScrollPane1.setViewportView(productosTable);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
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
            List<String> usuario = Usuarios.getUsuario();
            JOptionPane.showMessageDialog(null, usuario.get(0));
    }//GEN-LAST:event_formComponentShown

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        DefaultTableModel model = (DefaultTableModel) productosTable.getModel();
        int a = productosTable.getSelectedRow();
        OperacionesRegistros.eliminar(model, a, "sp_borrar_producto");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBorrarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           // doLogin();
        }
    }//GEN-LAST:event_btnBorrarKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // obtener el id del registro a editar
        //DefaultTableModel model = (DefaultTableModel) productosTable.getModel();
        int a = productosTable.getSelectedRow();
        
        OperacionesRegistros.idRegistroEditar = Integer.parseInt(productosTable.getValueAt(a, 0).toString()) ;
        // encuentra el Panel padre
        cardsPanel = (JPanel) btnNuevo.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnEditarProducto
        ControladorMenu.nombreMenuNuevo = "btnEditarProducto";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario pasando el objeto del nuevo form (en este caso productoEditarForm) y pasa un nuevo nombre para poder identificarlo, en este caso editarProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, productoEditarForm, "editarProducto");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditarKeyReleased
        // encuentra el Panel padre
        cardsPanel = (JPanel) btnNuevo.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnEditarProducto
        ControladorMenu.nombreMenuNuevo = "btnEditarProducto";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario pasando el objeto del nuevo form (en este caso productoNuevoForm) y pasa un nuevo nombre para poder identificarlo, en este caso editarProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, productoNuevoForm, "editarProducto");
    }//GEN-LAST:event_btnEditarKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // encuentra el Panel padre
        cardsPanel = (JPanel) btnNuevo.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnNuevoProducto
        ControladorMenu.nombreMenuNuevo = "btnNuevoProducto";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario y pasa un nuevo nombre para poder identificarlo, en este caso nuevoProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, productoNuevoForm, "nuevoProducto");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JTable productosTable;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // recuperamos el modelo del componente de la tabla
        DefaultTableModel dt = (DefaultTableModel) productosTable.getModel();
        dt.setRowCount(0);
        Connection cn = DBConnection.conectarDB();
        if(cn == null){
            JOptionPane.showMessageDialog(this,"No hay conexión a la BD");
        }else{
            try{
                // sentencia sql para buscar todos los productos
                String sql = "SELECT * FROM productos p";
                // prepara la sentencia sql para dar mayor seguridad a la aplicación
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                

                // ejecuta la consulta y guarda el resultado en una variable tipo result set
                ResultSet rs = st.executeQuery();
                // recorrer el result set con un while
                while(rs.next()){
                    // hacemos un array String para recuperar los datos del result set
                    String datosTabla[] = {
                        // para el caso del tipo de dato integer en la bd usamos rs.getInt y le convertimos a String
                        // el parámetro del getInt debe ser el nombre exacto de la columna en la bd
                        String.valueOf(rs.getInt("id_producto")),
                        // para el caso del tipo de dato varchar en la bd usamos rs.getString directo
                        // el parámetro del getInt debe ser el nombre exacto de la columna en la bd
                        rs.getString("nombre_producto")
                    };
                    
                    // agregamos la fila actual
                    dt.addRow(datosTabla);
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }
    
    
}
