/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoftoffice;

/**
 *
 * @author HP
 */
import java.io.FileNotFoundException;

public class PowerPoint {
    public void Open(String s) throws FileNotFoundException
    {
        if(s.endsWith(".ppt") || s.endsWith(".pps"))
        {
            System.out.println("executed");
        }
        else
        {
            
           throw new FileNotFoundException("not supported");
            
        }
    }
}
