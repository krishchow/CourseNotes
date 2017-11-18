package ca.utoronto.utm.designpatterns.composite;

public class ODigit implements AODigit {
	private AODigit next;
	private int digit=0;
	private int base=10;
	
	public ODigit(AODigit next, int base){
		this.next=next;
		this.digit=0;
		this.base=base;
	}

	@Override
	public void increment() {
		this.digit++;
		if(this.digit==this.base){
			this.digit=0;
			this.next.increment();
		}
	}

	@Override
	public String display() {
		return next.display()+this.digit;
	}

	@Override
	public void decrement() {
		this.digit--;
		if(this.digit<0){
			this.digit=this.base-1;
			this.next.decrement();
		}
	}
	
}
