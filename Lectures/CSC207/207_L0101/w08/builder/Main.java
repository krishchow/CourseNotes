package builder;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		MealDirector director = new MealDirector();
		MealBuilder builder = null;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Are you a kid or a student?");
		String ans  = s.nextLine();
		
		if (ans.equals("kid")) {
			builder = new KidsMealBuilder();
		}
		else {
			builder = new StudentMealBuilder();
		}
		
		Meal meal = director.createMeal(builder);
		System.out.println(meal);
	}

}
