package ca.utoronto.utm.designpatterns.composite;

public class UseOdometer {

	public static void main(String[] args) {
		AODigit odometer=new OEnd();
		odometer = new ODigit(odometer,3);
		odometer = new ODigit(odometer,3);
		odometer = new ODigit(odometer,3);
		odometer = new ODigit(odometer,3);
		
		for(int i=0;i<123;i++){
			odometer.increment();
			System.out.println(odometer.display());
		}
		for(int i =0;i<20;i++){
			odometer.decrement();
			System.out.println(odometer.display());
		}
	}

}
