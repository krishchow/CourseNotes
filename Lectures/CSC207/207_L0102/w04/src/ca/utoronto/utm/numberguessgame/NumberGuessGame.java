package ca.utoronto.utm.numberguessgame;

import java.util.Random;

public class NumberGuessGame {
	/* static (Class) */
	private static int numberOfGamesPlayed=0;
	public static final int LOW=-1;
	public static final int CORRECT=0;
	public static final int HIGH=1;
	
	public static int getNumberOfGamesPlayed(){
		return numberOfGamesPlayed;
	}
	
	/* instance variables **/
	private int secretNumber;
	private int numberOfTries=0;
	
	public NumberGuessGame(int max){
		Random r=new Random();
		this.secretNumber=r.nextInt(max)+1;
		this.numberOfGamesPlayed++;
	}
	public NumberGuessGame(){
		this(10);
	}
	/**
	 * respond to a users guess
	 * @param number
	 * @return LOW, CORRECT, HI depending on whether the guess is low, correct or high
	 */
	public int guess(int number){
		numberOfTries++;
		if(number<this.secretNumber)return LOW;
		if(number>this.secretNumber)return HIGH;
		return CORRECT;
	}
	
	public int getNumberOfTries(){
		return this.numberOfTries;
	}
}
