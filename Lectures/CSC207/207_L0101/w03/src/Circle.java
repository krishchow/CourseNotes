
// Two things I can do:
// - implement ALL the things Shape's abstract class has
// - Circle also an abstract class
public class Circle extends Shape {

	private double radius;
	
	public Circle(int x, int y, double r) {
		super(x, y);
		this.radius = r;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	// I only exist for Circles
	public void setRadius(double r) {
		this.radius = r;
	}
	
	@Override
	public String toString() {
		return "Drawing a Circle at (" + this.getX() + ", " + this.getY() + ") with radius: " + this.radius + " and " + super.toString();
	}
}
