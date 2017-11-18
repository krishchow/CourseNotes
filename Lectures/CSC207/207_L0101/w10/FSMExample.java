import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FSMExample {
 
	// Come up with some strings so that recogniseSomethingFSM returns true
	// Describe what this recognises.
	public static boolean recogniseSomethingFSM(String s) {
		
		char[] c = s.toCharArray();
		
		int len = s.length();
		// We can now access the characters of s one at a time via c[0], c[1],
		// ..., c[len-1]

		boolean retVal = true;

		int n = 0;
		int state = 0; // Start out in the initial state
		while (n < len) {
			switch (state) {
			case 0:
				if ('A' <= c[n] && c[n] <= 'Z')
					state = 0;
				else if ('a' <= c[n] && c[n] <= 'z')
					state = 1;
				else
					state = 2;
				break;
			case 1:
				if ('a' <= c[n] && c[n] <= 'z')
					state = 1;
				else
					state = 2;
				break;
			case 2:
				break;
			}
			n = n + 1;
		}
		
		if (state == 2)
			retVal = false;
		
		return retVal;
	}
	

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		System.out.println("Give me a string: ");
		try {
			while ((line = in.readLine()) != null) {
				
				if (recogniseSomethingFSM(line)) {
					System.out.println("recogniseSomethingFSM accepts " + line);
				} else {
					System.out.println("recogniseSomethingFSM rejects " + line);
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
