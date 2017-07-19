/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.control;

import idealweight.exceptions.MathControlException;

/**
 *
 * @author Lizbeth
 */
public class MathControl {

    public double calcVolumeTrianglePrism(double base, double length, double height)
                    throws MathControlException {
      try {
            //Check for invalid values
            if(base <= 0){
                return -1;
            }

            if(length <= 0){
                return -1;
            }

            if(height <= 0){
                return -1;
            }

           //Body statements
            double area = .5 * base * height;
            double volume = area * length;

            //error handling
            if (volume <= 0){
                throw new MathControlException("Answer cannot be less than zero");
            }

            return volume;
            
        } catch(MathControlException mce){
            return -1;
        }
    }
    
    public double calcAreaTrapezoid(double base1, double base2, double height)
                    throws MathControlException {
        try {
            //Check for invalid values
            if(base1 <= 0){
                return -1;
            }

            if(base2 <= 0){
                return -1;
            }

            if(height <= 0){
                return -1;
            }

            //Body statements
            double area = (base1 + base2) * (height/2);

            if (area <= 0){
                throw new MathControlException("Answer cannot be less than zero");
            }

           //Return outputs
             return area;
             
        } catch (MathControlException mce) {
            return -1;
        }
    }
                    
    public double calcDistanceTwoPoints(double x1, double x2, double y1, double y2)
                    throws MathControlException {
        try {
        //Check for invalid values
            if((x1 == y1 && x1 == x2 && x1 == y2) || (y1 == x1 && y1 == x2 && y1 == y2) ||
                (x2 == y1 && x2 == x1 && x2 == y2) || (y2 == y1 && y2 == x2 && y2 == y1)) { 
                
                throw new MathControlException("Entered an invalid value");
            }            

            //Body statements
            double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

            //Return outputs
            return distance; 
            
        } catch (MathControlException mce) {
            return -1;
        }
    }
    
    public double calcTempConversion(double degreeF)
                    throws MathControlException {
        
        try {
            double degreeC = (5.0 / 9.0) * (degreeF - 32.0);

            if (degreeC == 0) {
                throw new MathControlException("Answer cannot be zero");
            }

            return degreeC;
        
        } catch (MathControlException mce) {
            return -1;
        }
    }
}
