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
import java.awt.event.MouseMotionListener;


public class Screen extends JPanel implements ActionListener, MouseListener, KeyListener, MouseMotionListener
{
    ArrayList<Dot> list;
	private BufferedImage bufferedImage;

    double theta = .05;
    int xD = 20;
    int yD = 0;
	public Screen()
	{
        list = new ArrayList<Dot>();
        setLayout(null);
		addMouseListener(this);
		addKeyListener(this);
        addMouseMotionListener(this);
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
		gbuffered.setColor(Color.white);
		gbuffered.fillRect(0, 0, 800, 600);
		
        for(Dot each : list) {
            each.drawMe(gbuffered);
        }
		g.drawImage(bufferedImage, 0, 0, null);
	}
    public void move() {
        for(int i = list.size()-1; i > 0; i--) {
            list.get(i).setXY(list.get(i-1).getX(),list.get(i-1).getY());
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
    public void actionPerformed(ActionEvent e) {

    }
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void keyPressed(KeyEvent evt)
	{
		int key = evt.getKeyCode();
        System.out.print(key+" ");
        if(key == 38) {
            yD = -20;
            xD = 0;
        }
        if(key == 40) {
            yD = 20;
            xD = 0;
        }
        if(key == 37) {
            yD = 0;
            xD = -20;
        }
        if(key == 39) {
            yD = 0;
            xD = 20;
        }
	}
    public void moveIfNoMove() {
        if(list.size() > 0) {
            list.get(0).setXY((int)(Math.cos(theta)*100+400),(int)(Math.sin(theta)*100)+300);
            //System.out.print(list.get(0).getX()+" ");
           //System.out.print(list.get(0).getY()+" ");
        }

        theta += .1;
    }
    public void mouseMoved(MouseEvent e) {
        //if(list.size() < 63)
            list.add(new Dot());
        list.get(0).setXY(e.getX()-5,e.getY()-5);
        repaint();
    }
    public void mouseDragged(MouseEvent e) {}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
}

