import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    boolean crankTurnedFlag = false;
    public void act() 
    {
        int mouseX, mouseY, mousehcX, mousehcY ;
        

        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            System.out.println( "Clicked!" ) ;
            GreenfootImage gi;
            gi = new GreenfootImage(100,100);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Crank Turned!", 0, 50 );
            Message m = new Message() ;
            m.setImage(gi);
            World world = getWorld();
            world.addObject( m, mouseX, mouseY ) ;
            crankTurnedFlag = true;
        }

        Actor coin;
        coin = getOneIntersectingObject( Coin.class ) ;
        if ( coin != null )
        {
            MouseInfo mousehc = Greenfoot.getMouseInfo();
            mousehcX=mousehc.getX();
            mousehcY=mousehc.getY();
            System.out.println( coin.toString() ) ;
            GreenfootImage gihc;
            gihc = new GreenfootImage(100,100);
            gihc.setColor( java.awt.Color.YELLOW);
            gihc.fill();
            gihc.setColor(java.awt.Color.BLACK);
            gihc.drawString("Have Coin!", 0, 50);
            Message mhc = new Message();
            mhc.setImage(gihc);
            World world = getWorld() ;
            world.addObject(mhc, mousehcX, mousehcY);
            world.removeObject( coin ) ;
        }
    }
        
    public boolean crankTurned () {
          return crankTurnedFlag;
            
    }    
}
