import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         move(1);
        turn(10-Greenfoot.getRandomNumber(20));
    if (getX()>getWorld().getWidth()/2 &&
        getY()>getWorld().getWidth());}
    }

