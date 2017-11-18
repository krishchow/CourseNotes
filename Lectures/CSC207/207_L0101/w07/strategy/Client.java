package strategy;

public class Client {
	
	  public static void main(String[] args) {

		    TravelContext ctx = new TravelContext();
		    
		    ctx.setTravelStrategy(new BusStrategy());
		    
		    ctx.takeTrip(new Person("Sadia", "Canada"), "Australia");

	  }
}
