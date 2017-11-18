import java.awt.*;
import javax.swing.*;

/**
 * Visual Guide: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
 */

public class LayoutDemo {
	
	public static void demoMixedLayout(Container c) {
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		//c.add(new JTextField("Center"), BorderLayout.CENTER);
		
		JPanel p = new JPanel(); // default comes with FlowLayout
		p.setLayout(new GridLayout(3, 0));
		for (int i = 1; i < 12; i++) {
			p.add(new JButton("Center " + i));
		}
		
		JPanel p2 = new JPanel(); // FlowLayout
		p2.add(new JLabel("second panel"));
		
		p.add(p2);
		
		c.add(p, BorderLayout.CENTER);
	}
	
	public static void demoGridLayout(Container c) {
		JButton[] numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(String.valueOf(i));
		}
		
		c.setLayout(new GridLayout(0, 2)); // rows, cols
		
		for (JButton b: numbers) {
			c.add(b);
		}
	}
	public static void demoFlowLayout(Container c) {
		
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		
		c.add(b1); 
		c.add(b2);
		c.add(b3);
		c.add(b4);
		
	}
	
	public static void demoBorderLayout(Container c) {
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JTextField("Center"), BorderLayout.CENTER);
	}
	
	public static void createAndShowGUI() {
		
		// Make new JFrame
		JFrame frame = new JFrame("GUI 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Get the content pane where we'll add all the UI components
		Container c = frame.getContentPane();
		
		// This made all the buttons cover each other:
		// Add UI Components
//		JButton b1 = new JButton("1");
//		JButton b2 = new JButton("2");
//		JButton b3 = new JButton("3");
//		JButton b4 = new JButton("4");
//		
//		c.add(b1); // for BorderLayout, default is CENTER
//		c.add(b2);
//		//c.add(b3);
//		//c.add(b4);
		
		//demoBorderLayout(c);
		//demoFlowLayout(c);
		//demoGridLayout(c);
		demoMixedLayout(c);
		
		// Pack Components, Set Visibility
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
