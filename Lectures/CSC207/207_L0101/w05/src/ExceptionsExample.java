import java.util.Scanner;

public class ExceptionsExample {

	/**
	 * Exceptions report exceptional conditions: unusual, strange, disturbing.
	 * 
	 * These conditions deserve exceptional treatment: not the usual go-to-the-next-step, plod-onwards approach.
	 * 
	 * To “throw an exception”: 
	 * 		throw Throwable; 
	 *
	 * To “catch an exception” and deal with it: 
	 * 		try {  
	 * 			statements  
	 * 		// The catch belongs to the try. 
	 * 		} catch (Throwable parameter) {       
	 * 			statements 
	 * 		}
	 * 
	 *  Tutorial: http://www.tutorialspoint.com/java/java_exceptions.htm
	 *  
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			
			int n=Integer.parseInt(sc.nextLine());
			
		} catch(NumberFormatException e) {
			System.out.println("Invalid number: " + e.getMessage());
		}
	}
	
}
