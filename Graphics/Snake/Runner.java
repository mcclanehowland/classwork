import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Runner
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame("Formulas");
        Game g = new Game();
        frame.add(g);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		
		int delay = 100;
		
		ActionListener taskPerformer = new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				g.move();
				g.checkCollision();
			}
		};
		Timer timer = new Timer(delay, taskPerformer);
		timer.start();
		//frame.addKeyListener(g);
		//g.addMouseListener(g);
	}
}