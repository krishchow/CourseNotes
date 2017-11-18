
public class Main {

	public static void main(String[] args) {
		
		// == simple example of overriding == 
		// every class accesses its own method
		Top t = new Top();
		//t.printValue();
		
		Middle m = new Middle();
		//m.printValue();
		
		Bottom b = new Bottom();
		//b.printValue();
		
		// == example 2 ==
		Top t2 = new Middle(); // making a Middle, casting it as a Top
		// Because a child class inherits everything from its parent
		// any place where we could have used the parent,
		// we can instead use the child
		
		// It does not work the other way around!
		// Middle m2 = new Top();
		
		t2.printValue();
		((Top)t2).printValue(); // child's methods will OVERRIDE the parents
		
		// When a child is acting as its parent
		// I can only access methods that the PARENT will have access to
		// t2.middleMethod(); -- error
		// unless I cast it to be a Middle
		((Middle)t2).middleMethod();
		//((Middle2)t2).printValue(); -- casting a sibling to act as another
		
		// Examples of method overriding ^
		
		// Let's see how Java deals with the attributes
		// checks the type of the class in [class].attribute
		System.out.println(t2.value);
		System.out.println(((Middle)t2).value);

		// this is an example of Shadowing
		System.out.println("Printing value: " + m.value);
		
		// == Example 3 ===
		Top t3 = new Bottom();
		
		t3.printValue();
		System.out.println(t3.value);
	
		//What would be the output of the following?
		// METHODS -- start at MOST SPECIFIC class
		// ATTRIBUTES -- check TYPE of the class you're using, start there
		//System.out.println(t3.midValue); -- ERROR
		System.out.println(((Middle)t3).midValue);
		System.out.println(((Bottom)t3).midValue);
		((Middle)t3).middleMethod();
		((Bottom)t3).middleMethod();
		
		
		
		
		
	
		
		
		
		
		
		// Aside
		// Downcasting
		Object[] myArray = new Object[3];
		myArray[0] = "hello";
		
		// how can I call string methods on myArray[0]?
		//myArray[0].
		// I'd have to downcast it to a more specific type
		((String)myArray[0]).trim();
	}
}
