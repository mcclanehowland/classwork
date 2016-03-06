import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.JTextField;

public class Runner
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame("SpaceShip");
		boolean user = true;
		
        Screen s = new Screen();
		
        frame.add(s);
		
		s.addMouseListener(s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
		frame.setVisible(true);
		frame.setFocusable(true);
		//frame.requestFocusInWindow();
		frame.addKeyListener(s);
		
		s.animate();
		
		
		
		
		
		
        
	}
}