import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

 
 
public class Screen extends JPanel implements KeyListener
{
 
    BufferedImage buffered;
    Projectile p1;
	boolean up, down;
    Ship s1;
	
	ArrayList <Projectile> bullets = new ArrayList();
	
	Sound sound;
	int sx, sy;
	Enemy[] e1 = new Enemy[3];
	Enemy[] e2 = new Enemy[20];
 	Object[] o = new Object[1000];
	Banana[] bananas = new Banana[100];
	
	int lives = 3;
	
	
	int level = 1;
     
    public Screen()
    {
        sound = new Sound();
        s1 = new Ship(50,300);
        p1 = new Projectile(50,300);

		
		for(int i = 0; i < o.length;i++)
		{
			o[i] = new Object();
		}
		for(int i = 0; i < e1.length;i++)
		{
			e1[i] = new Enemy(1);
		}
		for(int i = 0; i < e2.length;i++)
		{
			e2[i] = new Enemy(2);
		}
		int j = 0;
		int k = 0;
		for(int i = 0; i < bananas.length;i++)
		{
			bananas[i] = new Banana();
				
		}
        //sets keylistener
        setFocusable(true);
        addKeyListener(this);
    }
 
    public Dimension getPreferredSize() 
    {
        //Sets the size of the panel
            return new Dimension(800,600);
    }
     
