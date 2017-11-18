package ca.utoronto.utm.inheritancedemo;

public class StudentWithoutInheritance {
	private String name;
	private int age;
	private String studentNumber;
	public StudentWithoutInheritance(String name, int age, String studentNumber){
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
}
