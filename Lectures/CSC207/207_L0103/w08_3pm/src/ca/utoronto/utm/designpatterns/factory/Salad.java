package ca.utoronto.utm.designpatterns.factory;
// this is a concrete product
public class Salad extends Food {
	public Salad(){
		super("Salad", 100, 5);
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "bite crunch crunch crunch";
	}
	
}
