/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tester
 */
public class Conexion {
    private String connectionString =  
                    "jdbc:sqlserver://localhost:1433;databaseName=moocy;integratedSecurity=true";
    
    public Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(this.connectionString);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return con;
    }
    
}
