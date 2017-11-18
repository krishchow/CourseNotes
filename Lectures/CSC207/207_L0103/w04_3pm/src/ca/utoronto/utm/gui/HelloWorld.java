package ca.utoronto.utm.gui;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;        

public class HelloWorld {
	
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        // frame.getContentPane().add(label); // same as below
        Container c=frame.getContentPane(); // where all the components go
        c.add(label);
        
        label = new JLabel("North");
        c.add(label, BorderLayout.NORTH);
        
        label = new JLabel("South");
        c.add(label, BorderLayout.SOUTH);

        
        label = new JLabel("East");
        c.add(label, BorderLayout.EAST);

        label = new JLabel("West");
        c.add(label, BorderLayout.WEST);
        
        frame.pack(); // Resize the window to fit the components
        frame.setVisible(true); // show the JFrame
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
