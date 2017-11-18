package ca.utoronto.utm.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TockTimerHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Tock!");
	}
	
}
