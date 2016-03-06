import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class Dot {
    private int x,y;
    private int xSpeed = (int)(Math.random()*8+1);
    private int defaultXSpeed = xSpeed;
    private int ySpeed = (int)(Math.random()*8+1);
    private int defaultYSpeed = ySpeed;
    private Color color = new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250));
    ArrayList<Integer> xTrail;
    ArrayList<Integer> yTrail;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
        xTrail = new ArrayList<Integer>();
        yTrail = new ArrayList<Integer>();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void drawMe(Graphics g) {
        g.setColor(color);
        for(int i = 0; i < xTrail.size()-1; i++) {
            g.drawRect(xTrail.get(i)+5,yTrail.get(i)+5,1,1);
        }
        g.fillOval(x,y,10,10);

    }
    public void resetSpeed() {
        xSpeed = defaultXSpeed;
        ySpeed = defaultYSpeed;
    }
    public void move() {
        if(xTrail.size() > 60) {
            xTrail.remove(0);
            yTrail.remove(0);
        }
        xTrail.add(x);
        yTrail.add(y);
        x += xSpeed;
        y += ySpeed;
    }
    public void changeX() {
        xSpeed *= -1;
    }
    public void changeY() {
        ySpeed *= -1;
    }
    public int getXSpeed() {
        return xSpeed;
    }
    public int getYSpeed() {
        return ySpeed;
    }
    public void setXSpeed(int speed) {
        xSpeed = speed;
    }
    public void setYSpeed(int speed) {
        ySpeed = speed;
    }
}

