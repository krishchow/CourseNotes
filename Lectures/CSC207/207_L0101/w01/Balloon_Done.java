public class Balloon_Done {

	// the instance variables get declared
	// outside of any method
	private int amount = 0;
	private int capacity = 100;
	private boolean popped = false;
	private String color;
	
	private static int numBalloons = 0;
	
	// the constructor has the same name as the class
	// no return type; not even void
	public Balloon_Done(String color) {
		// this is like Python's "self"
		this.color = color;
		numBalloons++;
	}
	
	public Balloon_Done() {
		this("Invisible");
	}
	
	public Balloon_Done(int amount, int capacity, boolean popped, String color) {
		this(color);
		this.amount = amount;
		this.capacity = capacity;
		this.popped = popped;
	}
	
	public void setAmount(int amnt) {
		this.amount = amnt;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public boolean getIsPopped() {
		return this.popped;
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
	
	public static int getNumBalloons() {
		return numBalloons;
	}
	
	@Override
	public String toString() {
		// complete this
		return "Color: " + this.color + ", Amount: " + this.amount + 
				", Capacity: " + this.capacity +
				", Popped: " + this.popped;
	}
	
	public static void main(String[] args) {
		Balloon_Done b1 = new Balloon_Done("pink");
		System.out.println(b1);
		
		Balloon_Done b2 = new Balloon_Done();
		System.out.println(b2);

		Balloon_Done b3 = new Balloon_Done(50, 500, true, "green");
		System.out.println(b3);
		
		System.out.println(Balloon_Done.numBalloons);

	}
	
}
