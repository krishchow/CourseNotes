package ca.utoronto.utm.designpatterns.composite;

public class ODigit implements AODigit {
	private int digit=0;
	private AODigit next;
	private int base=10;
	
	public ODigit(AODigit next, int base){
		this.next=next;
		this.base=base;
	}
	
	public static void main(String [] args){
		AODigit odometer=new OEnd();
		odometer = new ODigit(odometer, 3);
		odometer = new ODigit(odometer, 3);
		odometer = new ODigit(odometer, 3);
		odometer = new ODigit(odometer, 3);
		for(int i=0;i<100;i++){
			odometer.increment();
			System.out.println(odometer.display());
		}
		for(int i=0;i<50;i++){
			odometer.decrement();
			System.out.println(odometer.display());
		}
	}

	@Override
	public void increment() {
		this.digit++;
		if(this.digit==base){
			this.digit=0;
			this.next.increment();
		}
		
	}
	@Override
	public void decrement() {
		this.digit--;
		if(this.digit<0){
			this.digit=base-1;
			this.next.decrement();
		}
		
	}

	@Override
	public String display() {
		return this.next.display()+this.digit;
	}
	
}
