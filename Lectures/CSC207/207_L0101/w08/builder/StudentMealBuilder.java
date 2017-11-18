package builder;

public class StudentMealBuilder extends MealBuilder {

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.setDrink("Coffee");
	}

	@Override
	public void buildMain() {
		// TODO Auto-generated method stub
		meal.setMain("Coffee");
	}

	@Override
	public void buildDessert() {
		// TODO Auto-generated method stub
		meal.setDessert("Coffee cake");
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

	
}
