/**
Create an abstract class for an Animal.

All Animals have a name, and a sound that 
they can make (e.g. "moo", "meow").

All Animals can makeNoise which prints 
out "[name] says [sound]".

All Animals can makeNoise2 which returns 
the String "[name] says [sound]".

All Animals should be able to walk.
(this will be an abstract method; different for
every animal)
**/

// MAIN ISSUES:
// - remember to have a constructor
// - if a method behaves the same way for ALL children classes, implement it here to avoid repeated code
//			e.g. getters, setters
// - print vs. return (different return values)

public abstract class Animal {
	
	private String name, sound;
	
	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public void makeNoise() {
		System.out.println(this.name + " says " + this.sound);
	}
	
	public String makeNoise2() {
		return (this.name + " says " + this.sound);
	}
	
	
	public abstract void walk();

}