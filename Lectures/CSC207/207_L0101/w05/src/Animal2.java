public abstract class Animal2 {
	
	private String name, sound;
	
	public Animal2(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public void makeNoise() {
		System.out.println(this.name + " says " + this.sound);
	}
	
	public String makeNoise2() {
		return (this.name + " says " + this.sound);
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void walk();
	
	public String toString() {
		return name;
	}

}