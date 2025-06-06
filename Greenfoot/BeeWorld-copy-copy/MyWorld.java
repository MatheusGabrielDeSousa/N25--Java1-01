import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abelha abelha = new Abelha();
        addObject(abelha,81,89);
        Aranha aranha = new Aranha();
        addObject(aranha,34,442);
        Mosca mosca = new Mosca();
        addObject(mosca,624,136);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,625,355);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,561,276);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,456,177);
    }
}
