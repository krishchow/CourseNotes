package myobserver;

public class LightBulbObserver2 implements MyObserver {
	@Override
	public void update() {
		System.out.println("Something has flipped");
	}
}
