package ca.utoronto.utm.inheritancedemo;

public class PlayWithStuff {

	public static void main(String[] args) {
		Person p1=null; // p1 is of type Reference to Person
		System.out.println(p1);
		p1 = new Person("Sid", 23);
		System.out.println(p1);
		System.out.println(p1.getName());
		
		
		Student s1 = new Student("Sally", 21, "111111111");
		System.out.println(s1.getName());
		
		Person p2;
		p2=p1;
		System.out.println(p2.getName());
		
		p2 = new Person("Joe", 62);
		
		p2 = s1; // OK!!
		System.out.println(p2.getName());
		// System.out.println(p2.getStudentNumber());
		// p2 has type reference to Person
		
		Student s3;
		// s3 = p1; // Cant do this, may not be a student
		s3 = (Student)p2; // Says to Java, trust me, this 
		// particular Person phone number is the phone number
		// of a Student
		
		System.out.println(s3.getStudentNumber());
		// No runtime error
		
		// s3 = (Student)p1; // Same as above, no compile time error
		// runtime error, this time because p1 holds a reference to
		// a Person, not a Student.
		
		Doctor d = new Doctor("Doolittle", 45);
		System.out.println(d.hello());
		System.out.println(s3.hello());
		System.out.println(p1.hello());
		
		
	}

}
