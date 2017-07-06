/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import byui.cit260.obesity.exception.MapControlException;


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
        try{
        GameControl.createNewGame(CuriousWorkmanship.getPlayer());
        } catch (MapControlException mce){
            System.out.println(mce.getMessage());
            return;
        }
        //
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
       this.console.println("\n\nEnter the file path for file where the game"
               + "is to be saved");
       String filePath = this.getInput();
       
       try{
         GameControl.getSavedGame(filePath);
       } catch ( Exception ex){
        ErrorView.display("MainMenuView", ex.getMessage());
       }
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       //Display the help view
       helpMenuView.display();
    
    }

    private void saveGame() {
       this.console.println("\n\nEnter the file path for file where the game"
               + "is to be saved");
       String filePath = this.getInput();
       
       try{
       GameControl.saveGame(CuriousWorkmanship.getCurrentGame(), filePath);
       } catch (Exception ex){
         ErrorView.display("MainMenuView", ex.getMessage());
       }
    }
     
    }

   
    
    

