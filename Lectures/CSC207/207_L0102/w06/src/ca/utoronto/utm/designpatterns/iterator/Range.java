package ca.utoronto.utm.designpatterns.iterator;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

	int min, max, step;
	public Range(int min, int max, int step){
		this.min=min;
		this.max=max;
		this.step=step;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new RangeIterator(min, max, step);
	}

}
