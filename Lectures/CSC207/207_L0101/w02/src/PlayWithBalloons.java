import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayWithBalloons {

	public static void main(String[] args) {
		
		ArrayList<Balloon> allMyBalloons = new ArrayList<>();
		int num;
		String c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many balloons do you want?");
		num = sc.nextInt();
		System.out.println("What color?");
		c = sc.next();
		
		for (int i = 0; i < num; i++) {
			allMyBalloons.add(new Balloon(c));
		}
		
		//System.out.println(allMyBalloons);
		
		// Randomly pop a balloon
		Random rn = new Random();
		int randInt = rn.nextInt(allMyBalloons.size());
		allMyBalloons.get(randInt).pop();
		
		int[] chosenNums = new int[3];
		// intArray.length     for arraylist it is .size()
		// add in checks to check that chosen numbers are all in bounds
		System.out.println("Pick three balloons (enter index value). If none of them are popped, you win. Else, you lose.");
		for (int i = 0; i < 3; i++) {
			if (sc.hasNext()) {
				chosenNums[i] = sc.nextInt(); // Integer.parseInt(sc.next())
			}
		}
		
		Balloon b;
		int countPopped = 0;
		for (int n: chosenNums) {
			b = allMyBalloons.get(n);
			System.out.println(b.getIsPoppedMsg());
			if (b.getIsPopped()) {
				countPopped++;
			}
		}
		
		if (countPopped > 0) {
			System.out.println("You lose!!!");
		} else {
			System.out.println("You win ;D");
		}
	}
}
