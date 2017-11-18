package ca.utoronto.utm.balloonmvc;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

/**
 * We extend JLabel as a view on a Balloon
 * @author arnold
 *
 */

public class GUIView extends JLabel implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		Balloon balloon = (Balloon)o;
		this.setText(""+balloon.getAmount()+" of "+balloon.getCapacity());		
	}
	
}
