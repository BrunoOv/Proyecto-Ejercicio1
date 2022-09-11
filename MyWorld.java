import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    { 
        super(600, 400, 1); 
        prepare();
        
    }
    private void prepare()
    {
        Ball ball = new Ball();
        ball.setRotation(50);
        addObject(ball,15,50);
        
    }
}
