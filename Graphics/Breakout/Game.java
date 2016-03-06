import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.Random;

public class Game extends JPanel implements MouseListener, KeyListener
{
	Random r = new Random();
	int num = 0;
	int paddlex = 250;
	int paddley = 580;
	int ballx = r.nextInt(750)+1;
	int bally = 350;
	int xspeed = -4;
	int yspeed = -4;
	int mousex, mousey;
	int[] rectx = new int[12];
	int[] recty = new int[12];
	boolean user = true;
	boolean animate = true;
	private BufferedImage bufferedImage;
	
	public Game()
	{
		setRect();
	}
	public void setRect()
	{
		num = 0;
		for(int i = 0; i < 12; i++)
		{
			
			if(i < 6)
			{
				recty[i] = 10;
				rectx[i] = num*125;
			}
			if(i > 6)
			{
				if(i == 7)
				{
					num = 1;
				}
				recty[i] = 100;
				rectx[i] = num*125;
			}
			num++;			
		}
	}
    public Dimension getPreferredSize()
    {
        return new Dimension(800,600);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		
		if(bufferedImage==null) //useless
        bufferedImage = (BufferedImage)(createImage(getWidth(),getHeight())); 
		Graphics gbuffered = bufferedImage.createGraphics(); 
		gbuffered.setColor(Color.WHITE);
		gbuffered.fillRect(0, 0, 800, 600);
		
		if(user == true)
		{
			ball(gbuffered);
			paddle(gbuffered);
			for(int i = 0;i < rectx.length; i++)
			{
				drawRect(rectx[i],recty[i],gbuffered);
			}
		}
		if(user == false)
		{
			gbuffered.setColor(Color.green);
			gbuffered.fillRect(300,350,50,50);
			gbuffered.setColor(Color.red);
			gbuffered.fillRect(350,350,50,50);
		}
		check();
		checkCollision();
		g.drawImage(bufferedImage, 0, 0, null);
	}
	public void ball(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(ballx,bally,20,20);
	}
	public void paddle(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRoundRect(paddlex,paddley,200,20,20,20);
	}
	public void animateBall()
	{
		while(animate)
		{
			ballx += xspeed;
			bally += yspeed;
			if(ballx >= 780)
			{
				xspeed *= -1;
			}
			if(ballx <= 0)
			{
				xspeed *= -1;
			}
			if(bally <= 0)
			{
				yspeed *= -1;
			}
			
			sleep(10);
			repaint();
		}
	}
	public void checkCollision()
	{
		if(ballx <= paddlex+200 && ballx >= paddlex)
		{
			if(bally >= 552)
			{
				yspeed *= -1;
				repaint();
			}
		}
		if(bally > 600)
		{
			user = false;
			repaint();
		}
		//retry
		if(mousex <= 350 && mousex >= 300 && mousey >= 350 && mousey <=400 && user == false)
		{
			user = true;
			reset();
		}
	}
	public void check()
	{
		int i = 0;
		for(i = 0; i < 12; i++)
		{
			if(ballx >= rectx[i] && ballx <= rectx[i]+100 && bally <= recty[i]+60)
			{
				recty[i] = -1000;
				yspeed *= -1;
				repaint();
			}
			
		}
	}
	public void reset()
	{
		ballx = r.nextInt(800)+1;
		bally = 350;
		xspeed = -5;
		yspeed = -5;
		mousex = 0;
		mousey = 0;
		setRect();
		repaint();
	}public void drawRect(int column, int row, Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(column, row, 100,50);
		repaint();
	}
	public void sleep(int time)
	{
		try 
		{
			Thread.sleep(time);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
	}
	public void mousePressed(MouseEvent e)
	{
		mousex = e.getX();
		mousey = e.getY();
	}
	public void keyPressed(KeyEvent evt)
	{
		int key = evt.getKeyCode();
		if(key == 37 && paddlex > -100)
		{
			paddlex -= 50;
			repaint();
		}
		if(key == 39 && paddlex < 700)
		{
			paddlex += 50;
			repaint();
		}
	}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
	/*try 
	{
		Thread.sleep(2500);
	} 
    catch(InterruptedException ex) 
	{
		Thread.currentThread().interrupt();
	}*/
}