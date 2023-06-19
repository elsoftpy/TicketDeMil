/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antit
 */
public class OperacionesRegistros {
    
    public static int idRegistroEditar;
    
    public static void insertar(List<String> campos, String procedure)
    {
        DBStoreProcedures sp = new DBStoreProcedures(procedure);
        try{
            sp.ejecutarInsert(campos);
            JOptionPane.showMessageDialog(
                    null, 
                    "Registro insertado",
                    "Purete",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Demonios",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void actualizar(List<String> campos, String procedure)
    {
        DBStoreProcedures sp = new DBStoreProcedures(procedure);
        try{
            sp.ejecutarUpdate(campos);
            JOptionPane.showMessageDialog(
                    null, 
                    "Registro actualizado",
                    "Purete",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Demonios",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void eliminar(DefaultTableModel model, int a, String procedure)
    {
        if(a < 0){
            JOptionPane.showMessageDialog(
                    null, 
                    "Debe seleccionar un registro",
                    "Chake",
                    JOptionPane.WARNING_MESSAGE);
        }else {
            int confirmar = JOptionPane.showConfirmDialog(
                    null,
                    "Está seguro de eliminar el registro?", 
                    "Novaseo", 
                    JOptionPane.YES_NO_OPTION);
            if(JOptionPane.OK_OPTION == confirmar){
                DBStoreProcedures sp = new DBStoreProcedures(procedure);
                try{
                   // if(sp.ejecutarDelete(Integer.parseInt(productosTable.getValueAt(a, 0).toString()))){
                        //boolean resultado = sp.ejecutarDelete(Integer.parseInt(productosTable.getValueAt(a, 0).toString()));
                    sp.ejecutarDelete(Integer.parseInt(model.getValueAt(a, 0).toString()));
                    model.removeRow(a);
                    JOptionPane.showMessageDialog(
                            null, 
                            "Registro eliminado",
                            "Purete",
                            JOptionPane.INFORMATION_MESSAGE);
                    //}
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
            }
        }
    }
    
    public void setIdRegistroEditar(int r)
    {
        idRegistroEditar = r;
    }
    
    public int getIdRegistroEditar()
    {
        return idRegistroEditar;
    }
    
    
}
