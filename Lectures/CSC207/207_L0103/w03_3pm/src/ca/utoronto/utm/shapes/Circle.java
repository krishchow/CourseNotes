package ca.utoronto.utm.shapes;
import java.awt.*; // So we don't have to type in java.awt.Color!!

// Author: Arnold Rosenbloom Lecturer U of T Mississauga
/**
* A Circle is a Shape. Circles have all methods and attributes of Shape
* and then some more.
*/
public class Circle extends Shape {

	private int radius;

	/**
	* Initialize a red circle with radius 10, position 100,100
	*/
	public Circle(){ this(Color.red, 10, 100, 100); }

	/**
	* Initialize a new circle with specified Color, radius and position
	*
	* @param     c  the desired color
	* @param     r  the desired radius
	* @param     x  the desired x coordinate
	* @param     y  the desired x coordinate
	*/
	public Circle(Color c,int radius, int x, int y){
		super(c,x,y); // Tell the Shape
		setRadius(radius);
	}

	/**
	* Set the radius of this circle and 
	* tell our observer that we have changed
	*
	* @param     r  the desired radius
	* @return    nothing
	*/
	public void setRadius(int r){
		if(r>0)radius=r;
		notifyObserver();
	}

	/**
	* @return    the radius of this
	*/
	public int getRadius(){ return radius; }

	/**
	* @return    a String representation of this
	*/
	public String toString(){
		String s=super.toString()+" Radius: "+getRadius();
		return(s);
	}

	/**
	* produce a graphical representation of this
	*
	* @param g the pen we use to display this
	*/
	public void display(Graphics g){
		g.setColor(getColor());
		g.fillOval(getX()-radius,getY()-radius,2*radius,2*radius);
	}
}
