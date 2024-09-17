/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batsmanselectionn;

/**
 *
 * @author HP
 */
public class Committee {
    public Committee()
    {
        
    }
    public void calculateAverage(Batsman b)
    {
       
        double avg= (double) b.getTotalRuns()/b.getTotalOuts();
        System.out.println(avg);
        if(avg>=50)
        {
            System.out.println("selected");
        }
        else
        {
            System.out.println("not selected");
        }
    }
}
