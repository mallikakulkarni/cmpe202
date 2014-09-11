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
    boolean actFlag = false;
    int randomInt;
     //int mouseX, mouseY;
    public void act() 
    {
        actFlag = ((GumballMachine) getWorld().getObjects(GumballMachine.class).get(0)).crankTurned();
        if (actFlag == true) {
            
            Random randomGenerator = new Random();
            randomInt = randomGenerator.nextInt(100);
            /*
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();
            */
            System.out.println( "Real Coin!" ) ;
            /*GreenfootImage gi;
            gi = new GreenfootImage(100,100);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Real Coin", 0, 50 );
            Message m = new Message() ;
            m.setImage(gi);
            World world = getWorld();
            world.addObject( m, mouseX, mouseY ) ;
            */
        }    
    }    
    
    public boolean pickRandomInspector() {
        if (randomInt % 2 == 0) {
                pickRandomIns = true;
                return pickRandomIns;
        }
        else {
                return pickGreenIns;
        }
    }
    public boolean pickGreenInspector() {
                
        if (randomInt % 2 != 0) {
                pickGreenIns = true;
                return pickGreenIns;
        }
        else {
                return pickRandomIns;
        }
    }    
}
