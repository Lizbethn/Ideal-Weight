/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainMenuView {

    private String promptMessage;

    public MainMenuView() {
    
        this.menu();
    }
    
    private void menu(){
    System.out.println("\n"
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
    
    public void displayMainMenuView() {
        boolean done = false; //set flag to not done
        do{
        //prompt for and get players name
        String menuOption = this.getMenuOption();
        if(menuOption.toUpperCase().equals("Q")) //user wants to quit
            return; // exit the game
        
        //do the requested action and display the next view
        done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        while(!valid){ //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blancks
            
            if(value.length() < 1){ //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
        break; //end the loop
        
        }
        return value; //return the value 
    }

    private boolean doAction(String menuOption) {
      
        menuOption = menuOption.toUpperCase(); //convert choice to upper case
        switch (menuOption){
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
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** statExistingGame() ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenuView = new HelpMenuView();
       //Display the help view
       helpMenuView.displayHelpMenuView();
    
    }

    private void saveGame() {
       System.out.println("*** saveGame() ***");
    }
     
    }

   
    
    

