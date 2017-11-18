package ca.utoronto.utm.shapes;
// Author: Arnold Rosenbloom Lecturer U of T Mississauga
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicObserver extends Observer {
	private JFrame frame; // Has a Frame and panel to draw on

	public static GraphicObserver observer=new GraphicObserver();

	public static void main(String [] args){
		GraphicObserver go=new GraphicObserver();
		Circle c1=new Circle(Color.red, 25, 100,100);
		c1.attachObserver(go);

		Circle c2=new Circle(Color.green, 25, 50,50);
		c2.attachObserver(go);

		Square s1=new Square(Color.blue, 35, 100,150);
		s1.attachObserver(go);

		Rectangle r1=new Rectangle();
		// r1.attachObserver(go);

		GString gs1=new GString(Color.yellow, "Hi THERE!!", 150,100);
		// gs1.attachObserver(go);

	}

	public GraphicObserver(){ 
		frame=new JFrame();
		/*
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GraphicObserverPanel(this));
		frame.setSize(400,400);
		frame.setVisible(true);
	}

	// Update my view of the subjects I see
	public void update(){ 
		frame.repaint(); 
		// Above causes the GraphicObserverPanel to repaint
	}
}
