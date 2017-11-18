public class BooleanExamples {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 6;
		
		// AND
		if ((x < 100) && (y < 100)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// OR
		if ((x < 6) || (y < 6)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// NOT
		System.out.println(!(x < 6));
		System.out.println(!(y < 6));
	}
}
