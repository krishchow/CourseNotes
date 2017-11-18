package builder;

public class KidsMealBuilder extends MealBuilder {

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.setDrink("Kid drink: Kool-aid");
	}

	@Override
	public void buildMain() {
		// TODO Auto-generated method stub
		meal.setMain("Chicken nuggets");
	}

	@Override
	public void buildDessert() {
		// TODO Auto-generated method stub
		meal.setDessert("Kid size McFlurry");
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

	
}
