import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
 
public class Circles extends JPanel
{
    int x, y, a;
     
    public Circles()
    {
        //(1) What is imported to get Graphics to work? all the graphics items
     
        //(2) What do you think the constructor does? How can you tell?
        x = 200;
        y = 200;
         
    }
    
    public Dimension getPreferredSize() 
    {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
	
	
    public void paintComponent(Graphics g)
    {
		
        super.paintComponent(g);
         while(a < 20)
		 {
			 a++;
			 x++;
			 y = y+300;
        //(3) In the paintComponent method, what do you think it is drawing?
        Color colorGreen = new Color(0, 128, 0);
        g.setColor(colorGreen);
        g.fillOval(x,y,100,50);
		 }
         
        //(4) Research drawOval - Type Java Graphics in Google .
        //What does each number in the drawOval parameters represent?
        //Draw another circle with a different color, location, and size.
         
    }
     
     
}