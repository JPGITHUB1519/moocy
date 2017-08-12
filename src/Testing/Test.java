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
import static Utils.Browser.openWebpage;
import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Tester
 */
public class Test {
    
    public static void main(String [] args) {
        
       openWebpage("https://www.google.com.do/");
        
    }
}
