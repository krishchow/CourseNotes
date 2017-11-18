
public class Rectangle extends Shape {

	private int width;
	private int height;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Drawing a Rectangle at (" + this.getX() + ", " + this.getY() + ") with " + super.toString();
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}
}
