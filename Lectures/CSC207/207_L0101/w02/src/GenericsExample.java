import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		// == Generics ==
		// Generics allow a data type to be passed in as a parameter
		// Code that uses generics:
		// - Allows type checking at compile time.
		// (aim is to detect bugs at compile time, rather than at run time)
		// - Eliminates the need for typecasting.

		// ---- Non-generic code ----
		ArrayList firstList = new ArrayList();
		firstList.add("Hello");
		firstList.add(new Integer(3));
		
		// To call a String method, we would need to typecast:
		((String) firstList.get(0)).charAt(0);
		
		// But if we typecast an non-String to type String, a
		// runtime exception occurs.
		
		// ((String) firstList.get(1)).charAt(0);
		
		
		// ---- Generic Code ----
		ArrayList<String> secondList = new ArrayList<>();
		secondList.add("Hello");
		// secondList.add(new Integer(3)); // compile error

	}
}
