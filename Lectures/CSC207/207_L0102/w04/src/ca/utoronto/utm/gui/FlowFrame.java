package ca.utoronto.utm.gui;
import javax.swing.*; // For JFrame
import java.awt.*; // For FlowLayout

class FlowFrame {
	public static void createAndShowGUI() {
		JFrame f = new JFrame("My First Frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		f.getContentPane().add(new JButton("North"));
		f.getContentPane().add(new JButton("South"));
		f.getContentPane().add(new JButton("East"));
		f.getContentPane().add(new JButton("West"));
		f.getContentPane().add(new JTextField("Center"));
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