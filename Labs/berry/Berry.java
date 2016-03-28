import java.awt.Graphics;
import java.awt.Color;

public class Berry {
    private int x;
    private int y;
    private int width = 10;
    private int height = 10;
    private boolean visible;
    public Berry() {
        x = (int)(Math.random()*590+110);
        y = (int)(Math.random()*390+110);
        visible = true;
        GameManager.berryCount++;
    }   
    public void drawMe(Graphics g) {
        if(visible) {
            g.setColor(Color.red);
            g.fillRect(x,y,width,height);
        }
    }
    public boolean getVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}


