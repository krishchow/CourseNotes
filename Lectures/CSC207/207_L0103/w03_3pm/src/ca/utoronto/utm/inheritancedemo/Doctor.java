package ca.utoronto.utm.inheritancedemo;

public class Doctor extends Person {
	public Doctor(String name, int age){
		super(name, age); // calls the superclass constructor
	}
	public String getName(){
		return "Dr. "+ super.getName();
	}
}
