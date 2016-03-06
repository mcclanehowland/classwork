import javax.swing.JFrame;

public class SceneryRunner
{
	public static void main(String[] args)
	{
		 JFrame frame = new JFrame("Scenery");
		 
		 Scenery canvas = new Scenery();
        frame.add(canvas);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);
	}
}