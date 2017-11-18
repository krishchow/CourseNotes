package ca.utoronto.utm.designpatterns.observer;

public class LightBulbObserver1 extends Observer {
	@Override
	public void update() {
		System.out.println("Something Changed");
	}
}