    public void paintComponent(Graphics g) 
    {
            super.paintComponent(g);
     
        //Create Buffered
        if( buffered == null )
        {
            buffered = (BufferedImage)(createImage( getWidth(), getHeight() ) );
        }
         
        //Create a temporary graphics buffered to draw
        Graphics gBuff = buffered.createGraphics();
     
        //Clear everything
        //This draws the white box
        gBuff.setColor(Color.white);
        gBuff.fillRect(0, 0, 800, 600);
		gBuff.setColor(Color.black);
        gBuff.drawString("Lives: "+lives,350,100);
		gBuff.drawString("Level: "+level,350,120);
     
		
		for(Object each : o)
		{
			each.drawMe(gBuff);//background
		}
		if(level == 1)//level 1
		{
			for(Enemy each : e1)
			{
				each.drawMe(gBuff);
				if(lives <= 0)
				{
					each.reset();
					each.setVisible(true);
					lives = 3;	
				}
				
			}
			int sum = 0;
			for(Enemy each : e1)
			{
				sum += each.getX();
				if(sum%(e1.length*900) == 0)
				{
					
					level++;
					for(Enemy each1 : e2)
					{
						each1.reset();
						each1.setVisible(true);
					}
				}
			}
		
			
			
		}
		if(level == 2)
		{
			
			
			for(Enemy each : e2)
			{
				each.drawMe(gBuff);
			}
			int sum = 0;
			for(Enemy each : e2)
			{
				sum += each.getX();
				if(sum%(e2.length*900) == 0 && lives > 0)
				{
					//System.out.println("you won, or at least you should have");
					sound.playSound4();
					level++;
				}
			}
			if(lives  <= 0)
			{
				level--;
				for(Enemy each : e1)
				{
					each.reset();
					each.setVisible(true);
				}
			}
				
		}
		if(level >= 3)
		{
			for(int i = 0; i < 800;i += 30)
			{
				for(int j = 0; j < 600;j  += 30)
				{
					gBuff.setColor(Color.yellow);
					gBuff.drawString("YOU WIN",i,j);
				}
			}
			for(Banana each : bananas)
			{
				each.drawMe(gBuff);
			}
			
		}
		
        
			
		if(lives > 0)
			s1.drawMe(gBuff);
		if(lives <= 0)
		{
			gBuff.setColor(Color.orange);
			s1.drawMe(gBuff);
		}
			
        //Draw Projectile
		
			
		
        p1.drawMe(gBuff);
 
        
        //draw the buffered image
        g.drawImage(buffered, 0, 0, null);
 
    } 
	public void sleep(int time)
	{
		try {
                Thread.sleep(time);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
	}
	public void collision()
	{
		for(Enemy each : e1)
		{
			if(each.getX() <= s1.getX()+50 && each.getX() >= s1.getX() && each.getY() <= s1.getY()+50 && each.getY() >= s1.getY())
			{
				//System.out.println("ship hit");
				lives--;
				sound.playSound2();
				s1.setY(300);
				for(Enemy each1 : e1)
				{
					if(each1.getVisible() == true)
					{
						each1.reset();
						each1.setVisible(true);
					}
				}
				
			}
			if(each.getX() <= 0)
			{
				lives--;
				sound.playSound5();
				each.setVisible(false);
				each.setX(900);
				each.setY(-50);
			}
			if(p1.getX() >= each.getX() && p1.getX() <= each.getX()+50 && p1.getY() >= each.getY() && p1.getY() <= each.getY()+80)
			{
				sound.playSound3();
				each.setVisible(false);
				each.setX(900);
				each.setY(-50);
				
			}
		}
		for(Enemy each : e2)
		{
			if(each.getX() <= 0)
			{
				lives--;
				sound.playSound5();
				each.setVisible(false);
				each.setX(900);
				each.setY(-50);
			}
			if(p1.getX() >= each.getX() && p1.getX() <= each.getX()+50 && p1.getY() >= each.getY() && p1.getY() <= each.getY()+80)
			{
				sound.playSound3();
				each.setVisible(false);
				each.setX(900);
				each.setY(-50);
				
			}
			if(each.getX() <= s1.getX()+50 && each.getX() >= s1.getX() && each.getY() <= s1.getY()+50 && each.getY() >= s1.getY())
			{
				//System.out.println("ship hit");
				lives--;
				sound.playSound2();
				s1.setY(300);
				for(Enemy each1 : e2)
				{
					if(each1.getVisible() == true)
					{
						each1.reset();
						each1.setVisible(true);
					}
				}
				if(lives <= 0)
				{
					for(Enemy each2 : e1)
					{
						each2.reset();
						each2.setVisible(true);
					}
				}
			}
		}
		repaint();
	}
    public void animate()
    {
         
        while(true)
        {
            //wait for .01 second

			sleep(10);
			p1.moveRight();
			if(down == true)
				s1.moveDown();
			if(up == true)
				s1.moveUp();
			for(Object each : o)
			{
				each.move();
			}
			if(level == 1)
			{
				for(Enemy each : e1)
				{
					each.move();
				}
			}
			if(level == 2)
			{
				for(Enemy each : e2)
				{
					each.move();
				}	
			}
			
			collision();
            //repaint the graphics drawn
            repaint();
        }
 
    }
     
    //implement methods of the KeyListener
    public void keyPressed(KeyEvent e) {
 
 
        //key code
        //http://www.cambiaresearch.com/articles/15/javascript-char-codes-key-codes
        int key = e.getKeyCode();
		//System.out.println(key);
        if (key == 38)//Up Arrow
        {
            up = true; 
			down = false;
        }
        else if (key == 40)//Down Arrow
        {
            down = true;
			up = false;
        }
		
        if(key == 32 && p1.getVisible() == false)//spacebar
		{
			p1.setVisible(true);
			p1.setY(s1.getY()+20);
			p1.setX(s1.getX());
			sound.playSound();
			bullets.add(new Projectile(s1.getX(),s1.getY()));
		}
		else if(key == 75)
		{
			level++;
			for(Enemy each : e2)
			{
				each.reset();
				each.setVisible(true);
			}
		}
        repaint();
 
    }
 
    public void keyReleased(KeyEvent e) 
	{
		int key = e.getKeyCode();
		if(key == 38)
			up = false;
		if(key == 40)
			down = false;
	}
    public void keyTyped(KeyEvent e) {}
}