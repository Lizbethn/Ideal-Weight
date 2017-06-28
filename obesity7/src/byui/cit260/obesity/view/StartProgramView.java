/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import byui.cit260.obesity.model.Player;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class StartProgramView {

    public void display() {
       boolean done = false; //set flag to not done
        do{
       //prompt for and get players name
       String playersName = this.getPlayersName();
       if (playersName.toUpperCase().equals("Q")) //user wants to quit
           return; //exit the game
       
       //do the requested action and display the next view
       done = this.doAction(playersName);
       
       }while (!done);
    }

    /**
     *
     */
    

    private String promptMessage;

    
    public StartProgramView() {
        
    this.promptMessage = "\nPlease enter your name:";
    this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println("\n******************************************************************************************"
                + "\n*                                                                                                 *"
                + "\n* This game allows the player to "
                + "\n* recognize the foods that are healthy for "
                + "\n* their body according to the amount of calories per chosen dish "
                + "\n* First, the player enters his personal data into the system such as name, age, height, weight, sex. "
                + "\n* Additionally the system will show the system a list of colors selected so that the player chooses "
                + "\n* only one color in order that the system can recognize the mood of the player according to the color "
                + "\n* chosen by the player.\n" +
                "\n* Second, the system processes the player's height, weight, and age to display the player's current body"
                + "\n* mass index and rating. Additionally, the system shows the player the amount of weight he has to gain "
                + "\n*or lose to be at an appropriate weight level.\n" +
                    "\n* Third, the system shows the player a series of complete food dishes between healthy and unhealthy. "
                + "\n* The player chooses according to his criterion level which dish of food he wants to eat. "
                + "\n* Each plate of food has already registry in the system the amount of calories and according to "
                + "\n* the choice of plates of food chosen by the player the system will realize an operation to measure the "
                + "\n* index of body mass that has increased or decreased according to the index of body mass Obtained at the "
                + "\n* beginning of the game. According to the variation of BMI the player loses or wins. At the end the system "
                + "\n* shows the initial BMI player, the current BMI, mood according to color, classification according to BMI."
                + "\n*                                                                                                   *"
                + "\n****************************************************************************************************"
        );
        
       
    
    
    
    
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard;
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

    private boolean doAction(String playersName) {
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name:"
            + "The name must be greater that one character in lengh");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if( player == null){ //if unsuccessful
            System.out.println("\nError creating the player");
            return false;
        }
        
        //display newt view
        this.displayNextView(player);
        
        return true; //success !
    }

   

    private void displayNextView(Player player) {
        //display a custom weilcome message
        System.out.println("\n==========================================="
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n========================================"
        );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
       //Display the main view
        mainMenuView.display();
    }

   

 
    
}
