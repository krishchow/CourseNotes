package ca.utoronto.utm.shapes;
// Author: Arnold Rosenbloom Lecturer U of T Mississauga
import java.util.*;
public class Subject {
	private ArrayList<Observer> observers=new ArrayList<Observer>();

	public Subject(){
		attachObserver(GraphicObserver.observer);
	}

	protected void attachObserver(Observer o){ 
		observers.add(o); 
		o.attachSubject(this); 
	}
	protected void detachObserver(Observer o){ 
		observers.remove(o); 
		o.detachSubject(this);
	}
	protected void notifyObserver(){ 
		for(Observer o:observers){
			o.update();
		}
	}
}
