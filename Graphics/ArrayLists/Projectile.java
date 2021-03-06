import java.awt.Color;
import java.awt.Graphics;
 
public class Projectile
{
    int x;
    int y;
     
    int width;
    int height;
     
	boolean visible;
    Color red;
 
     
    public Projectile(int x, int y)
    {
        
        this.x = x;
        this.y = y;
         
        this.width = 10;
        this.height = 10;
         
        this.red = new Color(255,0,0);
	
		this.visible = false;
 
    }
     
 
    public void drawMe(Graphics g)
    {
        
		if(visible)
		{
			g.setColor(red);
			g.fillOval(x,y,width,height);
		}
        else
		{
			x = -50;
		}
         
    }
	public boolean getVisible()
	{
		return visible;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}
    public void moveRight()
	{
		if(visible)
		{
			x += 8;
		}
		if(x >= 800)
		{
			visible = false;
			x = 50;
		}
		
			
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
     
     
     
     
     
     
 
 
}