package ca.utoronto.utm.designpatterns.factory;
// http://www.oodesign.com/factory-pattern.html
public class Factory {
	public Food createProduct(String product){
		if(product=="Burger")return new Burger();
		if(product=="Coke")return new Soda(product);
		if(product=="RootBeer")return new Soda(product);
		if(product=="Fries")return new Fries();
		if(product=="Pizza")return new Pizza();
		return null;
	}
}
