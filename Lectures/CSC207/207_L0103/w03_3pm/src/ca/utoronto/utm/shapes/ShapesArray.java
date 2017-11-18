package ca.utoronto.utm.shapes;
import java.awt.*;
public class ShapesArray {
	public static void main(String [] args){
		Shape [] ca; // ca is a Reference to an array of Reference to Shape
		ca=new Shape[30]; // ca now references an array of References to Shape
		// 0 Shapes exist so far
		for(int i=0;i<10;i++){
			ca[i]=new Circle(Color.blue, i, i*10, i*10);
			ca[10+i]=new Square(Color.red, i, i*10+50, i*10);
			ca[20+i]=new GString(Color.black, "Hi "+i, i*10+100, i*10+100);
		}
		moveShape(ca, 100, 200);    
	}

	/**
	 * Move all Shapes in array
	 *
	 * @param a Array of reference to Circle
	 * @return nothing
	 */
	public static void moveShape(Shape [] a, int dx, int dy){
		for(int i=0;i<a.length;i++){
			a[i].setX(a[i].getX()+dx);
			a[i].setY(a[i].getY()+dy);
		}
		return; // return nothing!!
	}
}

