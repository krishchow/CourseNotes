package ca.utoronto.utm.designpatterns.iterator;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer>{

	private int min, max, step, current;
	
	public RangeIterator(int min, int max, int step){
		this.min = min;
		this.max = max;
		this.step=step;
		this.current=min; // the next value to return
	}
	
	@Override
	public boolean hasNext() {
		return this.current<this.max;
	}

	@Override
	public Integer next() {
		int previous = this.current;
		this.current+=this.step;
		return previous;
	}
}
