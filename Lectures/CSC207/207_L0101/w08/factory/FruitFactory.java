package factory;

public class FruitFactory {

	public Fruit makeFruit(String type) {
		
		Fruit fruit = null;
		
		if (type == "Apple") {
			fruit = new Apple();
		}
		else if (type == "Orange") {
			fruit = new Orange();
		}
		
		return fruit;
		
	}
}
