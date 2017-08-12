/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelos.MUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tester
 */
public class DUsuario {
    private Conexion sqlserv = new Conexion();
    private Connection cn = sqlserv.conectar();
    public int totalregistros;
    private String sSQL = "";
    
    public boolean login(MUsuario usuario)
    {
        sSQL = "EXEC spLoginUsuario ?, ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, usuario.getLogin());
            pst.setString(2, usuario.getPassword());
            ResultSet rs =  pst.executeQuery();
            if (rs.next()) {
                return true;
            }
            else 
            {
                return false;
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;   
        }      
    }
    
    public ResultSet getUsuarioById(int id)
    {
        sSQL = "EXEC getUsuarioById ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, id);
            ResultSet rs =  pst.executeQuery();
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
    
    public ResultSet getUsuarioByLogin(String login)
    {
        sSQL = "EXEC spgetUsuarioByLogin ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, login);
            ResultSet rs =  pst.executeQuery();
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
}
