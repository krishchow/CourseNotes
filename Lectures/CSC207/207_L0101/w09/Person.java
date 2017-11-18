

public class Person {

	private String name, color;
	
	public Person(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	
	public String toString() {
		return this.name + " loves " + this.color;
	}
	
}
