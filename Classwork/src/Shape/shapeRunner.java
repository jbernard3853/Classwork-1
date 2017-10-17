package Shape;
public class shapeRunner {

		
		public static void main (String[] args) {
			Rectangle rect = new Rectangle(5,3);
			Circle circ = new Circle(3);
			Square sqr = new Square(100);
			Triangle tri = new Triangle(10,10,10,5);
			if (rect.area() > circ.area()) {
				System.out.println("Larger area: Rectangle");
			}
			else {
				System.out.println("Larger area: Circle");
			}
			if (rect.perimeter() > circ.perimeter()) {
				System.out.println("Larger perimeter: Rectangle");
			}
			else {
				System.out.println("Larger perimeter: Circle");
			}
			System.out.println(sqr.area());
			System.out.println(shapeUtilities.getrandomShape().area());
			System.out.println(tri.area());
		}
	}

