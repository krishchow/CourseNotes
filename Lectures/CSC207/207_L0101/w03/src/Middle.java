
public class Middle extends Top {

	int value = 2;
	
	int midValue = 99;
	
	// When a child has a method of the same name
	// as its parent -- this results in OVERRIDING
	public void printValue() {
		System.out.println("I am middle: " + value);
	}
	
	// child-specific method
	public void middleMethod() {
		System.out.println("I belong only to Middle");
	}
}
