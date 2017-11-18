package ca.utoronto.utm.designpatterns.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {
	public HawaiianPizzaBuilder(){
		this.addPineapple();
		this.addPepperoni();
	}
}
