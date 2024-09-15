/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercee;

/**
 *
 * @author HP
 */
public class Cart {
    private int userID;
    public Cart(int userID)
    {
        this.userID=userID;
    }
    public int getUserID()
    {
        return userID;
    }
    public void setUserID(int userID)
    {
        this.userID=userID;
        
    }
    public void money(Item[] i)
    {
        double totalPrice=0.0;
        for(Item item : i)
        {
            totalPrice+=item.getItemPrice();
        }
        if(totalPrice>5000)
        {
            System.out.println("too many items");
        }
        else
        {
            System.out.println(totalPrice);
        }
    }
    
}
