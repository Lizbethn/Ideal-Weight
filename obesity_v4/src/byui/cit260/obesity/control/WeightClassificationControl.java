/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

/**
 *
 * @author USUARIO
 */
public class WeightClassificationControl {
    
    public String calculateWeightClassification(double bmi){
    
    String classification = "";
    if ( bmi <= 0) {		
    return classification = "error";		
    }else if ( bmi >= 0.1 && bmi < 1){	
    return classification = "0";		
    }else if (bmi > 1 && bmi < 18.5){		
    return classification = "Not enough weight";
    }else if (bmi >=18.5 && bmi <= 24.9) {	
    return classification = "Normal weight";	
    }else if (bmi >=25.0 && bmi <= 26.9) {	
    return classification = "Overweight grade I";
    }else if (bmi >=27.0 && bmi <= 29.9) {	
    return classification = "Overweight grade II (preobesity)";
    }else if (bmi >=30.0 && bmi <= 34.9) {	
    return classification = "Type I obesity";
    }else if (bmi >=35.0 && bmi <= 39.9) {	
    return classification = "Type II obesity";
    }else if (bmi >=40.0 && bmi <= 49.9) {	
    return classification = "Type III (morbid) obesity";
    }else if(bmi > 49.9){ 
    return classification = "Obesity type IV (extreme)";
        }
        return null;
    
    }
    
    
    
}
