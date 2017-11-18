package ca.utoronto.utm.designpatterns.factory;

import java.util.ArrayList;

public class Client {
	private Factory factory=new Factory();
	private ArrayList<Food> food = new ArrayList<Food>();
	
	
	public static void main(String [] args){
		Client client=new Client();
	}
	public Client(){
		String [] foodList={"Burger", "Fries", "Fries", "Coke", "Coke", "RootBeer", "Pizza"};
		for(String f:foodList){
			food.add(factory.createProduct(f));
		}
		for(Food f:food){
			System.out.println(f.getName()+" "+f.eat());
		}
	}
}
