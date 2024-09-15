/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demomain;

/**
 *
 * @author HP
 */
public class Demomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrooveMusic g=new GrooveMusic();
        g.play("xyz");
        g.add("a","x");
        VLC v=new VLC();
        v.add("abc", "xyz");
        v.addSub("abc", "xyz");
        v.changeSpeed("abc", 0);
        v.play("abc");
        v.playVid("abc");
        v.record("abc", 0);
        
    }
    
}
