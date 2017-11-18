package composite2;

import java.util.ArrayList;

public class CompositeGraphic implements GraphicComponent {

	ArrayList<GraphicComponent> graphics = new ArrayList<>();
	// Should the type of this list be:
	// A. SimpleGraphic
	// B. CompositeGraphic
	// C. GraphicComponent
	// D. None of the Above

	@Override
	public void paint() {
		for (GraphicComponent g: graphics) {
			g.paint();
		}
	}
	
	public void add(GraphicComponent g) {
		graphics.add(g);
	}
	
	public void remove(GraphicComponent g) {
		graphics.remove(g);
	}
	
}
