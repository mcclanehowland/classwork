import java.awt.Graphics;
import java.awt.Color;

public class Gatherer {

    private int x;
    private int y;
    private int height = 50;
    private int width = 50;
    private Color color;
    public Gatherer(int x, int y) {
        this.x = x;
        this.y = y;
        color = new Color((int)(Math.random()*200+50),(int)(Math.random()*200+50),(int)(Math.random()*200+50));
    }
    public void move(int mx, int my) {
        if((mx < 0 && x >= 50) || (mx > 0 && x <= 700)) {
            x += mx;
        }
        if((my > 0 && y <= 500) || (my < 0 && y >= 50)) { 
            y += my;
        }
    }
    public void drawMe(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        g.fillRect(x+width/5,y+height/5,(3*width)/5,(3*height)/5);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return x;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public boolean checkCollision(Berry berry) {
        int berryX = berry.getX();
        int berryY = berry.getY();
        int berryWidth = berry.getWidth();
        int berryHeight = berry.getHeight();
        
        //Check the x positions for collision 
        if( x+width >= berryX && x <= berryX + berryWidth && berry.getVisible() == true) {
            //Check the y positions for collision 
            if( y + height >= berryY && y <= berryY + berryHeight ) {
                berry.setVisible(false);
                return true;
            }
        }
        return false;
    }
}
