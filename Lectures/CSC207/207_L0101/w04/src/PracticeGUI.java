import java.awt.*;
import javax.swing.*;

public class PracticeGUI {

	private static void createAndShowGUI() {
	
		JFrame frame = new JFrame("GUI 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		
		JLabel label = new JLabel("Tell me your name:");
		JTextField tf = new JTextField(20);
		
		JButton b1 = new JButton("Click me!");
		JButton b2 = new JButton("Don't click me!");
		
		b1.setActionCommand("yes");
		b2.setActionCommand("no");
		
		b1.addActionListener(new MyActionListener(tf, label));
		b2.addActionListener(new MyActionListener(tf, label));
		
		c.add(label, BorderLayout.NORTH);
		c.add(tf, BorderLayout.CENTER);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		c.add(p, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
