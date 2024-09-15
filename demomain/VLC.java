/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomain;

/**
 *
 * @author HP
 */
public class VLC extends MediaPlayer {
    @Override
    public void changeSpeed(String F,double speed)
    {
        System.out.println(F+speed);
    }
    @Override
    public void record(String F,double D)
    {
        System.out.println(D+D);
    }
    @Override
    public void play(String F)
{
    System.out.println(F);
}
    @Override
    public void add(String F,String L)
    {
        System.out.println(F+L);
    }
    @Override
 public void playVid(String F)
 {
     System.out.println(F);
 }
    @Override
    public void addSub(String F,String L)
    {
        System.out.println(F+L);
    }
}
