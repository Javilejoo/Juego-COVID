import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{
    public static int lives = 3;
    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       
        prepare(); //reset game
    }
    private void prepare(){
        lives = 0; // reset counter
        heroe n1=new heroe();
        addObject(n1,80,200);
        crearcovid(10);
        mundo w = new mundo(); // agregar el mundo
        addObject(w, 50, 350);
    
    }
    public void crearcovid(int numero){
      for(int i=0;i<numero;i++){
          covid c=new covid();
          int x=Greenfoot.getRandomNumber(299);
          int y=Greenfoot.getRandomNumber(199);
      
        addObject(c,x + 300,y + 200);
        }
    }  
    public void act()
    {
        showText("Vidas restantes: " + lives, 100,25 );
    }
}

