import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Rebota pelota cuando llega alos bordes
 * @Bruno Ovalle Hernandez 
 * @1.0
 */
public class Ball extends Actor
{
    public void act(){
        move(1);
        if(atWorldEdge())
        {
          turn(90);
        }
      }
    public boolean atWorldEdge(){
        if(getX()<10||getX()>getWorld().getWidth()-10)
        {
            return true;
        }
        if(getY()<10||getY()>getWorld().getHeight()-10)
        {
            return true;
        }
        else
        {
            return false;
        }    
    
    }
}

