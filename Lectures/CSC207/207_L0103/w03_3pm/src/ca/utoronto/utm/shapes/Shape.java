package ca.utoronto.utm.shapes;
// Author: Arnold Rosenbloom Lecturer U of T Mississauga
import java.awt.*;

/**
* A Shape is a Subject (so can be observed)
* it has a position and a color (all of which can be modified).
*/

public abstract class Shape extends Subject {

	private int x,y; // position of the shape
	private Color color;
	
	/**
	* Initialize a new Shape with specified Color and position
	*
	* @param     c  the desired color
	* @param     x  the desired x coordinate
	* @param     y  the desired x coordinate
	*/
	public Shape(Color c, int x, int y){
		setPosition(x,y);
		setColor(c);
	}

	/**
	* Set the position of this and then notify our observers
	*
	* @param x the new x coordinate
	* @param y the new x coordinate
	*/
	public void setPosition(int x, int y){
		this.x=x; this.y=y;
		notifyObserver();
	}

	/**
	* Set the x coordinate of this and notify our observers
	*
	* @param x the new x coordinate
	*/
	public void setX(int x){ setPosition(x,y); }

	/**
	* Set the y coordinate of this and notify our observers
	*
	* @param y the new y coordinate
	*/
	public void setY(int y){ setPosition(x,y); }

	/**
	* Set the Color of this and notify our observers
	*
	* @param c the new Color
	*/
	public void setColor(Color c){
		color=c;
		notifyObserver();
	}

	/**
	* @return the x coordinate of this
	*/
	public int getX(){ return x; }

	/**
	* @return the y coordinate of this
	*/
	public int getY(){ return y; }

	/**
	* @return the Color of this
	*/
	public Color getColor(){ return color; }

	/**
	* @return a String representation of this
	*/
	public String toString(){
		String s="Color:"+color+" ("+x+","+y+")";
		return(s);
	}

	/**
	* display this using the given pen
	*
	* @param g the pen we use to display this
	*/
	public void display(Graphics g){
		g.setColor(color);
	}
}
