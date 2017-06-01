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
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calculateCaloriesGain method, of class GameControl.
     */
    @Test
    public void testCalculateCaloriesGain() {
        System.out.println("calculateCaloriesGain");
        /**
        * Test case #1
        */
        System.out.println("Test case #1");
        String sex = "female";
        double weight = 69.0;
        double height = 162.0;
        int age = 25;
        String activity_factor = "Light activity";
        GameControl instance = new GameControl();
        double expResult = 1556.7875000000001;
        double result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        * Test case #2
        */
        System.out.println("Test case #2");
        sex = "male";
        weight = 0.0;
        height = 0.25;
        age = -1;
        activity_factor = "Extremely high activity";
        expResult = 0.0;
        result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #3
        */
        System.out.println("Test case #3");
        sex = "female";
        weight = 55.0;
        height = -1.0;
        age = 0;
        activity_factor = "Moderate activity";
        expResult = 0.0;
        result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #4
        */
        System.out.println("Test case #4");
        sex = "male";
        weight = -1.0;
        height = 0.0;
        age = 0;
        activity_factor = "Light activity";
        expResult = 0.0;
        result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #5
        */
        System.out.println("Test case #5");
        sex = "female";
        weight = 0.25;
        height = 0.0;
        age = 0;
        activity_factor = "Light activity";
        expResult = 0.0;
        result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
        
         /**
        * Test case #6
        */
        System.out.println("Test case #6");
        sex = "male";
        weight = 120.0;
        height = 150.0;
        age = 33;
        activity_factor = "Moderate activity";
        expResult = 2708.64;
        result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
        
         /**
        * Test case #7
        */
        System.out.println("Test case #7");
        sex = "female";
        weight = 30.0;
        height = 166.0;
        age = 54;
        activity_factor = "Light activity";
        expResult = 1004.875;
        result = instance.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        assertEquals(expResult, result, 0.0);
    
    }
    
}
