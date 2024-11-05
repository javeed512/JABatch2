package decorator;

public class DecoratorDPExample {

	public static void main(String[] args) {

			Shape rectangle = new Rectangle();
			
			Shape redRectangle = new RedShapeDecorator(new Rectangle());
		      System.out.println("Rectangle with normal border");
		      rectangle.draw();

		      System.out.println("\nRectangle of red border");
		      redRectangle.draw();
	}
			
}
