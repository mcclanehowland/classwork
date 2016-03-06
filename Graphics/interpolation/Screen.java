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

public class Screen extends JPanel implements ActionListener, MouseListener, KeyListener, MouseMotionListener {

    private BufferedImage bufferedImage;
    private int x;
    private int y; 
    private int width = 50;
    private int height = 50;
    private int mouseX = 500;
    private int mouseY = 0;
    private int originalX;
    private int originalY = 1000;
    private Color color;
    private int i;

    public Screen() {
        color = new Color((int)(interpolate(0,100,100,50)),(int)(interpolate(0,50,50,25)),(int)(interpolate(0,150,150,100)));
        setLayout(null);
        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);
        setFocusable(true);

    }
    public Dimension getPreferredSize() {
        return new Dimension(1000,900);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(bufferedImage == null)
           bufferedImage = (BufferedImage)(createImage(getWidth(),getHeight())); 
        Graphics gBuff = bufferedImage.createGraphics();
        gBuff.setColor(Color.white);
        gBuff.fillRect(0,0,1000,900);
        for(int i = 50; i < 250;i += 10) {
            color = new Color((int)(interpolate(0,250,250,i)),50,200);
            gBuff.setColor(color);
            gBuff.fillRect(i,i+50,10,10);
        }
        for(int i = 0; i < 240;i++) {
            color = new Color((int)(interpolate(0,250,250,i)),0,(int)(interpolate(0,250,250,i)));
            gBuff.setColor(color);
            gBuff.drawRect(i,i,200,200);
        }
        gBuff.setColor(new Color((int)(interpolate(0,250,250,30)),(int)(interpolate(0,250,250,100)),(int)(interpolate(0,250,250,200))));
        gBuff.fillRect(100,600,200,200);
        gBuff.fillOval(x,y,width,height);
        g.drawImage(bufferedImage,0,0,null);

    }
    public void move() {
            if(x > 1000+width || y > 1000+height || y < 0-height || x < 0-width) {
                i = 0;
            }
            i += 2;
            x = (int)(interpolate(-1*width,mouseX,100,i));
            y = (int)(interpolate(900+width,mouseY,100,i));
            repaint();
            
    }
    public void sleep(int time) {
		try 
		{
			Thread.sleep(time);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
	}
    public double[] interpolateX(double start, double end, int count) {
        double[] array = new double[count+1];
        if(count > 2) {
            for(int i  = 0; i < count;i++) {
                array[i] = start + i * (end - start) / count;
            }
        }
        return array;
    }
    public double[] interpolateY(double start, double end, int count) {
        double[] array = new double[count+1];
        if(count > 2) {
            for(int i = 0; i < count; i++) {
                array[i] = start + i * (end - start) / count;
            }
        }
        return array;
    }
    public double interpolate(double start, double end, int count, int i) {
        return start + i * (end-start) / count;
    }
    public void actionPerformed(ActionEvent e) {}
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX()-width/2;
        mouseY = e.getY()-height/2;
        originalX = 0;
        originalY = 1000;
        x = 0;
        y = 1000;
        repaint();
        i = 0;
    }
	public void keyPressed(KeyEvent evt) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
}
