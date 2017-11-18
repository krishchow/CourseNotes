public class Balloon {

	// the instance variables get declared
	// outside of any method
	private int amount;
	private int capacity;
	private boolean popped;
	private String color;
	
	// the constructor has the same name as the class
	// no return type; not even void
	public Balloon(String color) {
		this.amount = 0;
		this.capacity = 100;
		this.popped = false;
		// this is like Python's "self"
		this.color = color;
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
	
	@Override
	public String toString() {
		// complete this
		return "";
	}
}
