/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import idealweigh.IdealWeight;

/**
 *
 * @author Lizbeth
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = IdealWeight.getInFile();
    protected final PrintWriter console = IdealWeight.getOutFile();
    
    public View(){

    }

    public View(String message) {
            this.displayMessage = message;
    }
    
    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game

            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false; //initalize to not valid
        String value = null;
        try {
        
            while (!valid) { //loop while and invalid value is enter
                this.console.println("\n" + this.displayMessage); 

                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing breaks

                if (value.length() < 1) { //value is blank
                    ErrorView.display(this.getClass().getName(),
                                        "You must enter a value.");
                    continue;
                }

                break; //end the loop
            }
        } catch (Exception e){
                ErrorView.display(this.getClass().getName(),
                                    "Error reading input: " + e.getMessage());
                return null;
        }
        
        return value; //return the value entered
    }
    
    public void setMessage(String message) {
        this.displayMessage = message;
    }
    
}
