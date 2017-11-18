package strategy2;

public class Person {

	private String name, location;
	
	public Person(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return ("I am " + name + " at " + location);
	}
}
