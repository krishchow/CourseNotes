package ca.utoronto.utm.gui;
import javax.swing.*; // For JFrame
import java.awt.*; // For BorderLayout
class ComplexFrame {
	public static void createAndShowGUI() {
		// JFrame has a default content pane with a border layout
		JFrame f=new JFrame("My First Frame"); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=f.getContentPane();
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("West"),BorderLayout.WEST);

		// For the CENTER, we will have a more complex sub GUI
		JPanel p=new JPanel(); // Comes with a default Flow Layout
		p.setLayout(new GridLayout(3,4)); 
		for(int i=1; i<=12;i++){
			p.add(new JButton("Center "+i));
		}

		// JPanels can also contain other JPanels

		// Now add p to the content pane of f
		c.add(p,BorderLayout.CENTER);
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