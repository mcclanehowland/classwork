import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
import java.awt.event.*;
public class Runner
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame("Whack-a-Mole");
        Game p = new Game();
		
		
		
        frame.add(p);
		p.addMouseListener(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		
		
	}
	
}