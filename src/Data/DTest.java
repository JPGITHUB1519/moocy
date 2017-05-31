/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelos.MTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tester
 */
public class DTest {
    private Conexion sqlserv = new Conexion();
    private Connection cn = sqlserv.conectar();
    
    public int insertar(MTest test_model) {
        String sSQL = "INSERT INTO TEST(descripcion, tipo, status) VALUES (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, test_model.getDescripcion());
            pst.setString(2, test_model.getTipo());
            pst.setBoolean(3, test_model.isStatus());           
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }        
    }
    
    public int insertarSP(MTest test_model) {
        String sSQL = "EXEC spInsertTest ?,?,?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, test_model.getDescripcion());
            pst.setString(2, test_model.getTipo());
            pst.setBoolean(3, test_model.isStatus());           
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }    
    }
    
    public int editar(MTest test_model) {
        String sSQL = "UPDATE TEST set descripcion = ?, tipo = ?, status = ? WHERE id = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, test_model.getDescripcion());
            pst.setString(2, test_model.getTipo());
            pst.setBoolean(3, test_model.isStatus());
            pst.setInt(4, test_model.getIdtest());
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }  
    }
    
    public int editarSP(MTest test_model) {
        String sSQL = "EXEC spUpdateTest ?,?,?,?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, test_model.getIdtest());
            pst.setString(2, test_model.getDescripcion());
            pst.setString(3, test_model.getTipo());
            pst.setBoolean(4, test_model.isStatus());
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }  
    }
    
    public int delete(MTest test_model) {
        String sSQL = "EXEC spDeleteTest ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, test_model.getIdtest());
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }
}
