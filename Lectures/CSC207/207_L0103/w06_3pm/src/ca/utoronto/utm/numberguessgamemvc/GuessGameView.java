package ca.utoronto.utm.numberguessgamemvc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuessGameView extends JFrame implements Observer {
	private JTextField usersGuess;
	private ResultView result;
	private NumTriesView numberOfTries;
	private JButton guessButton;

	public GuessGameView() {
		super("Guess Game");
		// JFrame has a default content pane with a border layout

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(1, 3));
		usersGuess = new JTextField();
		panel.add(usersGuess);

		guessButton = new JButton("guess");

		panel.add(guessButton);
		result = new ResultView();
		panel.add(result);

		Container c = this.getContentPane();
		this.numberOfTries = new NumTriesView();
		c.add(this.numberOfTries, BorderLayout.SOUTH);
		c.add(panel, BorderLayout.CENTER);

		this.pack();
		this.setVisible(true);
	}

	public String getGuess() {
		return this.usersGuess.getText();
	}

	public void setResult(String s) {
		this.result.setText(s);
	}

	public void addActionListener(ActionListener listener) {
		this.guessButton.addActionListener(listener);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.result.update(o, arg);
		this.numberOfTries.update(o,arg);
	}
}
