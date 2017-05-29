/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Data.DTest;
import Modelos.MTest;

/**
 *
 * @author Tester
 */
public class Test {
    public static void main(String [] args) {
        MTest test_model = new MTest();
        DTest test_logic = new DTest();
        
        test_model.setDescripcion("Test2");
        test_model.setTipo("kind");
        test_model.setStatus(true);
        test_logic.insertar(test_model);
        System.out.println("Hey");
        
        
    }
}
