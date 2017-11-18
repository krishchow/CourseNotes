package ca.utoronto.utm.balloonmvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonInflateActionListener implements ActionListener {
	
	private Balloon balloon;
	
	ButtonInflateActionListener(Balloon balloon) {
		this.balloon=balloon;
	}
	public void actionPerformed(ActionEvent e) {
		balloon.inflate(10);
		if(balloon.isPopped()){
			JButton jb = (JButton)e.getSource();
			jb.setEnabled(false);
		}
		// System.out.println(" button pressed");
	}
}

