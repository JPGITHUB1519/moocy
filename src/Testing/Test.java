/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Data.Conexion;
import Data.DCurso;
import Data.DLeccion;
import Data.DTest;
import Data.DUsuario;
import Modelos.MTest;
import Modelos.MUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tester
 */
public class Test {
    public static void main(String [] args) {
        //MTest test_model = new MTest();
        //DTest test_logic = new DTest();
        
        /*
        test_model.setIdtest(5);
        test_model.setDescripcion("Tester");
        test_model.setTipo("kind");
        test_model.setStatus(false);
        
        test_logic.insertar(test_model);
        */
        
        // System.out.println(test_logic.delete(test_model));
            DLeccion leccion = new DLeccion();
            ResultSet rs = leccion.getLecciones(3);
            int id;
            String nombre;
            
            try
            {
              while(rs.next())
                {
                   id = Integer.parseInt(rs.getString(0));
                   nombre = rs.getString(3); 
                   System.out.println(nombre);
                } 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
           
        
        
    }
}
