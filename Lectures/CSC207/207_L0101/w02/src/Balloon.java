public class Balloon {

	// the instance variables get declared
	// outside of any method
	private int amount = 0;
	private int capacity = 100;
	private boolean popped = false;
	private String color;
	
	private static int numBalloons = 0;
	
	// the constructor has the same name as the class
	// no return type; not even void
	
	// overloading constructors -- having multiple constructors
	// with different type signatures
	public Balloon(String color) { // A
		// this is like Python's "self"
		this.color = color;
		numBalloons++;
	}
	
	public Balloon() { // B
		this("Invisible");
		//this.color = "Invisible";
	}
	
	/**
	 * Construct a new balloon object.
	 * @param amount    the amount of air balloon has
	 * @param capacity  the total capacity of air (max amount it can have)
	 * @param popped    whether or not it's popped
	 * @param color     balloon's color
	 */
	public Balloon(int amount, int capacity, boolean popped, String color) {
		this(color);
		this.amount = amount;
		this.capacity = capacity;
		this.popped = popped;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setAmount(int amnt) {
		this.amount = amnt;
	}
	
	/**
	 * Get the amount this balloon has
	 * @return amount of air in balloon
	 */
	public int getAmount() {
		return this.amount;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public boolean getIsPopped() {
		return this.popped;
	}
	
	public String getIsPoppedMsg() {
		if (this.popped) {
			return "This balloon is popped! :(";
		} else {
			return "This balloon is still alive! :D";
		}
	}
	
	public static int getNumBalloons() {
		return numBalloons;
	}
	
	public void pop() {
		this.amount = 0;
		this.capacity = 0;
		this.popped = true;
	}

	public void inflate(int a) {
		
		if ((this.popped == false) && (a > 0)) {
			this.amount += a;
			if (this.amount > this.capacity) {
				this.pop();
			}
 		}
	}
	
	@Override
	public String toString() {
		// complete this
		return "Color: " + this.color + ", Amount: " + this.amount +
				", Capacity: " + this.capacity + ", Popped: " + this.popped;
	}
	
	public static void main(String[] args) {

		// static variables can be called even if
		// no instance of that class has yet been made
		System.out.println(Balloon.numBalloons);
	
		Balloon b1 = new Balloon("green");
		b1.color = "red";
		System.out.println(b1); // b1.toString() -- similar to Python __str__
		
		Balloon b2 = new Balloon();
		System.out.println(b2);
		
		Balloon b3 = new Balloon(5, 50, false, "green");
		System.out.println(b3);
		
		System.out.println(Balloon.numBalloons);
		
	}

}
