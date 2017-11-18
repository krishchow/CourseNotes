package ca.utoronto.utm.shapes;
// Author: Arnold Rosenbloom Lecturer U of T Mississauga

import java.awt.*;

/**
* A GString (Graphical String) is a Shape. 
* GStrings have all methods and attributes of Shape
* and then some more.
*/

public class GString extends Shape {

	private String text="";

	/**
	* Initialize a new GString with specified Color, text and position
	*
	* @param     c  the desired color
	* @param     text  the desired text
	* @param     x  the desired x coordinate
	* @param     y  the desired x coordinate
	*/
	public GString(Color c, String text, int x, int y){
		super(c,x,y);
		setText(text);
	}

	/**
	* Set the text of this and tell our observer that we have changed
	*
	* @param     t  the desired text
	* @return    nothing
	*/
	public void setText(String t){
		if(t!=null)text=t;
		notifyObserver();
	}

	/**
	* @return    the text of this
	*/
	public String getText(){ return text; }

	/**
	* @return    a String representation of this
	*/
	public String toString(){
		String s=super.toString()+" Text: "+getText();
		return(s);
	}

	/**
	* produce a graphical representation of this
	*
	* @param g the pen we use to display this
	*/
	public void display(Graphics g){
		if(text!=null){
			g.setColor(getColor());
			g.drawString(text,getX(),getY());
		}
	}
}
