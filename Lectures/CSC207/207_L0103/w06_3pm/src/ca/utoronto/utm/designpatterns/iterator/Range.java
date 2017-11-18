package ca.utoronto.utm.designpatterns.iterator;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

	private int start, stop, step;
	public Range(int start, int stop, int step){
		this.start=start;
		this.stop=stop;
		this.step=step;
	}
	@Override
	public Iterator iterator() {
		return new RangeIterator(this.start, this.stop, this.step);
	}

}