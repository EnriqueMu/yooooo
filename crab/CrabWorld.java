import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        Crab c1 = new Crab();
        Gusano g1 = new Gusano();
        Langosta l = new Langosta();
        //addObject(1,460, 490);
        //for para los gusanos
        //for(int i =0; i<10; i++)
        
        addObject(c1, 100, 50);
        
    }
    
    /**
     * TAREA
     * 1. La clase crustaceo(superclase), padre de cangrejo y langosta
     * 2. Marcador(puntos) de langosta y cangrejo(un puntaje para cada quien)
     * 3. FIn del juego (Condicion de juego terminar) que imprima mensaje de ganador
     * 4. Portada o terminacion del juego(cancion o algo)
     */
}
