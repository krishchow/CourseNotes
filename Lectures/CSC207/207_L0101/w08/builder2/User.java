package builder2;

public class User {

    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    
//    public User (String firstName, String lastName, int age, String phone, String address){
//	    this.firstName = firstName;
//	    this.lastName = lastName;
//	    this.age = age;
//	    this.phone = phone;
//	    this.address = address;
//	}
    
    // If only the first two arguments are mandatory, rest are optional
    // What are my choices?
    
    // 1. Making more constructors
    //public User (String firstName, String lastName, int age, String phone) { .. }
    
    //public User (String firstName, String lastName, String phone, String address) { .. }
    //public User (String firstName, String lastName, int age, String address) { .. }
 
    // 2. Have setters --> Result in a loss of immutability

    
    private User (UserBuilder builder){
	    this.firstName = builder.firstName;
	    this.lastName = builder.lastName;
	    this.age = builder.age;
	    this.phone = builder.phone;
	    this.address = builder.address;
	}
    
    public String getFirstName() {
    	return firstName;
    }

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return "User: " + this.firstName +  " , " + this.lastName + " " + this.age + " " + this.address;
	}
	
	public static class UserBuilder {

	    private final String firstName; // required
	    private final String lastName; // required
	    private int age; // optional
	    private String phone; // optional
	    private String address; // optional
	    
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}
    
}
