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
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of calculateBMI method, of class PlayerControl.
     */
    @Test
    public void testCalculateBMI() {
        System.out.println("calculateBMI");
        /**
        * Test case #1
        */
        System.out.println("Test case #1");
        double weight = 55.0;
        double height = 1.7;
        PlayerControl instance = new PlayerControl();
        double expResult = 19.031141868512112;
        double result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        * Test case #2
        */
        System.out.println("Test case #2");
        weight = 55.0;
        height = -1.0;
        expResult = 0.0;
        result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #3
        */
        System.out.println("Test case #3");
        weight = -1.0;
        height = 1.7;
        expResult = 0.0;
        result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #4
        */
        System.out.println("Test case #4");
        weight = 0.5;
        height = 0.0;
        expResult = 0.0;
        result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #5
        */
        System.out.println("Test case #5");
        weight = 0.0;
        height = 0.0;
        expResult = 0.0;
        result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #6
        */
        System.out.println("Test case #6");
        weight = 0.0;
        height = 100.0;
        expResult = 0.0;
        result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
        
        /**
        * Test case #7
        */
        System.out.println("Test case #7");
        weight = 100.0;
        height = 0.0;
        expResult = 0.0;
        result = instance.calculateBMI(weight, height);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateLevelMood method, of class PlayerControl.
     */
    @Test
    public void testCalculateLevelMood() {
        System.out.println("calculateLevelMood");
        /**
        * Test case #1
        */
        System.out.println("Test case #1");
        String color = "pink";
        PlayerControl instance = new PlayerControl();
        String expResult = "Fear, Uncertain";
        String result = instance.calculateLevelMood(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        * Test case #2
        */
        System.out.println("Test case #2");
        color = "red";
        expResult = "Energy";
        result = instance.calculateLevelMood(color);
        assertEquals(expResult, result);
        
         /**
        * Test case #3
        */
        System.out.println("Test case #3");
        color = "skyblue";
        expResult = "Calm, Relaxed";
        result = instance.calculateLevelMood(color);
        assertEquals(expResult, result);
        
         /**
        * Test case #4
        */
        System.out.println("Test case #4");
        color = "gray";
        expResult = "very nervous, Anxious";
        result = instance.calculateLevelMood(color);
        assertEquals(expResult, result);
        
         /**
        * Test case #5
        */
        System.out.println("Test case #5");
        color = "";
        expResult = "error";
        result = instance.calculateLevelMood(color);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateIdelWeight method, of class PlayerControl.
     */
    @Test
    public void testCalculateIdelWeight() {
        System.out.println("calculateIdelWeight");
         /**
        * Test case #1
        */
        System.out.println("Test case #1");
        double height = 1.7;
        String sex = "female";
        String complexion = "median";
        PlayerControl instance = new PlayerControl();
        String expResult = "iw_min = 59.2; iw_max = 65.0";
        String result = instance.calculateIdelWeight(height, sex, complexion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
          /**
        * Test case #2
        */
        System.out.println("Test case #2");
        height = -1.0;
        sex = "female";
        complexion = "little";
        expResult = "iw_min = 46.2; iw_max = 48.5";
        result = instance.calculateIdelWeight(height, sex, complexion);
        assertEquals(expResult, result);
    }
    
}
