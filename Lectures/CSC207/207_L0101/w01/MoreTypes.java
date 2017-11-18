import java.util.Arrays;

public class MoreTypes {

	public static void main(String[] args) {
		int x = 5;

		Integer x2 = new Integer(5);
		
		Double d1 = new Double(5.0);
		Double d2 = 5.0;
		
		double d3 = d2; 
		
		//System.out.println(x.toString());
		
		// Strings
		String s = new String("hello world");
		String s2 = "hello";
		// s2[0]
		System.out.println(s2.charAt(0));

		// s2[0:4]
		System.out.println(s2.substring(0, 4));
		
		String s3 = "    sadf   sd   ";
		System.out.println(s3.trim()); // gets rid of all whitespace
		System.out.println(s3);
			
		// Arrays
		// - all elements have to have the same type
		// - size of the array is fixed
		int[] myArray = new int[3];
		myArray[0] = 207;
		System.out.println(Arrays.toString(myArray)); 
		
		// range(start, end)
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for (int item: myArray) {
			System.out.println(item);
		}
		
	
	}
	

}