package builder;

public class Meal {

	private String drink;
	private String main;
	private String dessert;
	
	public Meal() {
	}
	
	public void setDrink(String drink) {
		this.drink = drink;
	}
	
	public void setMain(String main) {
		this.main = main;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	
	public String toString() {
		return this.drink + " " + this.main + " " + this.dessert;
	}
	
}
