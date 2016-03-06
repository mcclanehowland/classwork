import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel
{
	int x, y;
	
	public Scenery()
	{
		x = 200;
		y = 200;
	}

	 public Dimension getPreferredSize() 
    {
        
        return new Dimension(800,600);
    }
 
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
		Color otherColor = new Color(100, 200, 4);
		g.setColor(otherColor);
		g.fillRect(225, 275, 50, 200);
        
        Color colorGreen = new Color(245, 128, 111);
        g.setColor(colorGreen);
        g.fillOval(x,y,100,100);
		
		
         
       
         
    }
}