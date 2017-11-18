import java.util.Arrays;

// Review of Types

public class MoreTypes {

	public static void main(String[] args) {

		// == Strings ==
		// Strings are objects.
		// Strings are immutable.

		// You can construct a String explicitly, but Java allows a shortcut:
		// you can omit the "new".
		String s = new String("hello");
		String s2 = "bye";

		// Because Strings are immutable, this actually constructs a brand new
		// String rather than appending to the old one.
		s2 = s + s2;
		System.out.println(s2);

		// Indexing
		char letter = s2.charAt(3); // Python: s2[3]
		System.out.println(letter);

		// Slicing
		String slice = s2.substring(4); // Python: s2[4:]
		System.out.println(slice);
		slice = s2.substring(5, 7); // Python: s2[5:7]
		System.out.println(slice);

		// Stripping (remove whitespace from beginning and end of String.)
		String s3 = "    hi   there   ";
		s3 = s3.trim();
		System.out.println(s3);
		
		// Arrays
		String[] myArray = new String[3];
		myArray[0] = "Hello";
		// Eclipse shortcut:
		// sysout, ctrl-space
		System.out.println(myArray[0]);
		
		// Splitting
		s3 = "hello my lovely class";
		String[] parts = s3.split(" ");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
		System.out.println(parts[4]);

	}

}