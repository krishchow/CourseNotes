
public class Cat2 extends Animal2 {

	private final static String DEFAULT_SOUND = "meow";
	
	public Cat2(String name) {
		super(name, DEFAULT_SOUND);
	}

	public Cat2(String name, String sound) {
		super(name, sound);
	}
	
	
	public static void purr() {
		System.out.println();
	}
	
	@Override
	public void walk() {
		System.out.println("LOL no sleeping");
	}

}

