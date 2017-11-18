package ca.utoronto.utm.shapes;
// Author: Arnold Rosenbloom Lecturer U of T Mississauga
import java.util.*;
public abstract class Observer {
	private ArrayList<Subject> subjects=new ArrayList<Subject>();
	
	public void attachSubject(Subject s){
		subjects.add(s);
		update();
	}

	public void detachSubject(Subject s){
		subjects.remove(s);
		update();
	}

	public ArrayList<Subject> getSubjects(){ return subjects; }

	public abstract void update();
}
