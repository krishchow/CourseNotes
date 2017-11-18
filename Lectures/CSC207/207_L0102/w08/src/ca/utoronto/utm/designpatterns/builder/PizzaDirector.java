package ca.utoronto.utm.designpatterns.builder;

import java.util.ArrayList;

public class PizzaDirector {
	private PizzaBuilder builder;
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public PizzaDirector(){
		
	}
	public void construct(){
		Pizza p;
		builder=new HawaiianPizzaBuilder();
		builder.addExtraCheese();
		pizzas.add(builder.getPizza());
		pizzas.add(builder.getPizza());
		builder=new DeluxePizzaBuilder();
		pizzas.add(builder.getPizza());
		pizzas.add(builder.getPizza());
		pizzas.add(builder.getPizza());
		
	}
}
