/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lizbeth
 */
    public enum Actor implements Serializable {
        
        Toby("The pupy playful"),
        Lizbeth("The smart"),
        Eva("The fast"),
        Victor("The wise");
    
        // class instance variables
        private String description;
        private Point coordinates;
        private int currentScore;
        private String player;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
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

    public class Point {

        public int x;
        public int y;

        private Point(int i, int i0) {
            int x = i;
            int y = i0;
        }
    }
    
}
