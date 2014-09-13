import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Picker extends Alien
{
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {}
    public abstract void pick();
   /* boolean greenFlag = false, randomFlag = false;
    public void act() 
    {
         greenFlag = ((Inspector) getWorld().getObjects(Inspector.class).get(0)).pickGreenInspector();
         randomFlag = ((Inspector) getWorld().getObjects(Inspector.class).get(0)).pickRandomInspector();
         
         if (greenFlag = true) {
             System.out.println ("Green Ball");
         }
         else {
              System.out.println ("Any Ball");
    }
} 
 */   
}
