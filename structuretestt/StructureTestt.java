/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package structuretestt;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class StructureTestt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        DevelopStructure d=new DevelopStructure();
        double radius=input.nextDouble();
    
        System.out.println("Volume : "+d.produceStructure(radius));
        double radius2=input.nextDouble();
        double height=input.nextDouble();
        System.out.println("Volume : "+d.produceStructure(radius2, height));
        double base=input.nextDouble();
        double height2=input.nextDouble();
        double length=input.nextDouble();
        System.out.println("Volume: "+d.produceStructure(base, height2, length));
    }
    
}
