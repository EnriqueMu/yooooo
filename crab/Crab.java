import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     leeTecla();   
     move(5); 
     if(encimaGusano())
        comeGusano();
    
    }    
    
    /**
     * Metodo que lee del teclado, y si la tecla coincide, rota la cara de cangrejo
     * hacia donde indica la tecla
     */
   public void leeTecla()
   {
       if(Greenfoot.isKeyDown("up"))
          setRotation(270);
       else if(Greenfoot.isKeyDown("down"))
                setRotation(90);
            else if(Greenfoot.isKeyDown("left"))
                    setRotation(180);
                 else if(Greenfoot.isKeyDown("right"))
                         setRotation(0);
            
   }
    
   public boolean encimaGusano()
   {
       if(isTouching(Gusano.class))
          return true;
       return false;
    }
    
   public void comeGusano()
   {
       removeTouching(Gusano.class);
       //gusanosComidos ++;
       Greenfoot.playSound("eating.wav");
    }
}
