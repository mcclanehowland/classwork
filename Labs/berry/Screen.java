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
import java.util.ArrayList;


public class Screen extends JPanel implements ActionListener, KeyListener {

	private BufferedImage bufferedImage;
    private boolean game = true;
    Font myFont = new Font("Serif", Font.BOLD, 12);
    Gatherer g1; //berry gatherers
    Gatherer g2;
    JButton newGame;
    
    private ArrayList<Berry> berries;

	public Screen() {
        setLayout(null);
        setFocusable(true);
		addKeyListener(this);
        berries = new ArrayList<Berry>();
        int size = (int)(Math.random()*5+10);
        while(berries.size() < size){
            berries.add(new Berry());
        }
        g1 = new Gatherer(50,250);
        g2 = new Gatherer(700,250);
        newGame = new JButton("New Game");
        newGame.setBounds(600,0,200,30);
        add(newGame);
        newGame.addActionListener(this);
	}
    public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //display game information
        g.setColor(Color.black);
        g.setFont(myFont);
        g.drawString("Player 1: ",10,20);

        //background
        //g.setColor(Color.green);
        //g.fillRect(100,100,600,400);
        //draw berries
	    for(Berry each : berries) {
            each.drawMe(g);
        }
        //draw gatherers
        g1.drawMe(g);
        g2.drawMe(g);
        
	}
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newGame) {
            GameManager.reset();
            berries.clear();
            int size = (int)(Math.random()*5+10);
            while(berries.size() < size){
                berries.add(new Berry());
            }
            g1.setX(50);
            g1.setY(250); 
            g2.setX(700);
            g2.setY(250);
            
            game = true;
            System.out.println(GameManager.berriesLeft());
        }
        repaint();
    }
	public void keyPressed(KeyEvent evt) {
		int key = evt.getKeyCode();
        System.out.println(key);
            if(key == 38) { //player 2 moves
                g2.move(0,-1*g2.getHeight()); //0 left, 1 up
            }
            else if(key == 40) {
                g2.move(0,g2.getHeight()); // down 1
            }
            else if(key == 37) {
                g2.move(-1*g2.getWidth(),0); //left 1
            }
            else if( key == 39) {
                g2.move(g2.getWidth(),0);
            }
            else if(key == 87) { //player 1 moves
                g1.move(0,-1*g1.getHeight());
            }
            else if(key == 83) {
                g1.move(0,g1.getHeight());
            }
            else if(key == 65) {
                g1.move(-1*g1.getWidth(),0);
            }
            else if(key == 68) {
                g1.move(g1.getWidth(),0);
            }
            //check berry collisions
            for(Berry each : berries) {
                if(g1.checkCollision(each)) {
                    GameManager.player1Count++;
                }
                if(g2.checkCollision(each)) {
                    GameManager.player2Count++;
                }
            }
            if(GameManager.berriesLeft() == 0) {
            }
        
        repaint();
        System.out.println("fuck");


	}
	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
}

