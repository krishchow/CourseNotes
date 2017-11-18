import java.util.ArrayList;

public class PlayWithShapes {

	public static void main(String[] args) {
		// Shape s = new Shape(3, 4);
		// System.out.println(s);
		
		// NOTE: You cannot instantiate an abstract class!
		// How would toString work?? getArea does not have a body yet!
		
		Circle c = new Circle(0, 0, 5);
		//System.out.println(c); // which toString is called here?
		
		Shape c2 = new Circle(0, 0, 10); // OK!
		//System.out.println(c2); // which toString will be called?
		
		// Because I am acting like a parent,
		// I can only do things my parent can do!
		//c2.setRadius(6);
		// System.out.println(c2);
		
		// If I cast to Circle:
		((Circle)c2).setRadius(6);
		//System.out.println(c2);
		
		Rectangle r = new Rectangle(3, 4, 5, 6);
		Rectangle r2 = new Rectangle(0, 0, 50, 60);
				
		// Polymorphism
		// one object has many forms
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(c);
		shapes.add(c2);
		shapes.add(r);
		shapes.add(r2);
		
//		int[] array = new int[5];
//		for (int x: array) {
//			System.out.println(x);
//		}
		
		for (Shape s: shapes) {
			System.out.println(s);
		}
		
	}
}
