package ca.utoronto.utm.gui;
import javax.swing.Timer;

public class TimerDemo {
	public static void createAndShowGUI() {
		Timer timer = new Timer(1000,null);
		
		TimerHandler th = new TimerHandler();
		timer.addActionListener(th);
		
		TockTimerHandler to = new TockTimerHandler();
		timer.addActionListener(to);
		
		timer.start();
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
