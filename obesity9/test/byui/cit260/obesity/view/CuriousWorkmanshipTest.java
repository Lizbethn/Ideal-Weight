/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import obesity.CuriousWorkmanship;
import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class CuriousWorkmanshipTest {
    
    public CuriousWorkmanshipTest() {
    }

    /**
     * Test of getCurrentGame method, of class CuriousWorkmanship.
     */
    @Test
    public void testGetCurrentGame() {
        System.out.println("getCurrentGame");
        Game expResult = null;
        Game result = CuriousWorkmanship.getCurrentGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCurrentGame method, of class CuriousWorkmanship.
     */
    @Test
    public void testSetCurrentGame() {
        System.out.println("setCurrentGame");
        Game currentGame = null;
        CuriousWorkmanship.setCurrentGame(currentGame);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPlayer method, of class CuriousWorkmanship.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Player expResult = null;
        Player result = CuriousWorkmanship.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPlayer method, of class CuriousWorkmanship.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        Player player = null;
        CuriousWorkmanship.setPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class CuriousWorkmanship.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CuriousWorkmanship.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
