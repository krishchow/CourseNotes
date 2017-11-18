package ca.utoronto.utm.inheritancedemo;

public class Student extends Person {
	private String studentNumber;
	public Student(String name, int age, String studentNumber){
		super(name, age); // calls the superclass constructor
		this.studentNumber = studentNumber;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	
	/**
	public String hello(){
		return "Hello, I'm "+this.getName()+" my student number is "+this.getStudentNumber();
	}
	**/
	/** Infinite recursion
	public String hello(){
		return hello()+" my student number is "+this.getStudentNumber();
	}
	**/
	public String hello(){
		return super.hello()+" my student number is "+this.getStudentNumber();
	}
	/**
	 * The search for a method starts at the type of the instance and works
	 * its way up the hierarchy. So Student then Person.
	 * If you say super, the search starts at your superclass.
	 */
}
