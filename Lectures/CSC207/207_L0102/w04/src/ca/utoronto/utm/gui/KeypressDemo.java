package ca.utoronto.utm.gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class KeypressDemo {
	public static void createAndShowGUI() {
		  JFrame j=new JFrame();
          j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          j.getContentPane().add(new KeypressPanel(), BorderLayout.CENTER);
          j.setSize(200,200);
          j.pack();
          j.setVisible(true);
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
