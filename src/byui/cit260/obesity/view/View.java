/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import java.util.Scanner;

/**
 *
 * @author Lizbeth
 */

    public abstract class View implements ViewInterface{
    
        protected String displaMessage;
        
        public View(){
    
    }
        
        public View(String message){
        this.displaMessage = message;
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
        
            Scanner keyboard = new Scanner(System.in);
            boolean valid = false;
            String value = null;
            
            //while a valid name has not been retrieved
            while (!valid){
            
                //prompt for the player's name
                System.out.println("\n" + this.displaMessage);
                
                //get value entered from the heyboard
                value = keyboard.nextLine();
                value = value.trim();
                
                if(value.length()<1){
                    System.out.println("\n*** You must enter a value ***");
                    continue;
                }
                break;
            }
            return value;
        }
        
    }
    

