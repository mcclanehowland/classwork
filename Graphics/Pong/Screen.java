import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.Random;

public class Screen extends JPanel implements MouseListener, KeyListener
{
	int paddley;
	Random r = new Random();
	int ballx = 350;
	int bally = r.nextInt(9)*50;
	boolean user = true;
	int ballSpeedx = 5;
	int ballSpeedy = 5;
	int mousex,mousey;
	int score;
	boolean up = false;
	boolean down = false;
	
	
	
	private BufferedImage bufferedImage;
	
    public Dimension getPreferredSize()
    {
        return new Dimension(800,600);
    }
	public void setY()
	{
		bally = r.nextInt(9) * 50;
	}
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		
		if(bufferedImage==null) //weird stuff
		
		 bufferedImage = (BufferedImage)(createImage(getWidth(),getHeight())); 
		Graphics gbuffered = bufferedImage.createGraphics(); 
		gbuffered.setColor(Color.WHITE);
		gbuffered.fillRect(0, 0, 800, 600);
		
		if(user == true) 
		{
			gbuffered.setColor(Color.green);
			gbuffered.fillRect(0,paddley,50,100);
		
			gbuffered.setColor(Color.red);
			gbuffered.fillOval(ballx,bally,20,20);
		}
		if(user == false)
		{
			mousex = 0;
			mousey = 0;
			gbuffered.setColor(Color.black);
			gbuffered.drawString("you lose",350,350);
			gbuffered.drawString("Try again?",350,375);
			gbuffered.drawString("yes",325,450);
			gbuffered.drawString("no",375,450);
			gbuffered.setColor(Color.green);
			gbuffered.fillRect(300,400,100,100);
			gbuffered.setColor(Color.red);
			gbuffered.fillRect(400,400,100,100);
			gbuffered.setColor(Color.black);
			gbuffered.drawString("yes",325,450);
			gbuffered.drawString("no",425,450);
			
			
		
			checkSelection();
			score = 0;
			
		}
		gbuffered.drawString("Score: "+score,350,200);
		g.drawImage(bufferedImage, 0, 0, null);
		
	}
	public boolean getUser()
	{
		return user;
	}
	public void animate()
	{
		while(user)
		{
			ballx += ballSpeedx;
			bally += ballSpeedy;
			sleep(10);
			repaint();
			if(down)
				move("down");
			if(up)
				move("up");
			checkCollision();
		}
	}
	public void checkSelection()
	{
		System.out.print("check");
		if(mousex <= 400 && mousex >= 300 && mousey >= 400 && mousey <= 500)
		{
			user = true;
			ballx = 350;
			setY();
			ballSpeedx = 5;
			repaint();
			mousex = 0;
			mousey = 0;
			
		}
	}
	public void checkCollision()
	{
		if(bally <= paddley + 100 && bally >= paddley)
		{
			if(ballx <= 50)
			{
				ballSpeedx *= -1;
				repaint();
				score++;
			}
		}
		if(ballx >= 800)
		{
			ballSpeedx *= -1;
			repaint();
		}
		if(bally > 580 || bally < 20)
		{
			ballSpeedy *= -1;
			repaint();
		}
		if(ballx < 20)
		{
			user = false;
			repaint();
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
	public void move(String direction)
	{
		if(direction.equals("down") && paddley <= 560)
		{
			paddley += 5;
			repaint();
		}
		else if(direction.equals("up") && paddley >= 0)
		{
			paddley -= 5;
			repaint();
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
		
		if(key == 37)
		{
			
		}
		if(key == 39)
		{
			
			
		}
		if(key == 38)
		{
			up = true;
		}
		if(key == 40)
		{
			down = true;
		}
	}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}	
	public void keyReleased(KeyEvent evt)
	{
		int key = evt.getKeyCode();
		if(key == 38)
			up = false;
		if(key == 40)
			down = false;
	}
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