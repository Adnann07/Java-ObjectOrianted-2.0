/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demomain;

/**
 *
 * @author HP
 */
abstract class MediaPlayer implements MusicPlayer,VideoPlayer {
    abstract void changeSpeed(String F,double speed);
    abstract void record(String F,double D);
    
}
