/**

Create a concrete (non-abstract) class called 
Cat which inherits from Animal.

public Cat(String name)

By default, cats make the sound "meow".

They have a cat-specific method called "purr" that 
prints out "[name] says purrrrr".

When a cat walks, it prints out 
"LOL. no. sleeping."

**/

// MAIN ISSUES:
// - remember to call super(..) to use the constructor from Parent class

public class Cat extends Animal {

	public Cat(String name) {
		super(name, "meow");
	}

	public Cat(String name, String sound) {
		super(name, sound);
	}
	
	
	public static void purr() {
		System.out.println();
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub	
	}

}

