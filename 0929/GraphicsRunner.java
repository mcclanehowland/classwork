import javax.swing.JFrame;
public class GraphicsRunner 
{
     
    public static void main( String args[] )
    {
        //(1) Create the frame.  What does the constructor of JFrame takes it?
		//it takes in the title of the popup window
        JFrame frame = new JFrame("Circle5");
 
        //Create JPanel object and add it to the frame
        Circles canvas = new Circles();
        frame.add(canvas);
         
        //(2) What do you think this command does?
		//when the window closes the program quits
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //(3) Fit the preferred size its subcomponents.  What happens when you remove the code below? 
        //Try and Test. this sets the size of the window. You can also manually set the size of the window.
        frame.pack();
 
        //(4) What does setVisible do? What happens when you remove the code below?
        //Try and Test. the window will not appear because it is not set to be visible to the user.
        frame.setVisible(true);
             
    }
}