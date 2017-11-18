package ca.utoronto.utm.inheritancedemo;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String hello(){
		return "Hi there I'm "+this.getName();
	}
}
