/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;

import java.util.Scanner;
import idealweight.control.GameControl;

/**
 *
 * @author Lizbeth
 */
class GameMenuView {
    private final String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Game Menu                             |"
                + "\n-----------------------------------------"
                + "\n1 - View map"
                + "\n2 - Move location"
                + "\n3 - Help menu"
                + "\n4 - Save game"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }
    void displayMenu() {
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
                
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String choice = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\n" + this.menu); 
            
            choice = keyboard.nextLine(); //get next line typed on keyboard
            choice = choice.trim(); // trim off leading and trailing breaks
            
            if (choice.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return choice; //return the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "1": //Redirect to view map menu
                this.displayMap();
                break;
            case "2": //Redirect to location menu
                this.displayLocationMenu();
                break;
            case "3": //Redirect to help menu
                this.displayHelpMenu();
                break;            
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    } 

    private void displayMap() {
        //display the Map
        MapDisplayView displayMapView = new MapDisplayView();
        displayMapView.displayMap();
    }

    private void displayLocationMenu() {
        // display the Location Building menu
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.display();
    }

    private void displayHelpMenu() {  
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    
}
