package ca.utoronto.utm.shapes;
// Author: Arnold Rosenbloom Lecturer U of T Mississauga

// Exercise, Modify Square so that it extends Rectangle 
import java.awt.*;
public class Square extends Shape {
	
	// Should we make Square a subclass of Rectangle? 
	// Liskov Substitution Principle suggests an answer...
	// http://lostechies.com/derickbailey/files/2011/03/LiskovSubtitutionPrinciple_52BB5162.jpg

	private int width;

    // Create a blue Square with width 10, position 100,100
    public Square(){ this(Color.blue, 10, 100, 100); }

	public Square(Color c,int width, int x, int y){
		super(c,x,y);
		setWidth(width);
	}

	// getters and setters
	public void setWidth(int w){
		if(w>0)width=w;
		notifyObserver();
	}

	public int getWidth(){ return width; }

	// Return a String representation of this object
	public String toString(){
		String s=super.toString()+" Width: "+getWidth();
		return(s);
	}

	// A Square knows how to graphically represent itself
	public void display(Graphics g){
		g.setColor(getColor());
		g.fillRect(getX()-width/2,getY()-width/2,width,width);
	}
}
