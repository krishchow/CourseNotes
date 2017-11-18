package ca.utoronto.utm.shapes;
/**
 * Notice that I have declared all of Rectangle, Observer, Shape, Square, ...
 * as part of a package. A package is a collection of classes
 * that work together to get something done.
 * 
 * Notice that Notes.java is in both packages in the same
 * project. The full class name for this one is 
 * 
 * ca.utoronto.utm.shapes.Notes
 * 
 * 
 * The package name is supposed to be universally unique.
 * The standard naming convention is to use the reverse of your domain as part of the package name.
 * 
 * See also additional protections associated with packages.
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * 
 * Modifier 	Class 	Package 	Subclass 	World
 * public 	      Y 	Y 	          Y 	    Y
 * protected 	  Y 	Y 	          Y        	N
 * no modifier 	  Y 	Y 	          N      	N
 * private 	      Y 	N        	  N      	N
 * @author arnold
 *
 * Should we make Square a subclass of Rectangle? 
 * Liskov Substitution Principle suggests an answer...
 * http://lostechies.com/derickbailey/files/2011/03/LiskovSubtitutionPrinciple_52BB5162.jpg
 * 
 * Search for methods/variables starts at the current class
 * and works it's way up the hierarchy.
 * 
 * super is used to start the search one level up the hierarchy
 * 
 * Java expects that you only should know about your super class, not
 * the whole hierarchy above it.
 *
 */
public class Notes {

}
