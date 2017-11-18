package ca.utoronto.utm.numberguessgame;

import javax.swing.*; // For JFrame
import java.awt.*; // For BorderLayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIController implements ActionListener {
	private NumberGuessGame game;
	private JTextField usersGuess;
	private JLabel result, numberOfTries;
	
	GUIController(){
		game=new NumberGuessGame();
			
		// JFrame has a default content pane with a border layout
		JFrame f = new JFrame("My First Frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel with num, button, result in a grid
		//JFrame N has num tries, c has JPanel
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(1,3));
		usersGuess=new JTextField();
		panel.add(usersGuess);
		
		JButton b=new JButton("guess");
		b.addActionListener(this);
		
		panel.add(b);
		result=new JLabel("  ");
		panel.add(result);
		
		Container c = f.getContentPane();
		numberOfTries=new JLabel("0 Guesses", JLabel.CENTER);
		c.add(numberOfTries, BorderLayout.SOUTH);
		c.add(panel, BorderLayout.CENTER);
		
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUIController gui=new GUIController();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			// get guess
			// convert to int
			int guess=Integer.parseInt(usersGuess.getText());
		
			// check with game 
			int result=game.guess(guess);
			
			// put up result
			if(result==NumberGuessGame.CORRECT){
				this.result.setText("Correct");
			}else if(result==NumberGuessGame.HIGH){
				this.result.setText("high");
			}else if(result==NumberGuessGame.LOW){
				this.result.setText("low");
			}
			
			// put up number of guesses
			this.numberOfTries.setText(""+game.getNumberOfTries()+" tries");
		} catch (NumberFormatException e){
			this.result.setText("bad number");
		}
	
	}
}
