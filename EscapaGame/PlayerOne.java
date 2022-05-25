import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerOne extends Actor
{
   SimpleTimer timer= new SimpleTimer(); 
   
   /**
     * Constructor. This is where all initialization for PlayerTwo goes.
     */
    public PlayerOne()
   {
        timer.mark();
   }
    
   /**
     * Act - do whatever the PlayerOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
   {
        // Add your action code here.
        
        //movement keys
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(10);
        }  
        
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(360);
            move(10);
            
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(10);
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(10);
        }
        
        //if PlayerOne touches an enemy, the game will end.
        if (isTouching(PlayerTwo.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        if (isTouching(PlayerThree.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        if (isTouching(PlayerFour.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        if (isTouching(PlayerFive.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        //if PlayerOne touches a border, the game  will end.
        if (isTouching(BorderTop.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        if (isTouching(BorderBottom.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        if (isTouching(BorderLeft.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
        
        if (isTouching(BorderRight.class))
        {
            int time = timer.millisElapsed();
            getWorld().showText("Time elapsed; " + time, 300,100);
            Greenfoot.stop();
        }
   }      
}
