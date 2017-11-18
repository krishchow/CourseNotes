package myobserver;

public class LightBulb extends MyObservable {

	private boolean state=false; // false = off, true = on 
	public final static boolean ON=true;
	public final static boolean OFF=false;
	
	public void turnOn(){
		if(this.state==OFF){
			this.state=ON;
			this.notifyMyObservers();
		}
	}
	public void turnOff(){
		if(this.state==ON){
			this.state=OFF;
			this.notifyMyObservers();
		}
	}
	
	public void flip(){
		this.state=!this.state;
		this.notifyMyObservers();
	}
}
