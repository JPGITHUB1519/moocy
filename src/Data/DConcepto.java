/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tester
 */
public class DConcepto {
    private Conexion sqlserv = new Conexion();
    private Connection cn = sqlserv.conectar();
    public int totalregistros;
    private String sSQL = "";
    
    public ResultSet getConceptosByLeccion(int leccion)
    {
        sSQL = "EXEC getConceptosByLeccion ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, leccion);
            ResultSet rs =  pst.executeQuery();
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        } 
    }
    
    public DefaultTableModel show_only_name(int leccion) {
        String [] titulos = { "ID", "Numero de Concepto", "Nombre", "video_url"};
        String [] registro = new String[4];
        totalregistros = 0;
        //modelo = new DefaultTableModel(null, titulos);
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        try {
            ResultSet rs =  this.getConceptosByLeccion(leccion);
            int cont = 1;
            while(rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = "#"  + Integer.toString(cont);
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("video_url");
                modelo.addRow(registro);
                cont++;
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
}
