package ca.utoronto.utm.designpatterns.observer;
public class LightBulb extends Observable {
	public final static boolean ON=true;
	public final static boolean OFF=false;
	
	private boolean lightBulbState = OFF;
	
	public void turnOn(){
		if(this.lightBulbState!=ON){
			this.lightBulbState=ON;
			this.notifyObservers();
		}
	}
	public void turnOff(){
		if(this.lightBulbState!=OFF){
			this.lightBulbState=OFF;
			this.notifyObservers();
		}
	}
	public void flip(){
		this.lightBulbState=!this.lightBulbState;
		this.notifyObservers();
	}
}
