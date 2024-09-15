/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package microsoftoffice;

/**
 *
 * @author HP
 */
import java.io.FileNotFoundException;
public class MicrosoftOffice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Word w=new Word();
        try{
            w.Open("online8.doc");
      
        }
        catch(SecurityException e)
        {
            System.out.println(e.getMessage());
        }
          PowerPoint p=new PowerPoint();
          try{
            p.Open("online8.ppt");
      
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
       
    }
    
}
