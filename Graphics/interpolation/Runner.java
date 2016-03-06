import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Runner
{
    public static void main(String[] args)
    {
        Screen s = new Screen();
        double[] xcoordinates = s.interpolateX(0,10,10);
        double[] ycoordinates = s.interpolateY(0,10,10);
        for(double each : xcoordinates) {
            System.out.print(each+" ");
        }
        System.out.println();
        for(double each : ycoordinates ) {
            System.out.print(each+" ");
        }

		JFrame frame = new JFrame("Formulas");
        frame.add(s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		frame.setFocusable(true);

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s.move();
            }
        };

        int delay = 10;

        Timer timer = new Timer(delay,taskPerformer);
        timer.start();
		frame.addKeyListener(s);
		s.addMouseListener(s);
	}
}
