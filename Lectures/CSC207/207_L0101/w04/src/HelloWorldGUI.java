import javax.swing.*;
import java.awt.*;

public class HelloWorldGUI {

	/**
	 *
	 * Basic Workflow:
	 *
	 * 1. Create a window to hold entire GUI
	 * 2. Create UI Components
	 * 3. Arrange UI components inside this window
	 * - add individual components
	 * - OR group components into containers, and add the containers
	 * 4. Attach handlers to UI components to handle events generated
	 * 5. Pack UI components onto window and set window's visibility to true
	 * 
	 */

	private static void createAndShowGUI() {
		
		JFrame frame = new JFrame("My first JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setPreferredSize(new Dimension(200, 200));
		//frame.setLocation(100, 100);
		
		// Add UI components
		JLabel label = new JLabel("Hello world");
		
		Container c = frame.getContentPane();
		c.add(label);
		
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
