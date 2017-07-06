/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Lizbeth
 */

    public abstract class View implements ViewInterface{
    
        protected String displayMessage;
        
        protected final BufferedReader keyboard = CuriousWorkmanship.getInFile();
        protected final PrintWriter console = CuriousWorkmanship.getOutFile();
        
        public View(){
    
    }
        
        public View(String message){
        this.displayMessage = message;
        }
        
     
        @Override
        public void display(){
        
            boolean done = false;
            do{
            //prompt for and get players name
            String value = this.getInput();
            if(value.toUpperCase().equals("Q"))
                return;
            //do the requested action and display the next view
            done = this.doAction(value);
            
            }while (!done); //exit the view when done == true
        }
        
        @Override
        public String getInput(){
        
            
            boolean valid = false;
            String value = null;
            
            //while a valid name has not been retrieved
            try{
            while (!valid){
            
                //prompt for the player's name
                System.out.println("\n" + this.displayMessage);
                
                //get value entered from the heyboard
                value = this.keyboard.readLine();
                value = value.trim();
                
                if(value.length()<1){
                    System.out.println("\n*** You must enter a value ***");
                    continue;
                }
                break;
            }}catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
            return value;
        }
        
         public void setMessage(String message) {
        this.displayMessage = message;
    }
        
    }
    

