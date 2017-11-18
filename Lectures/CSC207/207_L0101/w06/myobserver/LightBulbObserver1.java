package myobserver;

public class LightBulbObserver1 implements MyObserver {

	private int numTimesSwitched = 0;
	@Override
	public void update() {
		this.numTimesSwitched++;
		System.out.println("Total number of switches ="+this.numTimesSwitched);
	}
}
