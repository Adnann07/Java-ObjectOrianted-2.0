/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batsmanselectionn;

/**
 
 * @author HP
 */
public class Batsman {
    private int totalRuns;
    private int totalOuts;
    public Batsman(int totalRuns,int totalOuts)
    {
        this.totalRuns=totalRuns;
        this.totalOuts=totalOuts;
    }
    public int getTotalRuns()
    {
        return totalRuns;
    }
    public void setTotalRuns(int totalRuns)
    {
        this.totalRuns=totalRuns;
        
    }
     public int getTotalOuts()
    {
        return totalOuts;
    }
    public void setTotalOuts(int totalOuts)
    {
        this.totalOuts=totalOuts;
        
    }
    
}
