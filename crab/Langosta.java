import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Langosta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Langosta extends Actor
{
    private int gusanosComidos;
    
    public Langosta()
   {
       gusanosComidos=0;
    
   }
    
    /**
     * Act - do whatever the Langosta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Desplazarse por el mundo
        estableceDireccion();   
        move(5); 
        if(encimaGusano())
           comeGusano();
    } 
    
    /**
     * Metodo que modifica la direccion a la que esta viendo la langosta
     * lo hace de forma aleatoria
     */
    public void estableceDireccion()
    {
        int numero = Greenfoot.getRandomNumber(20);
        switch(numero)
        {
            case 0:
                 setRotation(270);
                 break;
            case 1:
                 setRotation(90);
                 break;
            case 2:
                 setRotation(180);
                 break;
            case 3:
                 setRotation(0);
        }
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
       gusanosComidos ++;
       Greenfoot.playSound("eating.wav");
    }
}
