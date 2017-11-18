package ca.utoronto.utm.designpatterns.factory;
// this is a concrete product
public class Soda extends Food {
	public Soda(String type){
		super(type, 780, 55);
	}
	public String eat(){
		return "sip";
	}
}
