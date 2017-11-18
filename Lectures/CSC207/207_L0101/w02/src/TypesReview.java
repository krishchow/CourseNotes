// Review of Types

public class TypesReview {

	public static void main(String[] args) {

		// == Types ==
		// Every variable has a type. Types fall into two categories.
		// (1) Primitive types
		// - Primitive values are NOT objects.
		// - The value (not a reference to it) sits directly in the box.
		// - byte, short, int, long, float, double, boolean, char
		// - Primitive type names begin with lowercase letters.

		// Declare that age is a variable and its type is int; assign it
		// the value 5.
		// The variable does not contain a reference to an object with value 5;
		// the variable contains 5 itself.
		int age = 5;
		boolean lovesPrincesses = true;
		double shoeSize = 12.5;
		char initial = 'C';

		// We can't redeclare a variable.
		// int age = 8;

		// But we can assign a new value to it.
		age = 8;

		// We can't assign it anything other than int values.
		// age = 8.7;
		// age = true;

		// (2) Class types
		// - the variable contains a reference to an object.
		// - We must explicitly construct each object using "new"

		// Declare that s1 is a variable whose type is String; construct a new
		// object of type String and store a reference to it in s1.
		String s1 = new String("hello");

		// == Wrapper classes and autoboxing ==

		// Every primitive type has a wrapper class version. It can be used to
		// represent a primitive value when an Object is needed.
		Integer i2 = new Integer(5);
		Boolean b2 = new Boolean(false);

		// Java can automatically "box" a primitive into an instance of its
		// wrapper class.
		Integer x = 6; // automatically does Integer i = new Integer(6)

		// And it can automatically "unbox" a wrapper object to get the
		// primitive value.
		int y = x + 4; // automatically does int y = x.intValue() + 4;		
		
	}

}