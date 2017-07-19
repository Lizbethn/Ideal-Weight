/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;

import java.io.PrintWriter;
import idealweigh.IdealWeight;

/**
 *
 * @author Lizbeth
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = IdealWeight.getOutFile();
    private static final PrintWriter logFile = IdealWeight.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "---------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
    
}
