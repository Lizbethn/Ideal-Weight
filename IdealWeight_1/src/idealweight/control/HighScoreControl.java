/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import idealweigh.IdealWeight;
import idealweight.model.Player;

/**
 *
 * @author Lizbeth
 */
public class HighScoreControl {
    
    public ArrayList<HighScore> getHighScores() {
        Player player = new Player();
        player = IdealWeight.getPlayer();
            
        String playerName = player.getName();
        int playerScore = player.getBestScore();
        // create an ArrayList of high scores 
        ArrayList<HighScore> highScore = new ArrayList<>();

        // adding objects to the ArrayList
        highScore.add(new HighScore(playerName, playerScore));
        highScore.add(new HighScore("Toby", 1650));
        highScore.add(new HighScore("Lizbeth", 150));
        highScore.add(new HighScore("Eva", 100));
        highScore.add(new HighScore("Victor", 10));
        
        Collections.sort(highScore, new Comparator<HighScore>() {
            @Override
            public int compare(HighScore o1, HighScore o2) {
            return o2.getPlayerScore() - o1.getPlayerScore();
            }
        });
        
        return highScore;
    }

    public static class HighScore {

    private String playerName;
    private int playerScore;

    
    public HighScore(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.playerName);
        hash = 89 * hash + Objects.hashCode(this.playerScore);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HighScore other = (HighScore) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerScore, other.playerScore)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return (playerName + "\t\t\t" + playerScore);
    }
}}
