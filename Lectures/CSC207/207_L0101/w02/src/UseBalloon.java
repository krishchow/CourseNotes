
public class UseBalloon {

	public static void main(String[] args) {
		// since getNumBalloons is a static method, I can call this even before
		// I create any Balloon instances
		System.out.println(Balloon.getNumBalloons());
		Balloon b = new Balloon();
		// I can call it again after I create a Balloon instance
		System.out.println(Balloon.getNumBalloons());
		
		// Example of aliasing 1
//		Balloon b3;
//		b3 = b1; // refers to same object
//		b3.setColor("dark green"); // this is going to change both b1 and b3's color
//		
//		System.out.println(b1);
//		System.out.println(b3);
		
		// Example of aliasing 2 - see if you understand what is happening here
		Balloon b1 = new Balloon("green");
		Balloon b2 = new Balloon("red");
		
		Balloon b3;
		b3 = b1;
		b1 = b2;
		b2 = b3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
