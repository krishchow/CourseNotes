package ca.utoronto.utm.designpatterns.factory;

public class Burger2 implements FoodInterface {
	// Burger2 and Pizza2 share so much code, might as well make FoodInterface
	// a class Food, and then subclass it.
	private int calories, carbohydrates;
	private String name;
	
	public Burger2(){
		this.name = "Burger2";
		this.calories= 780;
		this.carbohydrates=55;
	}
	@Override
	public String eat() {
		return "bite chew chew";
	}

	@Override
	public int getCalories() {
		return this.calories;
	}

	@Override
	public int getCarbohydrates() {
		return this.carbohydrates;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
