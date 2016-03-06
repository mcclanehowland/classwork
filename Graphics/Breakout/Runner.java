import javax.swing.JFrame;
import java.util.Scanner;
public class Runner
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame("Breakout");
        Game g = new Game();
        frame.add(g);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		frame.setFocusable(true);
		g.addMouseListener(g);
		frame.addKeyListener(g);
		g.animateBall();
	}
}