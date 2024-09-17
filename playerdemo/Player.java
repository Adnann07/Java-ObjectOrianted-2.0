/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playerdemo;

/**
 *
 * @author HP
 */
public class Player {
    public String playerType;
    public double totalScore;
    public double totalMatches;
   
    public Player(String playerType, double totalScore, double totalMatches)
    {
        this.playerType=playerType;
        this.totalScore=totalScore;
        this.totalMatches=totalMatches;
    }
    public double calculateFinalScore()
    {
        if("new".equals(playerType))
        {
            return totalScore/totalMatches;
        }
        else
        {
            return (2*totalScore*totalMatches)/(totalScore+totalMatches);
        }
    }
    
}
