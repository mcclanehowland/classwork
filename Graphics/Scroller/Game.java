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
	int x,y;
	
	int xspeed = 2;
	int yspeed = 2;
	int obstacleNum = 100;
	int cx = 340;
	int cy = 340;
	int[] ox = new int[obstacleNum];
	int[] oy = new int[obstacleNum];
	int[] numx = new int[obstacleNum];
	int[] numy = new int[obstacleNum];
	Random r = new Random();
	private BufferedImage bufferedImage;
	public Game()
	{
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
		for(int i = 0; i < obstacleNum; i++)
		{
			numx[i] = r.nextInt(40)*20;
			numy[i] = r.nextInt(30)*20;
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
		gbuffered.setColor(Color.black);
		gbuffered.fillRect(0, 0, 800, 600);
		
		drawBackground(gbuffered);
		
		drawCharacter(gbuffered);
		
		gbuffered.setColor(Color.red);
		
		
		g.drawImage(bufferedImage, 0, 0, null);

	}
	public void Obstacle()
	{
		for(int i = 0; i < obstacleNum; i++)
		{
			ox[i] = x + numx[i];
			oy[i] = y + numy[i];
		}	
	}
	public void drawBackground(Graphics g)
	{
		g.setColor(Color.green);
		g.fill3DRect(x,y,800,600,true);
		g.setColor(Color.black);
		Obstacle();
		for(int i = 0; i < obstacleNum; i++)
			g.fillRect(ox[i],oy[i],40,40); sleep(10);
	}
	public void drawCharacter(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(cx,cy,40,40);
	}
	
	public void sleep(int time)
	{
		try {Thread.sleep(time);} 
		catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	}
	public void moveLeft()
	{
		boolean collision = false;
		for(int i = 0; i < obstacleNum; i++)
			if(ox[i] == cx - 40 && (oy[i] == cy || oy[i] == cy + 20 || oy[i] == cy - 20))
				collision = true;
		if(x < cx && collision == false)
			x += 20;
	}
	public void moveRight()
	{
		boolean collision = false;
		for(int i = 0; i < obstacleNum; i++)
			if(ox[i] == cx + 40 && (oy[i] == cy || oy[i] == cy + 20 || oy[i] == cy - 20))
				collision = true;
		if(x > -420 && collision == false)
			x -= 20;
		
	}
	public void moveUp()
	{
		boolean collision = false;
		for(int i = 0; i < obstacleNum; i++)
			if(oy[i] == cy - 40 && (ox[i] == cx || ox[i] == cx + 20 || ox[i] == cx - 20))
				collision = true;
		if(y < cy && collision == false)
			y += 20;
	}
	public void moveDown()
	{
		boolean collision = false;
		for(int i = 0; i < obstacleNum; i++)
			if(oy[i] == cy + 40 && (ox[i] == cx || ox[i] == cx + 20 || ox[i] == cx - 20))
				collision = true;
		if(y > -220 && collision == false)
			y -= 20;
	}
	public void mousePressed(MouseEvent e){}
	public void keyPressed(KeyEvent evt)
	{
		int key = evt.getKeyCode();
		//System.out.println(key);
		if(key == 37) // move left
			moveLeft();
		if(key == 39) // move right
			moveRight();
		if(key == 38) //move up
			moveUp();
		if(key == 40) //move down
			moveDown();
		repaint();
	}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
}