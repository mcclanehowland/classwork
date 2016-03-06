import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Screen extends JPanel implements ActionListener, MouseListener, KeyListener
{

    private boolean run = true;
    private int mX = 400;
    private int mY = 300;

	private BufferedImage bufferedImage;
    ArrayList<Dot> dots;
	public Screen()
	{
        dots = new ArrayList<Dot>();
        while(dots.size() < 100) {
            dots.add(new Dot((int)(Math.random()*800),(int)(Math.random()*600)));
        }

        setLayout(null);
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
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
		Graphics gBuffered = bufferedImage.createGraphics(); 
		gBuffered.setColor(Color.black);
		gBuffered.fillRect(0, 0, 800, 600);
        g.setColor(Color.white);
        for(Dot each : dots) {
            each.drawMe(gBuffered);
        }

		g.drawImage(bufferedImage, 0, 0, null);
		
		
		
	}
    public void animate() {
        while(run) {
            sleep(10);
            for(Dot each : dots) {
                each.move();
                if(each.getX() >= 800 || each.getX() <= 0) {
                    each.changeX();
                }
                if(each.getY() >= 600 || each.getY() <= 0) {
                    each.changeY();
                }
                double distance = Math.hypot(each.getX()-mX,each.getY()-mY);
                /* if(distance <= 50) {
                    each.setXY((int)(Math.random()*800+1),(int)(Math.random()*600+1));
                }*/
            }
        
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
    public void actionPerformed(ActionEvent e) {

    }
	public void mousePressed(MouseEvent e)
	{
        mX = e.getX();
        mY = e.getY();
	}
	public void keyPressed(KeyEvent evt)
	{
		int key = evt.getKeyCode();
	}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
}
