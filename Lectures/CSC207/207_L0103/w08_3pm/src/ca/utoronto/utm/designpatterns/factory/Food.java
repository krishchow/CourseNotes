package ca.utoronto.utm.designpatterns.factory;
// http://www.mcdonalds.ca/ca/en/food/nutrition_centre.html#/
// This is the 'Product' interface in the design pattern
public class Food {
	private int calories, carbohydrates;
	private String name;
	public Food(String name, int calories, int carbohydrates){
		this.name = name;
		this.calories= calories;
		this.carbohydrates=carbohydrates;
	}
	public String eat(){
		return "bite chew chew";
	}
	public int getCalories() {
		return calories;
	}
	public int getCarbohydrates() {
		return carbohydrates;
	}
	public String getName() {
		return name;
	}	
}
