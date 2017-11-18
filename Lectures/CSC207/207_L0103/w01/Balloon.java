public class Balloon {
	private int amount;
	private int capacity;
	private boolean popped;

	public Balloon(){
		this.amount = 0;
		this.capacity = 100;
		this.popped = false;
	}
	public String toString(){
		return "amount="+this.amount+
			" capacity="+this.capacity+
			" popped="+this.popped;
	}

	// void means return nothing
	public void addAir(int a){
		if(a<0){
			return;
		}
		if(this.popped==true){
			return;
		}
		this.amount = this.amount + a;
		if(this.amount>this.capacity){
			this.popped = true;
			this.capacity = 0;
			this.amount = 0;
		}
		return;
	}

	public static void main(String [] args){
		Balloon b; // b is a reference to Balloon, none exist yet
		b = new Balloon();
		System.out.println(b.toString());
		b.addAir(10);
		System.out.println(b.toString());
		b.addAir(50);
		System.out.println(b.toString());
		b.addAir(50);
		System.out.println(b.toString());
		b.addAir(50);
		System.out.println(b.toString());

		System.out.println("Another Balloon");
		b = new Balloon(); // Two Balloons, I cant talk to the first one!!
		Balloon c = b;
		b.addAir(10);
		c.addAir(15);
		System.out.println(c);
	}

}
