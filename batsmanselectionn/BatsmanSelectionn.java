/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batsmanselectionn;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class BatsmanSelectionn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       
        int totalRuns=input.nextInt();
        int totalOuts=input.nextInt();
         Batsman b=new Batsman(totalRuns,totalOuts);
      
        Committee c=new Committee();
        c.calculateAverage(b);
    }
    
}
