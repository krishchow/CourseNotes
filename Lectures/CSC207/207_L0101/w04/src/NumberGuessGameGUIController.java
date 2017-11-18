import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessGameGUIController implements ActionListener {
	
	JTextField tf;
	JLabel l, numTries, result;
	NumberGuessGame game;
	JButton b;
	
	public NumberGuessGameGUIController() {
		
		game = new NumberGuessGame();
		
		JFrame f = new JFrame("Number Guess Game");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l = new JLabel("Guess number between 0 and 10:");
		tf = new JTextField(5);
		b = new JButton("Guess");
		b.addActionListener(this);
		numTries = new JLabel("# of attempts: " + game.getNumTries());
		result = new JLabel("");
		
		Container c = f.getContentPane();
		
		JPanel panel1 = new JPanel();
		panel1.add(l);
		panel1.add(tf);
		panel1.add(b);
		
		JPanel panel2 = new JPanel();
		panel2.add(numTries);
		panel2.add(result);
		
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.SOUTH);

		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NumberGuessGameGUIController g = new NumberGuessGameGUIController();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 1. get guess (getText)
		int guess = Integer.parseInt(tf.getText());
		System.out.println(guess);
		// 2. use game.checkGuess
		String output = game.checkGuess(guess);
		
		// 3. update result based on what you get from step 2
		result.setText(output);
		
		// 4. update numTries based on game.getNumTries
		numTries.setText("# of attempts: " + game.getNumTries());
		
	}
}
