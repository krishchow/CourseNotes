package ca.utoronto.utm.gui;
import javax.swing.*; // For JFrame
import java.awt.*; // For GridLayout
class GridFrame {
	public static void createAndShowGUI() {
		JFrame f=new JFrame("My First Frame"); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=f.getContentPane();
		c.setLayout(new GridLayout(2,4)); // 2 rows, 4 columns
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		f.pack();
		f.setVisible(true);
	}	
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}