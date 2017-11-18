package ca.utoronto.utm.designpatterns.builder;

public class Pizza {
	private boolean extraCheese, extraSauce, pepperoni, tomatoes, pineapple;
	public Pizza(){
		this.extraCheese=false;
		this.extraSauce=false;
		this.pepperoni=false;
		this.tomatoes=false;
		this.pineapple=false;
	}
	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}
	public void setExtraSauce(boolean extraSauce) {
		this.extraSauce = extraSauce;
	}
	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}
	public void setTomatoes(boolean tomatoes) {
		this.tomatoes = tomatoes;
	}
	public void setPineapple(boolean pineapple) {
		this.pineapple = pineapple;
	}
}
