import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements MouseListener
{
	private BufferedImage bufferedImage;
	boolean collision = false;
	int x, y, xo, yo, gopherx, gophery,holex, score;
	Random rand = new Random(); 
	int a = rand.nextInt(12) + 1;
	
    public Dimension getPreferredSize()
    {
        return new Dimension(800,600);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		
		if(bufferedImage==null) //useless
        bufferedImage = (BufferedImage)(createImage(getWidth(),getHeight())); //useless
		
		Graphics gbuffered = bufferedImage.createGraphics(); //useless
		Font font = new Font("Chalkboard", Font.PLAIN, 50);
		Color brown = new Color(97,25,7);
		g.setFont(font);
		
		g.setColor(brown);
		g.fillRect(0,0,800,600);
		
		g.setColor(Color.black);
		holex = 100;							//draw holes
		for(int i = 0;i < 4;i++)
		{
			g.fillOval(holex,100,100,100);
			holex = holex + 200;
		}
		holex = 100;
		for(int i = 0;i < 4;i++)
		{
			g.fillOval(holex,300,100,100);
			holex = holex + 200;
		}
		holex = 100;
		for(int i = 0;i < 4;i++)
		{
			g.fillOval(holex,500,100,100);
			holex = holex + 200;
		}
		
		drawGopher(g);	//draws gopher in random hole
		
		g.setColor(Color.orange);		//draws hammer
		g.fillOval(x,y,90,90);
		g.setColor(Color.blue);
		g.fillRect(x+35,y+90,10,50);
		
		checkXY(g);		//checks collision
		
		g.setColor(Color.green);
		g.drawString("Score: "+score,100,50);
		
		//g.drawImage(bufferedImage, 0, 0, null);
	}
	
	
	public void checkXY(Graphics g)
	{
		repaint();
		
		if(x != 0 && y != 0)
		{
			
			if(gopherx > x - 40 && gopherx < x + 65 && gophery > y - 40 && gophery < y + 85) //conditions of collision
			{
			
				g.setColor(Color.red);
				g.drawString("Hit",x,y);
				
				a = rand.nextInt(12) + 1; //draw new gopher after collision
				score++;
				
				repaint();
			}
		}
		
	g.setColor(Color.green);
	repaint();	
	
	
	
	}
	public void drawGopher(Graphics g)
	{
		
		switch(a) //draws gopher in random hole with int a
		{
			case 1:
				gopherx = 100;
				gophery = 100;
				break;
			case 2:
				gopherx = 300;
				gophery = 100;
				break;
			case 3:
				gopherx = 500;
				gophery = 100;
				break;
			case 4:
				gopherx = 700;
				gophery = 100;
				break;
			case 5:
				gopherx = 100;
				gophery = 300;
				break;
			case 6:
				gopherx = 300;
				gophery = 300;
				break;
			case 7:
				gopherx = 500;
				gophery = 300;
				break;
			case 8:
				gopherx = 700;
				gophery = 300;
			case 9:
				gopherx = 100;
				gophery = 500;
				break;
			case 10:
				gopherx = 300;
				gophery = 500;
				break;
			case 11:
				gopherx = 500;
				gophery = 500;
				break;
			case 12:
				gopherx = 700;
				gophery = 500;
		}
		g.setColor(Color.yellow);			//draws gopher
		g.fillOval(gopherx,gophery,60,60);
		g.setColor(Color.red);
		g.fillOval(gopherx+10,gophery+15,15,15);
		g.fillOval(gopherx+40,gophery+15,15,15);
		g.setColor(Color.GRAY);
		g.fillRect(gopherx+25,gophery+35,10,15);	
	}
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX() - 45;
		y = e.getY() - 45;
	}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	/*
		try 
		{
			Thread.sleep(2500);
		} 
	    catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
	*/
}