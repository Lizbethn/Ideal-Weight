/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;


import java.io.Serializable;
/**
 *
 * @author Lizbeth
 */
public enum Actor implements Serializable{
    
    Elf("small and mischievous who hides his greatest treasure"),
    Individual("person who wants to improve his ideal weight");
    
    private final String description;
        private String coordinates;
        private int currentScore;
        private String player;
        
    Actor(String description) {
        this.description = description;
        //coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    
    



}
