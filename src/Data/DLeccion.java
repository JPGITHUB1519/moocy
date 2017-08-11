/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tester
 */
public class DLeccion {
    private Conexion sqlserv = new Conexion();
    private Connection cn = sqlserv.conectar();
    public int totalregistros;
    private String sSQL = "";
    
    public DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
    
    // show with a easy method
    public DefaultTableModel show_easy(int curso)
    {
        try {
            ResultSet rs = this.getLecciones(curso);
            return this.buildTableModel(rs);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
      
    }
    public ResultSet getLecciones(int curso) {
        sSQL = "EXEC getLeccionesByCurso ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, curso);
            ResultSet rs =  pst.executeQuery();
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
    
     public DefaultTableModel show_only_name(int curso) {
        DLeccion leccion_data = new DLeccion();
        DefaultTableModel modelo;
        String [] titulos = { "ID", "Nombre"};
        String [] registro = new String[2];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        try {
            ResultSet rs =  leccion_data.getLecciones(curso);
            while(rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombre");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
}
