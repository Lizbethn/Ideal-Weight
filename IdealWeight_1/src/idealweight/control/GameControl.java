/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import idealweigh.IdealWeight;
import idealweight.exceptions.GameControlException;
import idealweight.exceptions.MapControlException;
import idealweight.model.Game;
import idealweight.model.Map;
import idealweight.model.Player;

/**
 *
 * @author Lizbeth
 */
public class GameControl {

    public static Player createPlayer(String playersName) {

        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        IdealWeight.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game();
        IdealWeight.setCurrentGame(game);
        
        game.setPlayer(player);
 
    }

    public static void assignsScenesToLocations(Map map) {
        System.out.println("assignsScenesToLocations function called ");
    }

    public static void saveGame(Game game, String filePath) 
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
    }

    public static void getSavedGame(String filePath) 
                        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        IdealWeight.setCurrentGame(game);// save in IdealWeight
        
    }

    public void createNewGame() {
        System.out.println("createNewGame function called");
    }

}
