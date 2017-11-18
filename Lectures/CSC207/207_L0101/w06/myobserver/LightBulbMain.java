package myobserver;

public class LightBulbMain {

	public static void main(String[] args) {
		LightBulb lb1=new LightBulb();
		LightBulb lb2=new LightBulb();
		LightBulb lb3=new LightBulb();
		
		LightBulbObserver1 lbo1 = new LightBulbObserver1();
		LightBulbObserver2 lbo2 = new LightBulbObserver2();
		
		lb1.attach(lbo1); // switch
		lb1.attach(lbo2); // flip
		
		lb2.attach(lbo1); // switch
		
		lb1.turnOn();
		
		lb1.turnOff();
		
		lb1.turnOff();
		
		//lb2.flip();
		//lb3.flip();
		
		// Question: What if I would like to know who told me
		// to update? In this case, we would do something like 
		// Java's Observer/Observable
		
	}

}
