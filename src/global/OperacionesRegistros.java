/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antit
 */
public class OperacionesRegistros {
    
    public static void eliminar(DefaultTableModel model, int a)
    {
        if(a < 0){
            JOptionPane.showMessageDialog(null,"Debes seleccionar una fila");
        }else {
            int confirmar = JOptionPane.showConfirmDialog(null, "Está seguro de eliminar el registro?");
            if(JOptionPane.OK_OPTION == confirmar){
                DBStoreProcedures sp = new DBStoreProcedures("sp_borrar_producto");
                try{
                   // if(sp.ejecutarDelete(Integer.parseInt(productosTable.getValueAt(a, 0).toString()))){
                        //boolean resultado = sp.ejecutarDelete(Integer.parseInt(productosTable.getValueAt(a, 0).toString()));
                    sp.ejecutarDelete(Integer.parseInt(model.getValueAt(a, 0).toString()));
                    model.removeRow(a);
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                    //}
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
            }
        }
    }
}
