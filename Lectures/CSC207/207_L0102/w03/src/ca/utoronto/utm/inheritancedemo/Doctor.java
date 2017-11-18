package ca.utoronto.utm.inheritancedemo;

public class Doctor extends Person {
	public Doctor(String name, int age){
		super(name, age);
	}
	
	/**
	public String hello(){
		return "Hi I'm Dr. "+ this.getName();
	}
	**/
	
	public String getName(){
		return "Dr. "+this.name;
	}
}
