/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Player;

/**
 *
 * @author USUARIO
 */
public class CuriousWorkmanship {
    
    private static Game currentGame = null;
    private static Player player =  null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CuriousWorkmanship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CuriousWorkmanship.player = player;
    }
    
    
    public static void main(String[] args){
    //create StartProgramView and start the program
    StartProgramView startProgramView = new StartProgramView();
    try{
    startProgramView.display();
    } catch (Throwable te) {
        System.out.println(te.getMessage());
        te.printStackTrace();
        startProgramView.display();
    }
    }

    
}
