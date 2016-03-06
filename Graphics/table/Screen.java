import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class Screen extends JPanel implements ActionListener, MouseListener {
    Game game;
    private boolean player = true;
    private boolean player1Win = false;
    private boolean player2Win = false;
    private boolean tie = false;
    private boolean playing = true;
    private int size = 300;
    private int offSetLeft = 10;
    private int offSetTop = 10;
    JButton newGame;

	public Screen() {
        setLayout(null);
		addMouseListener(this);
        game = new Game();
        newGame = new JButton("New Game");
        newGame.setBounds(500,100,200,30);
        add(newGame);
        newGame.addActionListener(this);
	}
    public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawRect(0,0,800,600);
        g.setColor(Color.black);
        if(player) {

            g.drawString("player 1 turn",10+offSetLeft+size,10+size);
        }
        else {
            g.drawString("player 2 turn",10+offSetLeft+size,10+size);
        }
        if(player1Win) {
            g.drawString("player 1 wins",10+offSetLeft+size,50+size);
        }
        if(player2Win) {
            g.drawString("player 2 wins",10+offSetLeft+size,50+size);
        }
        if(tie) {
            g.drawString("tie",10+offSetLeft+size,50+size);
        }
        game.tableTest(g,size,offSetLeft,offSetTop);
	}
    public void reset() {
        game.reset();
        player1Win = false;
        player2Win = false;
        tie = false;
        player = true;
        playing = true;
        repaint();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newGame) {
            reset();
        }
    }
	public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        /*if(playing) {
            if(x < 200 && x > 100 && y < 200 && y > 100) {
                game.turn(0,0,player);
            }
            else if(x < 300 && x > 200 && y < 200 && y > 100) {
                game.turn(0,1,player);
            }
            else if(x < 400 && x > 300 && y < 200 && y > 100) {
                game.turn(0,2,player);
            }
            else if(x < 200 && x > 100 && y < 300 && y > 200) {
                game.turn(1,0,player);
            }
            else if(x < 300 && x > 200 && y < 300 && y > 200) {
                game.turn(1,1,player);
            }
            else if(x < 400 && x > 300 && y < 300 && y > 200) {
                game.turn(1,2,player);
            }
            else if(x < 200 && x > 100 && y < 400 && y > 300) {
                game.turn(2,0,player);
            }
            else if(x < 300 && x > 200 && y < 400 && y > 300) {
                game.turn(2,1,player);
            }
            else if(x < 400 && x > 300 && y < 400 && y > 300) {
                game.turn(2,2,player);
            }
        }*/
        if(playing) {
            int r = 0;
            int c = 0;
            boolean taken = false;
            for(int i = 0; i < size;i += size/3) {
                r = 0;
                for(int j = 0; j < size;j += size/3) {
                    if(x > i+offSetLeft && x < i+(size/3)+offSetLeft && y > j+offSetTop && y < j+offSetTop + (size/3)) {
                        taken = !game.turn(r,c,player);
                    }
                    r++;
                }
                c++;
            }
            if(x < offSetLeft+size && x > offSetLeft && y < offSetTop+size && y > offSetTop && !taken) {
                player = !player;
            }

            if(game.checkTicTacToe1()) {
                player1Win = true;
                playing = false;
            }
            if(game.checkTicTacToe2()) {
                player2Win = true;
                playing = false;
            }

            if(game.checkFull() && !player1Win && !player2Win) {
                tie = true;
                playing = false;
            }
        }
        repaint();
	}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
}
 

