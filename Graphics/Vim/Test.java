import javax.swing.JFrame;


public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("VimTest");
        Test2 t = new Test2();
        frame.add(t);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(t);
        t.animate(); 
    }
}
