import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class navecita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class navecita extends Actor
{
    /**
     * Act - do whatever the navecita wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
        // Apublic void act() 
    {
        moveAround();
        eat();
    }
    
    public void moveAround()
    {
        move(4);
    }
    
    public void eat()
    {
        Actor heroe;
        heroe = getOneObjectAtOffset(0, 0, heroe.class);
        if (heroe != null)
        {
            World world;
            world = getWorld();
            world.removeObject(heroe);
            Greenfoot.playSound("eating.wav");
        }
    }
    
}
      
        

