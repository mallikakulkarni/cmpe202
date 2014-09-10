import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. The inspector does two things, calls out the 
     * fake coin and either keeps or returns the coin AND
     * if its a real coin calls on the pickers to release a gumball
     */
    public boolean pickRandomIns = false, pickGreenIns = false;
    public void act() 
    {
        GumballMachine gbm = new GumballMachine ();
        boolean actFlag = gbm.crankTurned();
        if (actFlag == true) {
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(100);
            
            if (randomInt % 2 == 0) {
                pickRandomIns = true;
            }
            
            if (randomInt % 2 != 0) {
                pickGreenIns = true;
       
            }
    
        }    
    }
}
