/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelos.MCurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tester
 */
public class DCurso {
    private Conexion sqlserv = new Conexion();
    private Connection cn = sqlserv.conectar();
    public int totalregistros;
    private String sSQL = "";
    
    public int insert(MCurso curso) {
        //(nombre, slogan, descripcion, skill_level, fecha_lanzamiento, is_active )
        sSQL = "EXEC spInsertCurso ?, ?, ?, ?, ?, ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, curso.getNombre());
            pst.setString(2, curso.getSlogan());
            pst.setString(3, curso.getDescripcion());  
            pst.setString(4, curso.getSkill_level());
            pst.setString(5, curso.getFecha_lanzamiento());
            pst.setBoolean(6, curso.getIs_active());
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
      
        
        }        
    }
    
    public int addCourseToUsuario(int usuario_id, int curso_id) 
    {
        sSQL = "EXEC spAddCourseToUsuario ?, ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, usuario_id);
            pst.setInt(2, curso_id);
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
      
        
        }  
    }
    
    
    
    public int update(MCurso curso) {
        //(nombre, slogan, descripcion, skill_level, fecha_lanzamiento, is_active )
        sSQL = "EXEC spUpdateCurso ?, ?, ?, ?, ?, ?, ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, curso.getId());
            pst.setString(2, curso.getNombre());
            pst.setString(3, curso.getSlogan());
            pst.setString(4, curso.getDescripcion());  
            pst.setString(5, curso.getSkill_level());
            pst.setString(6, curso.getFecha_lanzamiento());
            pst.setBoolean(7, curso.getIs_active());
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
      
        
        }        
    }
   
    public int delete(MCurso curso)
    {
        sSQL = "EXEC spDeleteCurso ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, curso.getId());
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }
    
    public int DeleteCourseToUsuario(int usuario_id, int curso_id) 
    {
        sSQL = "EXEC spDeleteCourseToUsuario ?, ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, usuario_id);
            pst.setInt(2, curso_id);
            return pst.executeUpdate();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
      
        
        }  
    }
    
    public DefaultTableModel show(String buscar) {
        DefaultTableModel modelo;
        String [] titulos = { "ID", "Nombre", "Slogan", "Descripcion", "Skill Level", "Fecha de Lanzamiento", "is_active"};
        String [] registro = new String[7];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT * FROM cursos WHERE nombre like '%" + buscar + "%' ORDER BY id";
        try {
            Statement st = cn.createStatement();
            ResultSet rs =  st.executeQuery(sSQL);
            
            while(rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("slogan");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("skill_level");
                registro[5] = rs.getString("fecha_lanzamiento");
                registro[6] = rs.getString("is_active");
                totalregistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
    
    public ResultSet getCursos() {
        sSQL = "EXEC spGetCursos";
        try {
            Statement st = cn.createStatement();
            ResultSet rs =  st.executeQuery(sSQL);
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
    
    public ResultSet getCursosByUsuario(int usuario_id)
    {
        sSQL = "EXEC getCoursesByUsuario ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, usuario_id);
            ResultSet rs =  pst.executeQuery();
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
    
    
    public ResultSet getRemainingCoursesByUsuario(int usuario_id)
    {
        sSQL = "EXEC getRemainingCoursesByUsuario ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, usuario_id);
            ResultSet rs =  pst.executeQuery();
          
            return rs;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        } 
    }
    
    public DefaultTableModel show_get_cursos_by_usuario(int usuario_id) {
        DefaultTableModel modelo;
        String [] titulos = { "ID", "Nombre"};
        String [] registro = new String[2];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        ResultSet rs = this.getCursosByUsuario(usuario_id);
        try {
            while(rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombre");
                totalregistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
    
    public DefaultTableModel show_remaining_cursos_by_usuario(int usuario_id) {
        DefaultTableModel modelo;
        String [] titulos = { "ID", "Nombre"};
        String [] registro = new String[2];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        ResultSet rs = this.getRemainingCoursesByUsuario(usuario_id);
        try {
            while(rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombre");
                totalregistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }     
    }
   
}
