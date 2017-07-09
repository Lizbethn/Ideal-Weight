/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import obesity.CuriousWorkmanship;
import byui.cit260.obesity.control.GameControl;
import byui.cit260.obesity.exception.MapControlException;
import byui.cit260.obesity.control.QuestionControl;
import java.util.logging.Level;
import java.util.logging.Logger;


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
                + "\nRP - Report"
                + "\nL - Print study list"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n------------------------------------------");
        
    }
    
    
    @Override
    public boolean doAction(String value) {
      
        value = value.toUpperCase(); //convert choice to upper case
        switch (value){
            case "N":{
                try {
              //create and start a new game
                this.startNewGame();
            } catch (MapControlException ex){
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
                break;
            case "G": //get and start an existing 
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "RP":
                this.printReport();
                break;
            case "L": //get and show all questions
                this.saveStudyList();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                ErrorView.display("MainMenuView","\n*** Invalid selection *** Try again");
                break;
        
        }
        return false;
        }

    private void startNewGame() throws MapControlException {
        //create a new game
        
        GameControl.createNewGame(CuriousWorkmanship.getPlayer());
        
        
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

    private void saveStudyList() {   
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            QuestionControl.saveStudyList(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void printReport() {
       ReportView reportView = new ReportView();
       reportView.display();
        
        
    }
     
    }

   
    
    

