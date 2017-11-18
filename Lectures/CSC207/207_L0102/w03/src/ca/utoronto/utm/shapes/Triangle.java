package ca.utoronto.utm.shapes;
import java.awt.Color;
import java.awt.Graphics;
public class Triangle extends Shape {

	// Liskov Substitution Principle suggests an answer...
	// http://lostechies.com/derickbailey/files/2011/03/LiskovSubtitutionPrinciple_52BB5162.jpg

	private int x1, y1, x2, y2, x3, y3;

    // Create a blue Square with width 10, position 100,100
    public Triangle(){ this(Color.blue, 100, 100, 0, 0, 30, 0, 0, 50); }

	public Triangle(Color c, int x, int y, int x1, int y1, int x2, int y2, int x3, int y3){
		super(c,x,y);
	}

	// Return a String representation of this object
	public String toString(){
		// Exercise: Figure out a 
		String s="";
		return(s);
	}

	// A Square knows how to graphically represent itself
	public void display(Graphics g){
		g.setColor(getColor());
		// Exercise: add in features to draw the triangle.
		// type g. to see what Graphics can do
	}
}