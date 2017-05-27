/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity;

import byui.cit260.obesity.model.Dishes;
import byui.cit260.obesity.model.Player;
import byui.cit260.obesity.model.Weight_classification;


/**
 *
 * @author USUARIO
 */
public class Obesity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player  playerOne = new Player();
        playerOne.setName("Lizbeth Casas");
        playerOne.setAge(25);
        playerOne.setWeight(55.00);
        playerOne.setHeight(1.56);
        playerOne.setBmi(55);
        playerOne.setClassification("Obese: Type III");
        playerOne.setColor("white");
        playerOne.setSex("female");
        playerOne.setComplexion("little");
        
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Dishes dishesOne = new Dishes();
        dishesOne.setName("Ceviche");
        dishesOne.setCalorie(200);
        
        String dishesInfo = dishesOne.toString();
        System.out.println(dishesInfo);
        
        Weight_classification wc = new Weight_classification();
        wc.setBmi_weight(40.00);
        wc.setClassification_weight("Obese: Type II");
        
        String wcInfo = wc.toString();
        System.out.println(wcInfo);
        
        
        
          
    }

    
    
}
