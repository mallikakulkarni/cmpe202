import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GumballMachine extends Actor
{
    Actor haveCoin, coin; 
    Inspector inspector;
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

   
    public void act() 
    {


        if(Greenfoot.mousePressed(this)) {          
            if (haveCoin == null) {
                setMessage("No coin");
            } else {
                setMessage ("Crank Turned!");
                
                GumballWorld world = (GumballWorld) getWorld();
                List<Actor> inspectors = world.getObjects(Inspector.class);
                inspector = (Inspector) inspectors.get(0);
                
                inspector.inspect(haveCoin);
            }
        }    

        coin = getOneObjectAtOffset( +10, +10, Coin.class ) ;
        if ( coin != null )
        {
            if (haveCoin != null)
            {   
                coin.move(-500);
            }
            else {
                haveCoin = coin;
                setMessage ("Have coin");
                ((Coin) coin).act();
            }

        }
    }

    public void setMessage(String msg) {
        Message m = new Message();
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX=this.getX();
        mouseY=this.getY();
        World world = getWorld();
        if (m.getWorld() != null) {
            world.removeObject(m);

        }
        world.addObject(m, mouseX, mouseY);
        m.setText(msg);
    }

    public Actor getCoin () {
        return coin;
    }
    
    

}
