/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercee;

/**
 *
 * @author HP
 */
public class Item {
    
    private double itemPrice;
    public Item(double itemPrice)
    {
        this.itemPrice=itemPrice;
    }
    public double getItemPrice()
    {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice=itemPrice;
    }
}
