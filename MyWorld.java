import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int stepCounter; 

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.stepCounter = 0;

        this.addObject(new FlowerEater(), 50, 200);
        this.addFlower(); // A new method the programmer created

        // Add a Flower eater to the world (somewhere.) 
        // Write code that spawns new flowers randomly to the 
        // world periodically.
    }

    public void act()
    {
        this.stepCounter++;
        if ( this.stepCounter % 100 == 0)
        {
            this.addFlower();

        }

    }

    private void addFlower()
    {
        int randX = Greenfoot.getRandomNumber(this.getWidth());
        int randY = Greenfoot.getRandomNumber(this.getHeight());
        this.addObject(new Flower(), randX, randY);
    }

    
    
}
