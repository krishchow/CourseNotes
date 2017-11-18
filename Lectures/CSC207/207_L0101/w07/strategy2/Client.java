package strategy2;

public class Client {

	public static void main(String[] args) {
		
		Person p = new Person("Bob", "Unicorn Land");
		
		TravelContext ctx = new TravelContext();
		ctx.setTravelStrategy(new UnicornRideStrategy());
		
		// Bob wants to take a trip to Neverland
		ctx.takeTrip(p, "Neverland");
	}
}
