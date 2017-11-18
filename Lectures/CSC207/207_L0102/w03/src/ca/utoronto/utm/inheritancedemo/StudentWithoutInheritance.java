package ca.utoronto.utm.inheritancedemo;

public class StudentWithoutInheritance {
	String name;
	int age;
	String studentNumber;
	
	public StudentWithoutInheritance(String name, int age, String studentNumber){
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public int getAge() {
		return age;
	}
}
