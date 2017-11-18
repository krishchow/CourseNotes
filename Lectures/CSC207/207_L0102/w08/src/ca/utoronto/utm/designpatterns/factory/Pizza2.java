package ca.utoronto.utm.designpatterns.factory;

public class Pizza2 implements FoodInterface {

	private int calories, carbohydrates;
	private String name;
	
	public Pizza2(){
		this.name = "Pizza2";
		this.calories= 300;
		this.carbohydrates=35;
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
