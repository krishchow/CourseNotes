package ca.utoronto.utm.shapes;
import java.awt.Graphics;

// Author: Arnold Rosenbloom Lecturer U of T Mississauga
import javax.swing.JPanel;

public class GraphicObserverPanel extends JPanel {
	private GraphicObserver go;
	public GraphicObserverPanel(GraphicObserver go){ 
		this.go=go; 
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g); // Paint background
		for(Subject e: go.getSubjects()){
			Shape s = (Shape)e;
			s.display(g);
		}
	}
}
