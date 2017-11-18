package w02_3pm;

public class Person {
	String name;
	int age;
	int height;
	
	public Person(String name){
		this.name=name;
		this.age=0;
		this.height=36;
	}
	public void setHeight(int h){
		this.height=h;
	}
	public void changeName(String newName){
		this.name=newName;
	}
}
