/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity;

import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Player;
import byui.cit260.obesity.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author USUARIO
 */
public class CuriousWorkmanship {
    
    private static Game currentGame = null;
    private static Player player =  null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CuriousWorkmanship.logFile = logFile;
    }
    
    
    
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CuriousWorkmanship.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CuriousWorkmanship.inFile = inFile;
    }
    
    

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CuriousWorkmanship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CuriousWorkmanship.player = player;
    }
    
    
    public static void main(String[] args){
    //create StartProgramView and start the program
    
    try{
    //open charcter stream files for end user input and output
    CuriousWorkmanship.inFile = new BufferedReader(new InputStreamReader(System.in));
    CuriousWorkmanship.outFile = new PrintWriter(System.out, true);
    
    String filePath = "log.txt";
    CuriousWorkmanship.logFile = new PrintWriter(filePath);
    
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.display();
    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
        e.printStackTrace();;
    }
    
    finally{
        try {
            if(CuriousWorkmanship.inFile != null)
               CuriousWorkmanship.inFile.close();
            
            if (CuriousWorkmanship.outFile != null)
               CuriousWorkmanship.outFile.close();
            
            if(CuriousWorkmanship.logFile != null)
                CuriousWorkmanship.logFile.close();
            
        } catch (IOException ex) {
            System.out.println("Error closing files");
            return;
        }
        
        }

    
    }

    
}
