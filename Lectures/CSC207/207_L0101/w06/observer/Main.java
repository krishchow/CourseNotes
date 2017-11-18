package observer;

public class Main {

    public static void main(String[] args) {

    	Customer sadia = new Customer("Sadia");
    	Parcel order = new Parcel("ASDF", "Mississauga");
    	
    	order.addObserver(sadia);
    	order.updateLocation("Toronto");

    }
}
