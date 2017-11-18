public class Balloon {
	private int amount;
	private int capacity;
	private boolean popped;

	public static void main(String [] args){

		Balloon b; // reference to Ballon, no Balloon exists yet!!!
		b = new Balloon(); // now a Balloon exists and I can talk to it via b
		Balloon c = b; 
		System.out.println(b); // default call to toString
		b.add(10);
		System.out.println(c);
		c.add(55);
		System.out.println(b); // default call to toString
		c.add(55);
		System.out.println(b); // default call to toString
		c.add(55);
		System.out.println(b); // default call to toString
		
	}

	
	public boolean isPopped(){
		return this.popped;
	}

	public String toString(){
		return "amount:"+this.amount+" capacity:"+this.capacity+" popped:"+this.popped;
	}

	public void add(int a){
		if(this.isPopped()){
			return;
		}
		if(a<0){
			return;
		}
		this.amount = this.amount + a;
		if(this.amount>this.capacity){
			this.popped=true;
			this.amount = 0;
			this.capacity = 0;
		}
		return;
	}

	public Balloon(){
		this.amount=0;
		this.capacity=100;
		this.popped=false;
	}
	
}
