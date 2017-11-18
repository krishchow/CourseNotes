package composite2;

public class Client {

	public static void main(String[] args) {
		
		SimpleGraphic graphic1 = new SimpleGraphic();
		SimpleGraphic graphic2 = new SimpleGraphic();
		SimpleGraphic graphic3 = new SimpleGraphic();
		SimpleGraphic graphic4 = new SimpleGraphic();
		
		CompositeGraphic graphicGroup1 = new CompositeGraphic();
		CompositeGraphic graphicGroup2 = new CompositeGraphic();
		
		graphicGroup1.add(graphic1);
		graphicGroup1.add(graphic2);
		graphicGroup1.add(graphic3);
		
		graphicGroup2.add(graphic4);
		
		CompositeGraphic mainGroup = new CompositeGraphic();
		mainGroup.add(graphicGroup1);
		mainGroup.add(graphicGroup2);
		
		// What would the output of this be?
		mainGroup.paint();

	}
}
