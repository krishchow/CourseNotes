/** 
 * Source: http://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 */

// To implement this interface, the name of your class would change (to a particular brand of bicycle, 
// for example, such as ACMEBicycle), and you'd use the implements keyword in the class declaration:

// Implementing an interface allows a class to become more formal about the behavior it promises to provide. 
// Interfaces form a CONTRACT between the class and the outside world, and this contract is enforced at 
// build time by the compiler. If your class claims to implement an interface, all methods defined 
// by that interface must appear in its source code before the class will successfully compile.

public class ACMEBicycle implements Bicycle {

	int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }



    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }

	@Override
    public void speedUp(int increment) {
        speed = speed + increment;   
   }
}
