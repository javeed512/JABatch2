package abstractfactory;

public class AFDesingPatternDemo {

	public static void main(String[] args) {


		AbstractFactory shapeFactory =	FactoryProducer.getFactory(false);
		
			Shape shape1 =	shapeFactory.getShape("RECTANGLE");
			Shape shape2 =	shapeFactory.getShape("SQUARE");
			
			// call draw() to draw rectangle
			
			shape1.draw();
			shape2.draw();
			
			
			AbstractFactory roundedShapeFactory =	FactoryProducer.getFactory(true);
			
			Shape shape3 =	roundedShapeFactory.getShape("RECTANGLE");
			Shape shape4 =	roundedShapeFactory.getShape("SQUARE");
			
			shape3.draw();
			shape4.draw();

	}

}
