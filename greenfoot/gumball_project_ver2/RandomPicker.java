import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act () {}
    
    public void pick() 
    {
        Gumball gb = new GreenGumball();
        int lottery = Greenfoot.getRandomNumber(3);
        
        switch (lottery)
        {   
            case 0 : gb = new BlueGumball();
            break;
            case 1 : gb = new RedGumball();
            break;
            case 2 : gb = new GreenGumball();
            break;
        }
        World world = getWorld();
        world.addObject(gb, 500, 100);
        //GumballMachine gbm = new GumballMachine();
        
        setMessage(gb.getClass().getName());
    }
    
    /*
    public void setMessage(String msg) {
        Message m = new Message();
        
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX=mouse.getX();
        mouseY=mouse.getY();
        World world = getWorld();
        if (m.getWorld() != null) {
            world.removeObject(m);

        }
        world.addObject(m, mouseX, mouseY);
        m.setText(msg);
    }
    */
}
