import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerThree extends Actor
{
    int deltaX; // This variable will be used to store the change in x.
    int deltaY; // This variable will be used to store the change in y.
    
     /**
     * Constructor. This is where all initialization for PlayerTwo goes.
     */
    public PlayerThree()
   {
        deltaX = 5;
        deltaY = 5;
   }
    
    /**
     * Act - do whatever PlayerThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
   {
        // Add your action code here.
            
        //If PlayerThree gets too close to bottom edge, change y direction to go up.
        if (getY() > getWorld().getHeight() - 30)
        {
            deltaY = -5;
        }
            
        //If PlayerThree gets too close to top edge, change y direction to go down.
        if (getY() < + 30)
        {
            deltaY = 5;
        }
        
        //If PlayerThree gets too close to left edge, change x direction to go right.
        if (getX() < + 37)
        {
            deltaX = 5;
        }
        
        //If PlayerThree gets too close to right edge, change x direction to go left.
        if (getX() > + 563)
        {
            deltaX = -5;
        }
        setLocation(getX() + deltaX, getY() + deltaY);
   } 
}