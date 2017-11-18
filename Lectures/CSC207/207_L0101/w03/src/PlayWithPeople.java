
public class PlayWithPeople {

	public static void main(String[] args) {
        //demoAliasing();
        demoInheritance();
	}
	
	/** Demonstrates some aspects of aliasing. */
    public static void demoAliasing() {

    	// What will this print?
        String[] jenName = {"Jen", "C"};
        Person jen = new Person(jenName, "21012000", "F");
        System.out.println(jen);

        // Let's change the value of the first element in the Array jenName.
        // What does this print?
        jenName[0] = "Bob";
        System.out.println(jen);
        
        // How about this?
        String [] someName = jen.getName();
        someName[0] = "Bob";
        System.out.println(jen);
    }
    
    public static void demoInheritance() {
        
        Person jen = new Person(new String[] {"Jen", "C"}, "21012000", "F");
        // Runs toString() from class Person.
        System.out.println(jen); // same as jen.toString();

        Student bob = new Student(new String[] {"Bob", "B", "Bobson"}, "12121992", "M", "1234567890");

        // Which toString() is executed here?
        System.out.println(bob);
        // Whose toString() would get called? Error?
        // After adding in toString in Student, what does the above print?

        // How about now?
        System.out.println(((Person) bob).toString());
        // this would give you an error if attributes are private
        // System.out.println(((Person) bob).gender);
 
        
        
        
        
        
        // What will be printed here?
        if (jen instanceof Student) {
            System.out.println("jen is a Student.");
        }
        if (jen instanceof Person) {  
            System.out.println("jen is a Person.");
        }
        if (jen instanceof Object) {
            System.out.println("jen is a Object.");
        }
        
        // What will get printed here?
        if (bob instanceof Student) {
            System.out.println("bob is a Student.");
        }
        if (bob instanceof Person) {
            System.out.println("bob is a Person.");
        }
        if (bob instanceof Object) {
            System.out.println("bob is a Object.");
        }
    }
}
