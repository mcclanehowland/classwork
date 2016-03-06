import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.Random;


public class Game extends JPanel implements MouseListener, KeyListener
{
	
	private BufferedImage bufferedImage;
	int dots = 10;
	int increase = 20;
	int dotNum = dots;
	int mx,my;
	int appleNum = 1;
	int apples = appleNum;
	int i;
	int ax,ay;
	int interval = 20;
	
	//int spawn = 0;
	int delay = 50;
	Random r = new Random();
	
 	int[] x = new int[999];
	int[] y = new int[999];
	boolean left = false;
	boolean right = true;
	boolean down  = false;
	boolean up = false;
	boolean user = true;
	public Game()
	{
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
		snakePoints();
		newApple();
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
		gbuffered.setColor(Color.black);
		gbuffered.fillRect(0, 0, 800, 600);
		
		if(user)
		{
			
			drawSnake(gbuffered);
			
			gbuffered.setColor(Color.red);
			
			drawApple(gbuffered);
		}
		if(user == false)
		{
			gbuffered.setColor(Color.red);
			gbuffered.drawString("you lost",350,350);
			gbuffered.setColor(Color.green);
			gbuffered.fillRect(350,400,200,200);
			checkMenu();
		}
		g.drawImage(bufferedImage, 0, 0, null);
		
	}
	public void checkMenu()
	{
		if(mx >= 350 && mx <= 550 && my >= 400 && my <= 600)
		{
			user = true;
			reset();
		}
		repaint();
	}
	public void reset()
	{
		x[0] = 300;
		y[0] = 300;
		mx = 0;
		my = 0;
		apples = appleNum;
		dotNum = dots;
		snakePoints();
		newApple();
		
		up = false;
		down = false;
		left = false;
		right = true;
		repaint();
	}
	public void drawApple(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(ax,ay,10,10);
	}
	public void newApple()
	{
		ax = (r.nextInt(30)+1) * 20;
		ay = (r.nextInt(28)+1) * 20;
	}
	public void snakePoints()
	{
		for(int i = dotNum;i<999;i++)
		{
			x[i] = -500;
			y[i] = -500;
		}
		for(int i = 0;i < dotNum;i++)
		{
			x[i] = 300-i*interval;
			y[i] = 300;
		}
	}
	public void drawSnake(Graphics g)
	{
		for(int i = 0;i < dotNum;i++)
		{
			g.setColor(Color.green);
			g.fillRect(x[i],y[i],10,10);
			if(i > 0)
			{
				g.setColor(Color.blue);
				g.drawLine(x[i]+5,y[i]+5,x[i-1]+5,y[i-1]+5);
			}
		}
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
	public void checkCollision()
	{
		for(int i = dotNum;i > 0;i--)
		{
		
			if(x[0] == x[i] && y[0] == y[i])
			{
				user = false;
			}
			if(x[0] <= -10 || x[0] >= 810 || y[0] <= -10 || y[0] >= 610)
			{
				user = false;
			}
			
				
		}
		if(x[0] == ax && y[0] == ay)
		{
			dotNum += increase;
			newApple();
		}
				
		repaint();
	}
	
	public void move()
	{
		
		for(int i = dotNum;i > 0;i--)
		{
			
			x[i] = x[i-1];
			y[i] = y[i-1];
			
		}
		if(left)
		{
			x[0] -= interval;
		}
		if(right)
		{
			x[0] += interval;
		}
		if(down)
		{
			y[0] += interval;
		}
		if(up)
		{
			y[0] -= interval;
		}
		repaint();
		
	}
	public void mousePressed(MouseEvent e)
	{
		mx = e.getX();
		my = e.getY();
	}
	public void keyPressed(KeyEvent evt)
	{
		int key = evt.getKeyCode();
		
		if(key == 39 && !left)
		{
			right = true;
			
			up = false;
			down = false;
		}
		if(key == 37 && !right)
		{
			left = true;
			
			up = false;
			down = false;
		}
		if(key == 40 && !up)
		{
			right = false;
			left = false;
			
			down = true;
		}
		if(key == 38 && !down)
		{
			right = false;
			left = false;
			up = true;
			
		}
		
		repaint();
	}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
	
}