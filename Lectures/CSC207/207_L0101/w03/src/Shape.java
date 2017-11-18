/** 
 * Abstract class that tells me
 * everything that any Shape object should have
 * 
 * @author sadiasharmin
 *
 */
public abstract class Shape {

	// we could have these as protected
	// if we want our children to be able to do things like
	// this.x 
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// abstract methods
	// methods that do not have a body
	public abstract double getArea(); // no {} 
	public abstract double getPerimeter();
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	
	public String toString() {
		return "Area: " + this.getArea() + ", Per: " + this.getPerimeter();
	}
}
