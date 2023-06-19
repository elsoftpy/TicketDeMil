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
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import models.Productos;
import models.Usuarios;

/**
 *
 * @author antit
 */
public class TicketNuevoForm extends javax.swing.JPanel {

    /**
     * Creates new form frmNuevoTicket
     */
    public TicketNuevoForm() {
        initComponents();
        ListarProductos();
        this.setBackground(PaletaColores.peach);
        lblTicket.setForeground(Color.red);
    }  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        spPrioridad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        slDias_Estimados = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();

        jLabel2.setText("Nombre del Producto:");

        jLabel3.setText("Descripción: ");

        cmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmProductosActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

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

        spPrioridad.setModel(new javax.swing.SpinnerListModel(new String[] {"B", "M", "A"}));

        jLabel1.setText("Días Estimados");

        slDias_Estimados.setMajorTickSpacing(1);
        slDias_Estimados.setMaximum(5);
        slDias_Estimados.setMinimum(1);
        slDias_Estimados.setPaintLabels(true);
        slDias_Estimados.setPaintTicks(true);
        slDias_Estimados.setValue(1);
        slDias_Estimados.setEnabled(false);

        jLabel4.setText("Prioridad");

        lblTicket.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblTicket.setText("Insertar Ticket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTicket)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(slDias_Estimados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(spPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTicket)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slDias_Estimados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmProductosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmProductosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // AGREGAR VALIDACIONES

        guardarRegistro();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        guardarRegistro();
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyReleased
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnCancelarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Productos> cmProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTicket;
    private javax.swing.JSlider slDias_Estimados;
    private javax.swing.JSpinner spPrioridad;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

    private void ListarProductos() {
        ArrayList datos = new ArrayList();
        Productos p= null;
        
        Connection cn = DBConnection.conectarDB();
        if(cn==null){
            JOptionPane.showMessageDialog(null, "Error al conectar la BD");
        }else{
            try{
                String sql = "select * from PRODUCTOS";
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                        p = new Productos();
                        p.setId_producto(rs.getInt("id_producto"));
                        p.setNombre_producto(rs.getString("nombre_producto"));
                        datos.add(p);
                }
                Iterator it=datos.iterator();
                while(it.hasNext()){
                    Productos pro = (Productos) it.next();
                    cmProductos.addItem(pro);
                }
              
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    private void guardarRegistro() {
        //crea una lista para los campos a insertar
        List<String> campos = new ArrayList<>();
        List<String> usuario= Usuarios.getUsuario();
        String id_usuario = usuario.get(0);
        // asignar campo por campo los valores a la lista
        campos.add(id_usuario);
        Productos producto = new Productos();
        producto = (Productos) cmProductos.getSelectedItem();
        campos.add(String.valueOf( producto.getId_producto()));
        campos.add(txtDescripcion.getText());
        campos.add(String.valueOf(spPrioridad.getValue()) );
        // insertar el registro
        OperacionesRegistros.insertar(campos, "sp_insertar_ticket");
        // limpiar campos
        cmProductos.setSelectedItem(false);
        txtDescripcion.setText("");
        
        // se instancia los formularios a los que van a llevar los botones Nuevo y Editar
        TicketVerForm ticketVerForm = new TicketVerForm();
        // encuentra el Panel padre
        JPanel cardsPanel = (JPanel) btnGuardar.getParent().getParent();
        // define el nombre botón del menú que va a quedar activo, en este caso debe ser btnNuevoProducto
        ControladorMenu.nombreMenuNuevo = "btnVerTicket";
        // cambiar de color el botón activo
        ControladorMenu.cambiarBotonActivo(cardsPanel);
        // trae el layout del pnael padre
        CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
        // cambia el formulario y pasa un nuevo nombre para poder identificarlo, en este caso nuevoProducto
        ControladorMenu.cambiarFormulario(cardLayout, cardsPanel, ticketVerForm, "verTicket");
    }
 }
