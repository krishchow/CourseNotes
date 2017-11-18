package ca.utoronto.utm.numberguessgamemvc;

public class GuessGameApp {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GuessGameApp gga = new GuessGameApp();
			}
		});
	}

	private NumberGuessGame model;
	private GuessGameView view;
	private GUIController controller;

	GuessGameApp() {
		this.model = new NumberGuessGame();
		this.view = new GuessGameView();
		this.controller = new GUIController(this.view, this.model);
		this.view.addActionListener(this.controller);
		this.model.addObserver(this.view);
	}
}
