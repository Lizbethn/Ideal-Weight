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
public class PlayerControl {
    
    public double calculateBMI(double weight, double height){
        
    if (weight <=  0 || height <= 0) {
            return 0;
        }else if (height == 0 && weight == 0) {
            return 0;
        }else if(weight > 0 && height == 0) {
          return 0;
        }

    double bmi = weight / Math.pow(height, 2);
    return bmi;



    }
    
    public String calculateLevelMood(String color){
        
     String mood = "";
     
    switch(color)
      {
         case "red" :
            mood = "Energy";
            break;
         case "skyblue" :
            mood = "Calm, Relaxed";
            break;
         case "gray" :
            mood = "very nervous, Anxious";
            break;
         case "black" :
            mood = "Stressed, Nervous";
            break;
          case "green" :
            mood = "Normal, Average";
            break;
           case "yellow" :
            mood = "Imaginative";
            break;
           case "pink" :
            mood = "Fear, Uncertain";
            break;
           case "" :
            mood = "error";
            break;
         default :
            mood = "color invalid";
      }
    return mood;
    }
    
    public String calculateIdelWeight(double height, String sex, String complexion){
    
        String peso_ideal = " ";
   
if(height == 1.50  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 45.0; iw_max = 47.2";
} else if(height <= 1.50  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 46.1; iw_max = 50.6";
} else if(height <= 1.50  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 47.2; iw_max = 52.9";
} else if(height <=1.50  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 45.0; iw_max = 50.2";
} else if(height <=1.50  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 48.4; iw_max = 55.4";
} else if(height <=1.50  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 50.6; iw_max = 56.2";
} else if(height <=1.52  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 46.2; iw_max = 48.5";
} else if(height <=1.52  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 47.4; iw_max = 52.0";
} else if(height <=1.52  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 48.5; iw_max = 54.3";
} else if(height <=1.52  &&  sex.equals("male")  &&  complexion.equals("little")) {		
 peso_ideal = "iw_min = 46.2; iw_max = 51.5";
} else if(height <=1.52  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 49.7; iw_max = 56.9";
} else if(height <=1.52  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 52.0; iw_max = 57.8";
} else if(height <=1.54  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 47.4; iw_max = 49.8";
} else if(height <=1.54  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 48.6; iw_max = 53.4";
} else if(height <=1.54  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 49.8; iw_max = 55.7";
} else if(height <=1.54  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 47.4; iw_max = 52.9";
} else if(height <=1.54  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 51.0; iw_max = 58.4";
} else if(height <=1.54  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 53.4; iw_max = 59.3";
} else if(height <=1.56  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 48.7; iw_max = 51.1";
} else if(height <=1.56  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 49.9; iw_max = 54.8";
} else if(height <=1.56  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 51.1; iw_max = 57.2";
} else if(height <=1.56  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 48.7; iw_max = 54.3";
} else if(height <=1.56  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 52.3; iw_max = 59.9";
} else if(height <=1.56  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 54.8; iw_max = 60.8";
} else if(height <=1.58  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 49.9; iw_max = 52.4";
} else if(height <=1.58  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 51.2; iw_max = 56.2";
} else if(height <=1.58  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 52.4; iw_max = 58.7";
} else if(height <=1.58  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 49.9; iw_max = 55.7";
} else if(height <=1.58  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 53.7; iw_max = 61.5";
} else if(height <=1.58  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 56.2; iw_max = 62.4";
} else if(height <=1.60  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 51.2; iw_max = 53.8";
} else if(height <=1.60  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 52.5; iw_max = 57.6";
} else if(height <=1.60  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 53.8; iw_max = 60.2";
} else if(height <=1.60  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 51.2; iw_max = 57.1";
} else if(height <=1.60  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 55.0; iw_max = 63.0";
} else if(height <=1.60  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 57.6; iw_max = 64.0";
} else if(height <=1.62  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 52.5; iw_max = 55.1";
} else if(height <=1.62  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 53.8; iw_max = 59.0";
} else if(height <=1.62  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 55.1; iw_max = 61.7";
} else if(height <=1.62  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 52.5; iw_max = 58.5";
} else if(height <=1.62  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 56.4; iw_max = 64.6";
} else if(height <=1.62  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 59.0; iw_max = 65.6";
} else if(height <=1.64  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 53.8; iw_max = 56.5";
} else if(height <=1.64  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 55.1; iw_max = 60.5";
} else if(height <=1.64  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 56.5; iw_max = 63.2";
} else if(height <=1.64  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 53.8; iw_max = 60.0";
} else if(height <=1.64  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 57.8; iw_max = 66.2";
} else if(height <=1.64  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 60.5; iw_max = 67.2";
} else if(height <=1.66  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 55.1; iw_max = 57.9";
} else if(height <=1.66  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 56.5; iw_max = 62.0";
} else if(height <=1.66  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 57.9; iw_max = 64.8";
} else if(height <=1.66  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 55.1; iw_max = 61.4";
} else if(height == 1.66  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 59.2; iw_max = 67.8";
} else if(height <=1.66  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 62.0; iw_max = 68.9";
} else if(height <=1.68  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 56.4; iw_max = 59.3";
} else if(height <=1.68  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 57.9; iw_max = 63.5";
} else if(height <=1.68  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 59.3; iw_max = 66.3";
} else if(height <=1.68  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 56.4; iw_max = 62.9";
} else if(height <=1.68  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 60.7; iw_max = 69.5";
} else if(height <=1.68  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 63.5; iw_max = 70.6";
} else if(height <=1.70  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 57.8; iw_max = 60.7";
} else if(height <=1.70  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 59.2; iw_max = 65.0";
} else if(height <=1.70  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 60.7; iw_max = 67.9";
} else if(height <=1.70  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 57.8; iw_max = 64.4";
} else if(height <=1.70  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 62.1; iw_max = 71.2";
} else if(height <=1.70  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 65.0; iw_max = 72.3";
} else if(height ==1.72  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 59.2; iw_max = 62.1";
} else if(height ==1.72  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 60.6; iw_max = 66.6";
} else if(height ==1.72  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 62.1; iw_max = 69.5";
} else if(height ==1.72  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 59.2; iw_max = 66.0";
} else if(height ==1.72  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 63.6; iw_max = 72.8";
} else if(height ==1.72  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 66.6; iw_max = 74.0";
} else if(height ==1.74  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 60.6; iw_max = 63.6";
} else if(height ==1.74  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 62.1; iw_max = 68.1";
} else if(height ==1.74  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 63.6; iw_max = 71.1";
} else if(height ==1.74  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 60.6; iw_max = 67.5";
} else if(height ==1.74  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 65.1; iw_max = 74.5";
} else if(height ==1.74  &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 68.1; iw_max = 75.7";
} else if(height ==1.76  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 62.0; iw_max = 65.0";
} else if(height ==1.76  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 63.5; iw_max = 69.7";
} else if(height ==1.76  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 65.0; iw_max = 72.8";
} else if(height ==1.76  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 62.0; iw_max = 69.1";
} else if(height ==1.76  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 66.6; iw_max = 76.3";
} else if(height ==1.76 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 69.7; iw_max = 77.4";
} else if(height ==1.78  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 63.4; iw_max = 66.5";
} else if(height ==1.78  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 65.0; iw_max = 71.3";
} else if(height ==1.78  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 66.5; iw_max = 74.5";
} else if(height ==1.78  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 63.4; iw_max = 70.7";
} else if(height ==1.78  &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 68.1; iw_max = 78.0";
} else if(height ==1.78 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 71.3; iw_max = 79.2";
} else if(height ==1.80  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 64.8; iw_max = 68.0";
} else if(height ==1.80  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 66.4; iw_max = 72.9";
} else if(height ==1.80  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 68.0; iw_max = 76.1";
} else if(height ==1.80  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 64.8; iw_max = 72.3";
} else if(height ==1.80 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 69.7; iw_max = 79.8";
} else if(height ==1.80 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 72.9; iw_max = 81.0";
} else if(height ==1.82  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 66.2; iw_max = 69.6";
} else if(height == 1.82  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 67.9; iw_max = 74.5";
} else if(height ==1.82  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 69.6; iw_max = 77.8";
} else if(height ==1.82  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 66.2; iw_max = 73.9";
} else if(height ==1.82 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 71.2; iw_max = 81.6";
} else if(height ==1.82 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 74.5; iw_max = 82.8";
} else if(height ==1.84  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 67.7; iw_max = 71.1";
} else if(height ==1.84  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 69.4; iw_max = 76.2";
} else if(height ==1.84  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 71.1; iw_max = 79.6";
} else if(height ==1.84  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 67.7; iw_max = 75.5";
} else if(height ==1.84 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 72.8; iw_max = 83.4";
} else if(height ==1.84 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 76.2; iw_max = 84.6";
} else if(height ==1.86  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 69.2; iw_max = 72.7";
} else if(height ==1.86  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 70.9; iw_max = 77.8";
} else if(height ==1.86  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 72.7; iw_max = 81.3";
} else if(height ==1.86  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 69.2; iw_max = 77.1";
} else if(height ==1.86 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 74.4; iw_max = 85.2";
} else if(height ==1.86 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 77.8; iw_max = 86.5";
} else if(height ==1.88  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 70.7; iw_max = 74.2";
} else if(height ==1.88  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 72.5; iw_max = 79.5";
} else if(height ==1.88  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 74.2; iw_max = 83.1";
} else if(height ==1.88  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 70.7; iw_max = 78.8";
} else if(height ==1.88 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 76.0; iw_max = 87.0";
} else if(height ==1.88 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 79.5; iw_max = 88.4";
} else if(height ==1.90  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 72.2; iw_max = 75.8";
} else if(height ==1.90  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 74.0; iw_max = 81.2";
} else if(height ==1.90  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 75.8; iw_max = 84.8";
} else if(height ==1.90  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 72.2; iw_max = 80.5";
} else if(height ==1.90 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 77.6; iw_max = 88.9";
} else if(height ==1.90 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 81.2; iw_max = 90.3";
} else if(height ==1.92  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 73.7; iw_max = 77.4";
} else if(height ==1.92  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 75.6; iw_max = 82.9";
} else if(height ==1.92  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 77.4; iw_max = 86.6";
} else if(height ==1.92  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 73.7; iw_max = 82.2";
} else if(height ==1.92 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 79.3; iw_max = 90.8";
} else if(height ==1.92 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 82.9; iw_max = 92.2";
} else if(height ==1.94  &&  sex.equals("female")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 75.3; iw_max = 79.0";
} else if(height ==1.94  &&  sex.equals("female")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 77.2; iw_max = 84.7";
} else if(height ==1.94  &&  sex.equals("female")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 79.0; iw_max = 88.4";
} else if(height ==1.94  &&  sex.equals("male")  &&  complexion.equals("little")) {
 peso_ideal = "iw_min = 75.3; iw_max = 83.9";
} else if(height ==1.94 &&  sex.equals("male")  &&  complexion.equals("median")) {
 peso_ideal = "iw_min = 80.9; iw_max = 92.7";
} else if(height ==1.94 &&  sex.equals("male")  &&  complexion.equals("big")) {
 peso_ideal = "iw_min = 84.7; iw_max = 94.1";
    }
return peso_ideal;
    }
    
}
