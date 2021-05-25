import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class mundo extends Actor
{
    /**
     * Act - do whatever the mundo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    space thisGame;
    public void act() 
    {
        //contact with covid
        
        if(isTouching(covid.class))
        {
            removeTouching(covid.class);
            thisGame.lives--;
        }
        
        if (thisGame.lives == 0){
        Greenfoot.setWorld(new GameOver());
        }
        
        
        
    }    
}
