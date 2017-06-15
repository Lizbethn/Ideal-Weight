/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class WeightClassificationControlTest {
    
    public WeightClassificationControlTest() {
    }

    /**
     * Test of calculateWeightClassification method, of class WeightClassificationControl.
     */
    @Test
    public void testCalculateWeightClassification() {
        System.out.println("calculateWeightClassification");
        /**
        * Test case #1
        */
        System.out.println("Test case #1");
        
        double bmi = 19.3;
        WeightClassificationControl instance = new WeightClassificationControl();
        String expResult = "Normal weight";
        String result = instance.calculateWeightClassification(bmi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         /**
        * Test case #2
        */
        System.out.println("Test case #2");
        bmi = -1.0;
        expResult = "error";
        result = instance.calculateWeightClassification(bmi);
        assertEquals(expResult, result);
        
        /**
        * Test case #3
        */
        System.out.println("Test case #3");
        bmi = 0.5;
        expResult = "0";
        result = instance.calculateWeightClassification(bmi);
        assertEquals(expResult, result);
        
        /**
        * Test case #4
        */
        System.out.println("Test case #4");
        bmi = 0;
        expResult = "error";
        result = instance.calculateWeightClassification(bmi);
        assertEquals(expResult, result);
        
        /**
        * Test case #5
        */
        System.out.println("Test case #5");
        bmi = 17.9;
        expResult = "Not enough weight";
        result = instance.calculateWeightClassification(bmi);
        assertEquals(expResult, result);
        
        /**
        * Test case #6
        */
        System.out.println("Test case #6");
        bmi = 50.1;
        expResult = "Obesity type IV (extreme)";
        result = instance.calculateWeightClassification(bmi);
        assertEquals(expResult, result);
       
    }
    
}
