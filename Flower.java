import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    private int stepCounter;
    
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("newFlower.jpg");
        gfi.scale( 75, 75 );
        this.setImage( gfi );
        this.stepCounter = 0;
    } // gfi is freed up
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.stepCounter++;
        // Write code that will spin this object 360 degrees at at
        // 15 degrees each time it acts. Then the flower should 
        // disappear.
        
        this.turn(5);
        System.out.println(this.getRotation());
        if(this.stepCounter == 144)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
        
    }
}