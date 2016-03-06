import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Runner
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame("Formulas");
        Screen s = new Screen();
        frame.add(s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		frame.setFocusable(true);


        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s.move();
                s.moveIfNoMove();
            }
        };

        int delay = 10;

        Timer timer = new Timer(delay,taskPerformer);
        timer.start();
		frame.addKeyListener(s);
		s.addMouseListener(s);
	}
}





