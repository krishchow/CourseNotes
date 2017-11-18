package ca.utoronto.utm.designpatterns.observer;

public class LightBulbObserver2 extends Observer {
	private int numTimesChanged = 0;
	@Override
	public void update() {
		this.numTimesChanged++;
		System.out.println("Total number times changed="+this.numTimesChanged);
	}
}
