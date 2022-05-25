import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    /**
     * Write a description of class PlayerTwo here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
public class PlayerTwo extends Actor
{
    int deltaX; // This variable will be used to store the change in x.
    int deltaY; // This variable will be used to store the change in y.
    
    /**
     * Constructor. This is where all initialization for PlayerTwo goes.
     */
    public PlayerTwo()
    {
        deltaX = 5;
        deltaY = 5;
    }
    
    /**
     * Act - do whatever the PlayerTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
            
        //If PlayerTwo gets too close to bottom edge, change y direction to go up.
        if (getY() > getWorld().getHeight() - 35)
        {
            deltaY = -5;
        }
            
        //If PlayerTwo gets too close to top edge, change y direction to go down.
        if (getY() < + 35)
        {
            deltaY = 5;
        }
        
        //If PlayerTwo gets too close to left edge, change x direction to go right.
        if (getX() < + 40)
        {
            deltaX = 5;
        }
        
        //If PlayerTwo gets too close to right edge, change x direction to go left.
        if (getX() > + 560)
        {
            deltaX = -5;
        }
        setLocation(getX() + deltaX, getY() + deltaY);
    }     
}