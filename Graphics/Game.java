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

	private BufferedImage bufferedImage;
	public Screen()
	{
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
		Graphics gbuffered = bufferedImage.createGraphics(); 
		gbuffered.setColor(Color.WHITE);
		gbuffered.fillRect(0, 0, 800, 600);
		
		 
		gbuffered.setColor(Color.green);
		gbuffered.fillRect(x,y,100,200);
		g.drawImage(bufferedImage, 0, 0, null);
		
		
		
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

