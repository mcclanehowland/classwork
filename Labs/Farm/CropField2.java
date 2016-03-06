import java.awt.Color;
import java.awt.Graphics;
 
public class CropField2
{
     
    int x;
	int y;
	int anotherY;
	int h;
	int counter;
	
	
	public CropField2(int x,int y)
	{
		this.x = x;
		this.y = y;
		anotherY = y;
		h = 10;
		

	}
	public void drawMe(Graphics g)
	{
		
		int tempX = x;
		int tempY = y;
		
		for(int r = 0; r < 6; r++)
		{
			for(int c = 0; c < 6;c++)
			{
				g.setColor(Color.green);
				g.fillRect(tempX,tempY,20,h);
				g.setColor(Color.orange);
				g.fillOval(tempX,tempY-20,20,20);
				tempX += 40;
			}	
			tempX = x;
			tempY += 40;
		}
	}
	public void grow()
	{
		h += 5;
		y -= 5;
		counter++;
		if(counter > 5)
		{
			h = 10;
			y = anotherY;
			counter = 1;
		}
	}
	
     
}