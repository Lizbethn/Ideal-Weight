/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;


/**
 *
 * @author USUARIO
 */
public class MainMenuView extends View{


    public MainMenuView() {
    super("\n"
                + "\n------------------------------------------"
                + "\n| Main Menu"
                + "\n------------------------------------------"
                + "\nN - Start new Game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n------------------------------------------");
        
    }
    
    
    @Override
    public boolean doAction(String value) {
      
        value = value.toUpperCase(); //convert choice to upper case
        switch (value){
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //get and start an existing 
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        
        }
        return false;
        }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(CuriousWorkmanship.getPlayer());
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** statExistingGame() ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       //Display the help view
       helpMenuView.display();
    
    }

    private void saveGame() {
       System.out.println("*** saveGame() ***");
    }
     
    }

   
    
    

