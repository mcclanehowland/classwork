import java.awt.Graphics;
import java.awt.Color;

public class Dot {
    int x = -50;
    int y = -50;
    Color random;
    public Dot() {
        int r = (int)(Math.random()*250);
        int G = (int)(Math.random()*250);
        int b = (int)(Math.random()*250);
        random = new Color(r,G,b);
    }
    public void drawMe(Graphics g) {
        g.setColor(random);
        g.fillOval(x,y,10,10);
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

}
