import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.JTextField;
import java.util.Random;

public class Screen extends JPanel implements MouseListener, KeyListener
{
	private BufferedImage bufferedImage;
	
	boolean laserFired = false;
	boolean user = true;
	boolean collision = false;
	boolean state = true;
	boolean menu = true;
	int lasery = 0;
	int laserx = -10;
	int spacex = 350;
	int spacey = 725;
	int score = 0;
	int targetSpeed = 5;
	int mousex, mousey;
	String selection = "";
	
	Random r = new Random();
	int targetx = 0;
	int targety = 0;
	Color orange = new Color(250,157,18);
	
	
	
	public Screen()
	{
	}
    public Dimension getPreferredSize()
    {
        return new Dimension(800,900);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		
		if(bufferedImage==null)
        bufferedImage = (BufferedImage)(createImage(getWidth(),getHeight())); 
		Graphics gbuffered = bufferedImage.createGraphics();
		gbuffered.setColor(Color.WHITE);
		gbuffered.fillRect(0, 0, 800, 900);
		
		
		
		
		
		
		
		laser(gbuffered);
		drawSpaceship(gbuffered);
		drawTarget(gbuffered);
		checkCollision();
		checkTarget(gbuffered);
		
		drawExplosion(gbuffered);
		
		gbuffered.drawString("Score: "+score, 350, 200);
		
		
		
		g.drawImage(bufferedImage, 0, 0, null);
	}
	public void drawExplosion(Graphics gbuffered)
	{
		if(collision == true && laserFired == true)
		{
			
			sleep(100);
			targetx = (r.nextInt(9)+1)*50;
			collision = false;
			
			targety = 0;
			targetSpeed += 5;
			
			
		}
		
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
	public void move(String direction)
	{
		if(direction.equals("right"))
		{
			spacex += 75;
		}
		if(direction.equals("left"))
		{
			spacex -= 75;
		}
		repaint();
	}
	public void drawSpaceship(Graphics gbuffered)
	{
		if(state == true)
		{
			gbuffered.setColor(Color.green);
			gbuffered.fillRect(spacex,spacey,50,200);
			gbuffered.setColor(Color.black);
			gbuffered.fillRect(spacex-25,spacey+100,50,100);
			gbuffered.fillRect(spacex+25,spacey+100,50,100);
			gbuffered.setColor(Color.red);
			gbuffered.fillRect(spacex-50,spacey+150,50,50);
			gbuffered.fillRect(spacex+50,spacey+150,50,50);
			gbuffered.fillRect(spacex-60,spacey+120,20,80);
			gbuffered.fillRect(spacex+90,spacey+120,20,80);
		}
		if(state == false)
		{
			gbuffered.setColor(Color.orange);
			gbuffered.fillOval(spacex,spacey,100,100);
		}
	}
	
	public void checkCollision()
	{
		if(laserx >= targetx && laserx <= targetx + 150)
		{
			if(lasery == targety + 50 || lasery == targety + 45 || lasery == targety + 40 || lasery == targety + 35 || lasery == targety + 30 || lasery == targety + 25 || lasery == targety + 20 || lasery == targety + 15 || lasery == targety + 10 || lasery == targety + 5)
			{
			collision = true;
			
			score++;
			}
		}
	}
	public void checkTarget(Graphics gbuffered)
	{
		if(targety >= 725)
		{
			user = false;
			state = false;
			
		}
	}
	public void laser(Graphics gbuffered)
	{
		gbuffered.setColor(Color.green);
		gbuffered.fillRect(laserx, lasery,10,30);
	}
	public void drawTarget(Graphics gbuffered)
	{
		
			gbuffered.setColor(Color.blue);
			gbuffered.fillRect(targetx, targety, 150,50);
			repaint();
	
			
		
	}
	public void animate()
	{
		while(user == true)
		{

		targety += targetSpeed;
		sleep(100);
		repaint();
		if(laserFired == true)
		{
			lasery = 800;
			laserx = spacex + 20;
		for(int i=0; i < 200; i++)
        {
            //wait for .1 second
            sleep(1);
            
            //increment x
            lasery -= 5;
			
             
            //repaint the graphics drawn
            repaint();
        }
		
		laserFired = false;
		
		}
		}	
	}
	public void mousePressed(MouseEvent e)
	{
		mousex = e.getX();
		mousey = e.getY();
	}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void keyPressed(KeyEvent evt)
	{
		int key = evt.getKeyCode();
		
		if(key == 39 && spacex+50 < 800)
		{
			
			move("right");
			repaint();
		}
		if(key == 37 && spacex-25 > 0)
		{
			
			move("left");
			repaint();
			
			
		}
		if(key == 32)
		{
			laserFired = true;
			repaint();
		}
		
		
	}
	public boolean getFired()
	{
		return laserFired;
	}
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