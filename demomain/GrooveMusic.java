/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomain;

/**
 *
 * @author HP
 */
public class GrooveMusic implements MusicPlayer{
    @Override
    public void play(String F)
    {
        System.out.println("playing "+F);
    }
    @Override
    public void add(String F,String L)
    {
        System.out.println("adding "+F+" to "+L);
    }
    
}
