package Shape;

import java.util.Random;

public class shapeUtilities {
	public static Shape getrandomShape() {
		Random r = new Random();
		int x = r.nextInt(3);
		
		switch (x){
			case 0: 
					return new Circle(r.nextInt(100)+1);
			case 1:
					return new Rectangle(r.nextInt(100)+1,r.nextInt(100)+1);
			case 2:
					return new Square (r.nextInt(100)+1);
			default:
				return new Circle(r.nextInt(100)+1);
		}
	}

	public static double sumPerimeter(Shape [] shapeArr) {
		double result = 0;
		for (int i = 0; i < shapeArr.length; i ++) {
			result += shapeArr[i].perimeter();
		}
		return result;
	}
	
	public static double sumArea(Shape [] shapeArr) {
		double result = 0;
		for (int i = 0; i < shapeArr.length; i ++) {
			result += shapeArr[i].area();
		}
		return result;
	}
}

