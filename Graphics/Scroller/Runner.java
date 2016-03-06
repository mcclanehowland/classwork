import javax.swing.JFrame;
import java.util.Scanner;
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
		
		
	}
}