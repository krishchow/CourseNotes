package ca.utoronto.utm.numberguessgamemvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIController implements ActionListener {

	private GuessGameView view;
	private NumberGuessGame model;

	public GUIController(GuessGameView view, NumberGuessGame model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try {
			int guess = Integer.parseInt(view.getGuess());
			model.guess(guess);
		} catch (NumberFormatException e) {
			view.setResult("bad number");
		}

	}
}
