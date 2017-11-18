package strategy2;

public class TravelContext {

	private TravelStrategy chosenStrategy;
	
	public void setTravelStrategy(TravelStrategy s) {
		chosenStrategy = s;
	}
	
	public void takeTrip(Person p, String location) {
		chosenStrategy.travel(p, location);
	}
 	
}
