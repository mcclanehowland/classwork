import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.image.BufferedImage;


 
 public class Test2 extends JPanel implements MouseListener, KeyListener, MouseMotionListener {

    private BufferedImage bufferedImage;
    int x = 350;
    int y = 250;
    int xspeed = 1;
    int yspeed = 1;

    public Test2() {
        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);
    }
    public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(bufferedImage==null)
        bufferedImage = (BufferedImage)(createImage(getWidth(),getHeight()));
        Graphics gBuffered = bufferedImage.createGraphics();
        gBuffered.setColor(Color.black);
        gBuffered.fillRect(0,0,800,600);
        drawSomething(gBuffered);
        g.drawImage(bufferedImage,0,0,null);

    }
    public void drawSomething(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(x,y,100,100);
    }
   
    public void animate() {
        while(true) {
            sleep(10);
            
            x += xspeed;
            y += yspeed;
            if(x >= 700 || x <= 0)
                xspeed *= -1;
            if(y >= 500 || y <= 0)
                yspeed *= -1;

                           

            repaint();


        }
    }
    public void sleep(int time) {
        try {
            Thread.sleep(time);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
    }
    public void keyPressed(KeyEvent evt) {

        int key = evt.getKeyCode();

        System.out.println("key pressed: "+key);
       
    }
    public void mouseReleased(MouseEvent e) {
        
    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {

    }
    public void mouseClicked(MouseEvent e) {

    }
    public void keyReleased(KeyEvent evt) {

    }
    public void keyTyped(KeyEvent evt) {

    }
    public void mouseMoved(MouseEvent e) {

       // System.out.println("mouse moved");
       x = e.getX();
       y = e.getY();
    }
    public void mouseDragged(MouseEvent e) {

    }

    
 }
