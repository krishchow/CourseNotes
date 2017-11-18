package w02_3pm;
import java.util.*;

public class UseBalloon {
	public static void main(String [] args){
		// Exercise: Create a few Balloons, inflate some, pop some, cause some to be popped
		// and try to inflate them again and see what happens.
		System.out.println(Balloon.getNumBalloons()); // using a static method without an instance
		
		Balloon b1=new Balloon("Red");
		
		System.out.println(b1);
		b1.inflate(10);
		System.out.println(b1);
		
		// b1.setCapacity(10); setCapacity is a private method of Balloon
		// we can't call setCapacity from outside the Balloon class, it is 
		// a private method.
		
		// See https://docs.oracle.com/javase/8/docs/api/
		ArrayList<Balloon> bag; // reference to ArrayList of Balloons, not array list exists yet
		bag = new ArrayList<Balloon>(); 
		for(int i=0;i<10;i++){
			Balloon z;
			z = new Balloon("Green", i*10);
			bag.add(z);
		}
		for(Balloon bb: bag){
			bb.inflate(30);
		}
		System.out.println(bag.get(5).getCapacity());
		System.out.println(bag);
		System.out.println(bag.size());
		
		// remove popped balloons from bag (really remove their phone numbers)
		/**
		for(Balloon bb: bag){
			if(bb.isPopped()){
				bag.remove(bb);
			}
		}
		// Cant do the following: 
		Iterator<Balloon> i = bag.iterator();
		while(i.hasNext()){
			Balloon bb = i.next();
			if(bb.isPopped()){
				bag.remove(bb);
			}
		}
		
		**/
		// Can do the following
		/**
		Iterator<Balloon> i = bag.iterator();
		while(i.hasNext()){
			Balloon bb = i.next();
			if(bb.isPopped()){
				i.remove();
			}
		}
		**/
		int i=0;
		while(i<bag.size()){
			Balloon bb = bag.get(i);
			if(bb.isPopped()){
				bag.remove(bb);
			} else {
				i = i + 1;
			}
		}
		
		System.out.println(bag.size());
		Balloon z = new Balloon("Orange");
		bag.add(z);
		bag.add(z);
		bag.add(z);
		System.out.println(bag.size());
		bag.remove(z);
		System.out.println(bag.size());
		
	}
}

