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
    public static int score = 0;
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
        lives = 3; // reset counter
        score = 0;
        heroe n1=new heroe();
        addObject(n1,100,200);
        
        mundo w = new mundo(); // agregar el mundo
        addObject(w, 50, 350);
    
        crearcovid(10); // crear 10 covids iniciales
        
       
        
    
    
    }
    public void crearcovid(int numero){
      for(int i=0;i<numero;i++){
          covid c=new covid();
          int x=Greenfoot.getRandomNumber(299);
          int y=Greenfoot.getRandomNumber(199);
      
        addObject(c,x + 300,y + 200);
        }
    }  
    long lastAdded = System.currentTimeMillis();
    public void act()
    {
        showText("Vidas restantes: " + lives, 100,25 );
        showText("Punteo: " + score, 500,25 );
        if (score == 1000){
            Greenfoot.setWorld(new Win());
        }
        
        
    long curTime  = System.currentTimeMillis();
    if (curTime >= lastAdded + 1000) //1000ms = 1s //agregar cada 5 segundos más covids
    {
       crearcovid(10);
       lastAdded  = curTime;
    } 
    }
}

