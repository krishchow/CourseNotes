package ca.utoronto.utm.designpatterns.builder;

public class DeluxePizzaBuilder extends PizzaBuilder {
	public DeluxePizzaBuilder(){
		this.addExtraCheese();
		this.addExtraSauce();
		this.addPepperoni();
		this.addPineapple();
		this.addTomato();
	}
}
