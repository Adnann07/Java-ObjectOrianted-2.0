/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoftoffice;

/**
 *
 * @author HP
 */
public class Word {
    public void Open(String s) throws SecurityException
    {
        if(s.endsWith(".doc") || s.endsWith(".docx"))
        {
            System.out.println("executed");
        }
        else
        {
                throw new SecurityException("not supported");
        }
    }
    
}
