package ca.utoronto.utm.balloonmvc;
import javax.swing.*;
import java.awt.*;

public class GUIApp2 {
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
		// Create and hook up the Model, View and the controller
		
		// View
		GUIView guiView1 = new GUIView();
		GUIView guiView2 = new GUIView();
		
		// Model
		Balloon model_b1=new Balloon("Red", 100);
		Balloon model_b2=new Balloon("Green", 200);

		// Hook the model to the view.
		model_b1.addObserver(guiView1);
		model_b2.addObserver(guiView2);
				
		// Create the GUI controller to control the Model
		JFrame frame = new JFrame("Balloons"); // Frame with title
		// What happens when we close the JFrame...
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout components in a grid, 2 rows, two columns
		frame.getContentPane().setLayout(new GridLayout(2,2)); 
		
		JButton b1, b2; // Two reference to JButton, no buttons exist yet!!

		// Create the buttons
		b1 = new JButton("Inflate "+model_b1.getColor());
		b2 = new JButton("Inflate "+model_b2.getColor());

		// add them to the contentPane
		frame.getContentPane().add(guiView1);
		frame.getContentPane().add(b1);
		frame.getContentPane().add(guiView2);
		frame.getContentPane().add(b2);

		// Create button press event handlers
		ButtonInflateActionListener mb1 = new ButtonInflateActionListener(model_b1);
		ButtonInflateActionListener mb2 = new ButtonInflateActionListener(model_b2);

		// Tell the buttons who they should call when they are pressed.
		// That is, hook up the controller to the Model.
		b1.addActionListener(mb1);
		b2.addActionListener(mb2);
		
		// tell the frame to pack in all the components
		// this is done according to the layout manager
		frame.pack();

		// lets see the frame
		frame.setVisible(true);
		
		// Let the model tell the views to update
		model_b1.notifyObservers();
		model_b2.notifyObservers();
	}
}