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
}
