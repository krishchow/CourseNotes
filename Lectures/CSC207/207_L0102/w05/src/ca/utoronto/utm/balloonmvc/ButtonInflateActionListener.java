package ca.utoronto.utm.balloonmvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonInflateActionListener implements ActionListener {
	
	private Balloon balloon;
	
	ButtonInflateActionListener(Balloon balloon) {
		this.balloon=balloon;
	}
	public void actionPerformed(ActionEvent e) {
		balloon.inflate(10);
		// System.out.println(" button pressed");
	}
}

