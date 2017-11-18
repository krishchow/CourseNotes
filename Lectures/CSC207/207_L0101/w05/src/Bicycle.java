/** 
 * Source: http://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 */

// an interface is a group of related methods with empty bodies
// a bicycle's behaviour, if specified as an interface, might appear as follows:

interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
