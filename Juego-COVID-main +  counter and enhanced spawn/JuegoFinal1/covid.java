import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class covid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class covid extends Actor
{
    /**
     * Act - do whatever the covid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.<
        move(2);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn (Greenfoot.getRandomNumber(90-45));
        }
        }
        if(getY()>=m.getWidth()-5||getY()<=5){
            turn(180);
            if (Greenfoot.getRandomNumber(100)<90){
            turn (Greenfoot.getRandomNumber(90-45));
            
        }
        }
    }  
}    
