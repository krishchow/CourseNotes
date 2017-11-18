package ca.utoronto.utm.inheritancedemo;

public class UseStuff {
	public static void main(String [] args){
		Person p1 = new Person("Sid", 23);
		Student s1 = new Student("Sally", 24, "123456789");
		
		System.out.println(s1.getName());
		System.out.println(s1.getStudentNumber());
		
		System.out.println(p1.getName());
		// System.out.println(p1.getStudentNumber()); 
		// Can't do this, p1 is not a reference to Student
		
		p1 = s1;
		
		p1.getName(); // OK
		// p1.getStudentNumber(); // Not OK!!!
		
		Person p2 = new Student("Joey", 33, "111111111");
		
		// s1 = p2; // Can't do that!
		// s1 = p1; // Can't do that either, even though
		// p1 currently references a Student
		
		Student s2;
		
		// s2 = p1; // Nope
		s2 = (Student)p1; // Yes, means trust me now, 
		// p1 really has the phone number of a Student.
		// Could cause a run time error.
		
		Person p3 = new Person("Jane", 21);
		Student s3;
		
		System.out.println(p1);
		
		// s3 = p3;// Nope
		// s3 = (Student)p3; // nope at runtime

		System.out.println(p1.hello());
		System.out.println(p2.hello());
		System.out.println(s1.hello());
		System.out.println(p3.hello());

		// Search for method starts at the instance of the class
		// and works its way up
		
		Doctor d1 = new Doctor("Mary", 35);
		System.out.println(d1.hello());
	}
}
