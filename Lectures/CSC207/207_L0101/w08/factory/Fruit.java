package factory;

public abstract class Fruit {

	final String type;
	
	public Fruit(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
