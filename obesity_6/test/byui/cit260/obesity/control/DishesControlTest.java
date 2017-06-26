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
public class DishesControlTest {
    
    public DishesControlTest() {
    }

    /**
     * Test of calculateCaloriesByDishes method, of class DishesControl.
     */
    
    /**
     * Test case #1
     */
    @Test
    public void testCalculateCaloriesByDishes() {
        System.out.println("calculateCaloriesByDishes");
        /**
        * Test case #1
        */
        System.out.println("Test case #1");
        String dishes = "Albóndigas";
        DishesControl instance = new DishesControl();
        int expResult = 202;
        int result = instance.calculateCaloriesByDishes(dishes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    
     /**
     * Test case #2
     */
   
        System.out.println("Test case #2");
        dishes = "Ceviche";
        expResult = 0;
        result = instance.calculateCaloriesByDishes(dishes);
        assertEquals(expResult, result);

    /**
     * Test case #3
     */
   
        System.out.println("Test case #3");
        dishes = "Guiso de fideos con carne";
        expResult = 400;
        result = instance.calculateCaloriesByDishes(dishes);
        assertEquals(expResult, result);

     /**
     * Test case #4
     */
   
        System.out.println("Test case #4");
        dishes = "Fajita";
        expResult = 117;
        result = instance.calculateCaloriesByDishes(dishes);
        assertEquals(expResult, result);

        
        /**
     * Test case #5
     */
   
        System.out.println("Test case #5");
        dishes = " ";
        expResult = 0;
        result = instance.calculateCaloriesByDishes(dishes);
        assertEquals(expResult, result);
     
    }
    
}
