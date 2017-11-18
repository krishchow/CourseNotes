import java.util.Random;

public class NumberGuessGame {

	private int numTries = 0;
	private int secretNum;
	
	public NumberGuessGame() {
		Random r = new Random();
		this.secretNum = r.nextInt(10);
	}
	
	public int getNumTries() {
		return this.numTries;
	}
	
	public String checkGuess(int guess) {
		this.numTries++;
		if (guess < secretNum) {
			return "Try again; too low";
		} else if (guess > secretNum) {
			return "Try again; too high";
		} else {
			return "Yay! You got it!";
		}
	}
}
