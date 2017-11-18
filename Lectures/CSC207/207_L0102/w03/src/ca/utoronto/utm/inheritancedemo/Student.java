package ca.utoronto.utm.inheritancedemo;

public class Student extends Person {
	String studentNumber;
	
	public Student(String name, int age, String studentNumber){
		super(name, age);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	// Override a superclass method
	public String hello(){
		return "I'm "+this.getName()+" my student number is "+this.getStudentNumber();
	}
}
