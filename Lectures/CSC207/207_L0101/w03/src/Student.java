
public class Student extends Person {

	private String studentNum;
	
	public Student(String[] name, String dob, String gender, String studentNum) {
		// accesses the superclass (Parent)
		super(name, dob, gender);
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return this.studentNum;
	}
	
	public void changeName() {
		this.setName(new String[] {"I am a student. I'm a number not a name."});
	}
	
	@Override
	public String toString() {
		return "PRINTING STUDENT: " + super.toString() + ", " + this.studentNum;
	}
		
}
