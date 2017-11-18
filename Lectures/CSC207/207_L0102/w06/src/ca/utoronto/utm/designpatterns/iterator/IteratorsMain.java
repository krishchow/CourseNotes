package ca.utoronto.utm.designpatterns.iterator;
import java.util.*;

// http://www.oodesign.com/iterator-pattern.html
// But we implement the Java specific 
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html

public class IteratorsMain {
	// Exercises: 
	// An ihttps://docs.oracle.com/javase/8/docs/api/java/util/Iterator.htmlterator like Range(min, max, step)
	// An iterator for all integers
	// An iterator for all pairs of natural numbers
	
	public static void main(String [] args){
		
		// Demo using api
		// 
		Range r = new Range(0,10,1);
		
		Iterator<Integer> ri = r.iterator();
		while(ri.hasNext()){
			int j=ri.next();
			System.out.println(j);
		}
		
		Range r2 = new Range(10,50,3);
		for(int i:r2){
			System.out.println(i);
		}

		Range r3 = new Range(0,10,1);
		for(int i:r3){
			System.out.println(i);
		}
		
		for(int i:r3){
			for(int j:r3){
				System.out.println(i+" "+j);
			}
		}
		
		AllIntegers ai = new AllIntegers();
		for(int i:ai){
			System.out.println(i);
		}
	}
}
