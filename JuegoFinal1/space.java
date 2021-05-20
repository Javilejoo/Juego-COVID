import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{

    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        heroe n1=new heroe();
        addObject(n1,50,300);
        crearcovid(10);
    }
    public void crearcovid(int numero){
      for(int i=0;i<numero;i++){
          covid c=new covid();
          int x=Greenfoot.getRandomNumber(getWidth());
          int y=Greenfoot.getRandomNumber(getHeight());
          addObject(c,x,y);
      }
    }  
}

