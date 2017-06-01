/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class HelpMenuView {
    private String promptMessage;

    public HelpMenuView() {
        this.helpMenu();
    }
    
    
    private void helpMenu(){
    System.out.println("\n"
                + "\n------------------------------------------"
                + "\n| Help Menu"
                + "\n------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Estimating the amount of resources"
                + "\nH - Harvesting resources"
                + "\nD - Delivering resources to warehouse"
                + "\nR - Exit returns to the Main Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    
    }
    
    
    public void displayHelpMenuView() {
        boolean done = false; //set flag to not done
        do{
        //prompt for and get players name
        String menuOption = this.getMenuOption();   
        if(menuOption.toUpperCase().equals("Q"))//user wants to quit
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

      menuOption = menuOption.toUpperCase();//convert choice to upper case
        
        switch (menuOption){
            case "G": //What is the goal of the game?
                 this.goalGame();
                 break;
            case "M": //How to move
                 this.howToMove();
                 break;
            case "E": //Estimating the amount of resources
                 this.amountResources();
                 break;
            case "H": //Harvesting resources
                 this.harvestingResources();
                 break;
            case "D": //Delivering resources to warehouse
                 this.deliveringResources();
                 break;
            case "R": // Exit returns to the Main Menu
                 this.returnMainMenu();
                 break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
               break;
        }
        
        return false;
    }

    private void goalGame() {
        System.out.println("\n*** goalGame() function called: What is the goal of the game? ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove() function called: How to move ***");
    }

    private void amountResources() {
        System.out.println("\n*** amountResources() function called: Estimating the amount of resources ***");
    }

    private void harvestingResources() {
        System.out.println("\n*** harvestingResources() function called: Harvesting resources ***");
    }

    private void deliveringResources() {
        System.out.println("\n*** deliveringResources() function called: Delivering resources to warehouse ***");
    }

    private void returnMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
                
       //Display the main view
        mainMenuView.displayMainMenuView();
    }

    

    
    
    
    
    
    
    
    
}
