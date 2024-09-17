/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structuretestt;

/**
 *
 * @author HP
 */
public class DevelopStructure {
    public double produceStructure(double radius)
    {
        double structureVolume=(double)(4.0/3.0)*Math.PI*Math.pow(radius,3);
        return structureVolume;
    }
    
    public double produceStructure(double radius,double height)
    {
        double structureVolume=(double)(1.0/3.0)*Math.PI*Math.pow(radius,2)*height;
        return structureVolume;
    }
    
     public double produceStructure(double base,double height,double length)
    {
        double structureVolume=(double)(1.0/2.0)*(base*height)*length;
        return structureVolume;
    }
    
    
    
}
