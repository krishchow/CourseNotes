package ca.utoronto.utm.designpatterns.builder;

public class PizzaBuilder {
	private boolean extraSauce=false;
	private boolean extraCheese=false;
	private boolean pepperoni=false;
	private boolean tomatoes=false;
	private boolean pineapple=false;
	
	public void addExtraSauce(){
		this.extraSauce=true;
	}
	public void addExtraCheese(){
		this.extraCheese=true;
	}
	public void addPepperoni(){
		this.pepperoni=true;
	}
	public void addTomato(){
		this.tomatoes=true;
	}
	public void addPineapple(){
		this.pineapple=true;
	}
	public Pizza getPizza(){
		Pizza p = new Pizza();
		p.setExtraCheese(extraCheese);
		p.setExtraSauce(extraSauce);
		p.setPepperoni(pepperoni);
		p.setPineapple(pineapple);
		p.setTomatoes(tomatoes);
		return p;
	}
}
