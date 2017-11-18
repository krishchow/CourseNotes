package ca.utoronto.utm.gui;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class HiBye {
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Hi Bye"); // Frame with title
		// What happens when we close the JFrame...
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout components in frame left to right, top to bottom
		frame.getContentPane().setLayout(new FlowLayout());

		JButton b1, b2; // Two reference to JButton, no buttons exist yet!!

		// Create the buttons
		b1 = new JButton("Hi");
		b2 = new JButton("Bye");

		// add them to the contentPane
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);

		// Do the same with a JTextField
		JTextField t = new JTextField(20);
		frame.getContentPane().add(t);

		// Create button press event handlers
		HiByeActionListener mb1 = new HiByeActionListener(t);
		HiByeActionListener mb2 = new HiByeActionListener(t);
		
		// Tell the buttons who they should call when they are pressed
		b1.addActionListener(mb1);
		b2.addActionListener(mb2);

		// tell the frame to pack in all the components
		// this is done according to the layout manager
		frame.pack();

		// lets see the frame
		frame.setVisible(true);

	}
}
