package myobserver;

import java.util.ArrayList;

public class MyObservable {
	
	// Collection of observers
	private ArrayList<MyObserver> observers = new ArrayList<MyObserver>();
	
	public void attach(MyObserver o){
		this.observers.add(o);
	}
	
	public void detach(MyObserver o){
		this.observers.remove(o);
	}
	
	public void notifyMyObservers(){
		for(MyObserver o:this.observers){
			o.update();
		}
	}
}
