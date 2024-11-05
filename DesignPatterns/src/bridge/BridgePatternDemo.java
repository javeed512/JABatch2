package bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {


		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		
			redCircle.draw();
		
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

			greenCircle.draw();
		
	}

}
