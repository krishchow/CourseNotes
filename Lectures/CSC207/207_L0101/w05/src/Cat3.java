import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Cat3 extends Animal2 implements Comparable<Cat3> {

	private final static String DEFAULT_SOUND = "meow";
	
	public Cat3(String name) {
		super(name, DEFAULT_SOUND);
	}

	public Cat3(String name, String sound) {
		super(name, sound);
	}
	
	public static void purr() {
		System.out.println();
	}
	
	@Override
	public void walk() {
		System.out.println("LOL no sleeping");
	}

	@Override
	public int compareTo(Cat3 o) {
		// compareTo will return a negative integer, zero, or a positive integer 
		// as this object is less than, equal to, or greater than the specified object
		
		return this.getName().compareToIgnoreCase(o.getName());
	}
	
	public static void main(String[] args) {
		Cat3 c = new Cat3("Kyoko");
		Cat3 c2 = new Cat3("Simba");
		Cat3 c3 = new Cat3("Lynx");
		
		if (c.compareTo(c2) < 0) {
			System.out.println("Kyoko comes before Simba");
		} else if (c.compareTo(c2) > 0 ){
			System.out.println("Simba comes before Kyoko");			
		} else {
			System.out.println("equal");
		}
		
		ArrayList<Cat3> myCats = new ArrayList<Cat3>();
		myCats.add(c);
		myCats.add(c2);
		myCats.add(c3);
		Collections.sort(myCats);
		System.out.println(myCats);
		
		System.out.println(Collections.max(myCats));
	}

}