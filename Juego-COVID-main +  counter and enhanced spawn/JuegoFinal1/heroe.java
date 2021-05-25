import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heroe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heroe extends Actor
{
    /**
     * Act - do whatever the heroe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      moveAndTurn();
      eat();
    }
    public void moveAndTurn()  
    {
      move(4);
      if (Greenfoot.isKeyDown("left"))
      {
          turn(-3);
      }
      if (Greenfoot.isKeyDown("right"))
      {
          turn(3);
      }  
    }
    public void eat()
    {
      Actor covid;
      covid = getOneObjectAtOffset(0, 0, covid.class);
      if (covid != null)
      {
          World world;
          world = getWorld();
          world.removeObject(covid);
          Greenfoot.playSound("eating.wav");
          
          
      }
    }
}
