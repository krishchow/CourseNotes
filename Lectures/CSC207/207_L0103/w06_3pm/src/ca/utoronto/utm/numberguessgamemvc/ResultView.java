package ca.utoronto.utm.numberguessgamemvc;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class ResultView extends JLabel implements Observer {

	public ResultView(){
		super("   ");
	}
	
	@Override
	public void update(Observable o, Object arg) {
		NumberGuessGame game = (NumberGuessGame) o;
		int result = game.getLastGuessState();
		if (result == NumberGuessGame.CORRECT) {
			this.setText("Correct");
		} else if (result == NumberGuessGame.HIGH) {
			this.setText("high");
		} else if (result == NumberGuessGame.LOW) {
			this.setText("low");
		}
	}

}
