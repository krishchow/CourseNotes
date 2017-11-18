package w02;

/**
 * We capture a Balloon which can be inflated, deflated and popped.
 * A Balloon has an amount and capacity. At all times, 0<=amount<=capacity.
 * A Balloon can be inflated only if it is not popped.
 * 
 * @author arnold
 * 
 * We used this example to explain...
 * IS-A (not really), HAS-A, RESPONDS-TO
 * references, new and constructors
 * constructors: initialize a new instance
 * Unit Testing: test public methods
 * JavaDoc
 * public: other classes have access
 * private: other classes can't access
 * toString(): return a String representation of this
 * overloading: many methods with the same name, different signatures
 */
public class Balloon {
	
	// static stuff appears on the 'bulletin board' associated with the class. 
	// All instances of the class can see the bulletin board.
	
	private static int numBalloons=0; // total number of balloons created
	private static int numPopped=0;

	public static int getNumBalloons(){
		/**
		 * color="Green";
		 * this.capacity=7;
		 * Can't do the above, there is no Balloon associated with the 
		 * 'bulletin  board'. Each Balloon can see the 'bulletin board'.
		 */
		return numBalloons;
	}

	// private means that other classes can not see and modify these variables
	// typically, instance variables are private
	private String color;
	private int amount; // 0<=amount<=capacity
	private int capacity; // 0<=capacity
	private boolean isPopped; // balloons can only be popped once and can never be unpopped
	// if isPopped then capacity and amount should be 0

	/**
	 * Construct a new Balloon with the specified color
	 * @param c the color of the new balloon
	 */
	
	public Balloon(String c){
		// This is a 'constructor'. Java provides a default, no argument consructor if you don't
		// explicitly provide one.
		this.color=c;
		this.amount=0;
		this.capacity=100;
		this.isPopped=false;
		numBalloons++;
	}

	public Balloon(String c, int capacity){
		this.color=c;
		this.amount=0; 
		this.capacity=capacity; // notice the name!!
		this.isPopped=false;
		numBalloons++;
	}
	
	// Which one of the above is called depends on the argument
	// list and type
	
	public String getColor() {
		String color="RED";
		// Search for name starts locally, then instance, then static
		// this.x means start search at instance
		return this.color; 
	}
	public int getAmount() {
		return amount;
	}

	/**
	 * Add amount a to this so long as the total is at most capacity
	 * if the total is larger that capacity, than this is popped
	 * @param a the amount to be added to this, must be positive
	 */
	public void inflate(int a) {
		if(a<0 || this.isPopped()){
			return;
		}
		this.amount = this.amount+a;
		if(this.amount>this.capacity){
			this.pop();
		}
	}
	/**
	 * This is some method. Used to explain JavaDoc
	 * @param a this is the number of blah
	 * @param b this is a String description of splat
	 * @return the number of blas that splatted
	 */
	public int someMethod(int a, String b){
		return 5;
	}
	/**
	 * pop this
	 */
	public void pop(){
		if(this.isPopped)return; // can't pop this twice
		this.amount=0;
		this.capacity=0;
		this.setIsPopped(true); // or this.isPopped=true;
		numPopped++; // remember numPopped is static, associated with the class, not the instance
	}
	public int getCapacity() {
		return capacity;
	}
	// Hmmm, should we allow other classes to change the capacity of this?
	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * 
	 * @return whether this is popped
	 */
	public boolean isPopped() {
		return isPopped;
	}

	// Hmmm, should we allow other classes to call setPopped?
	private void setIsPopped(boolean isPopped) {
		this.isPopped = isPopped;
	}
	
	/**
	 * @return A string representation of this
	 */
	public String toString(){
		String s="";
		s=s+"amount="+ this.amount;
		s=s+" capacity="+ this.capacity;
		s=s+" color="+ this.color;
		s=s+" popped="+ this.isPopped;
		return s;
	}

	public static void main(String [] args){
		// Exercise: Create a few Balloons, inflate some, pop some, cause some to be popped
		// and try to inflate them again and see what happens.
		Balloon b1=new Balloon("Red", 100); 
		// Above is same as 
		// Balloon b1; // Create a reference to Balloon
		// b1=new Balloon("Red"); // Create and init a new Balloon then assign its phone number to b1
		
		System.out.println(b1.toString());
		System.out.println(b1); // same as above, toString() is a special method
		b1.inflate(10);
		System.out.println(b1);
		Balloon b2=null; // b2 is of type Reference to Balloon
		// b2.inflate(10); // null pointer exception, can't do this!!
		
		// At this point, two reference to Balloon exist, only one Balloon exists
		// Make sure you can follow and understand the following!
		b2=b1;
		
		// The VALUE of a reference is the address (phone number) it holds.
		// x=y takes the VALUE of y and puts it into x
		// also, Java is pass by VALUE
		
		b2.inflate(50);
		System.out.println(b1);
		b2=new Balloon("Green");
		b2.inflate(110);
		System.out.println(b1);
		System.out.println(b2);
		Balloon b7;
		b7=b1; b1=b2; b2=b7;
		System.out.println(b1);
		System.out.println(b2);
		b1.setCapacity(10);
	}
}

