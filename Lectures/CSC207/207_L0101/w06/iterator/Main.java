package iterator;

import java.util.Iterator;

/**
 * 
 * For the Iterator design pattern, you need:
 * 1. An Iterable object which includes an iterator() method that returns an instance of its Iterator
 * 2. An Iterator which includes next() and hasNext(), and goes through the elements in
 *    the above object
 *    
 */

public class Main {

	public static void main(String[] args) {
		
		Range r = new Range(0, 10, 2);
		
		Iterator<Integer> ri = r.iterator();
		
		while (ri.hasNext()) {
			System.out.println(ri.next());
		}
		
		for (Integer i: r) {
			System.out.println(i);
		}

	}
	
}
