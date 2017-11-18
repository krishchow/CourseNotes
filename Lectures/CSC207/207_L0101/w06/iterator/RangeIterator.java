package iterator;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {

	private int next, step, max;
	
	public RangeIterator(int min, int max, int step) {
		this.next = min;
		this.max = max;
		this.step = step;
	}
	
	@Override
	public boolean hasNext() {
		return this.next < this.max;
	}

	@Override
	public Integer next() {
		// use step to figure out the next value
		int curr = this.next;
		this.next = curr + this.step;
		return curr;
	}

}
