/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class PlayerRankingSystem {
    
    //Player class
    static class Player {
        private String playerID;
        private String name;
        private String teamName;
        private double score;
        private String playerId;
        
        public Player(String playerID, String name, String teamName, double score) {
            this.playerID = playerID;
            this.name = name;
            this.teamName = teamName;
            this.score = score;
        }
        public String getPlayerId() {
            return playerId;
        }
        public String getName() {
            return name;
        }
        public String getTeamName() {
            return teamName;
        }
        public double getScore() {
            return score;
        }      
        @Override
        public String toString() {
            return playerId + " | " + name + " | "
                    + teamName + " | Score: " + score;
        }
    }
    //Selection Sort - highest score to lowest
    public static void selectionSort2(Player[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            //Assume the current position has the highest score
            int highestIndex = i;
            
            //Find the player with the highest score
            for (int j = i + 1; j < players.length; j++) {
                if (players[j].getScore() >players[highestIndex].getScore()){
                    highestIndex = j;
                }
            }
            //Swap Player objects
            if (highestIndex != i) {
                Player temp = players[i];
                players[i] = players[highestIndex];
                players[highestIndex] = temp;
            }
        }
    }
    // Display players
    public static void displayPlayers(Player[] players) {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
