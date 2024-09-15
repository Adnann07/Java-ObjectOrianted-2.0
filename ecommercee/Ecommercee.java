/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercee;

/**
 *
 * @author HP
 */
public class Ecommercee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item[] i=new Item[3];
        i[0]=new Item(1200);
           i[1]=new Item(1200);
              i[2]=new Item(1200);
              Cart c=new Cart(123);
              c.money(i);
    }
    
}
