package ca.utoronto.utm.numberguessgamemvc;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class NumTriesView extends JLabel implements Observer {
	
	public NumTriesView(){
		super("0 Guesses", JLabel.CENTER);
	}
	@Override
	public void update(Observable o, Object arg) {
		NumberGuessGame game = (NumberGuessGame) o;
		this.setText("" + game.getNumberOfTries() + " tries");
	}

}
