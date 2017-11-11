package Shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 * @author Raymond Cheung Edited 10/21/2017
 */

public class ShapeUtilities {

    /**
     * Creates a random shape from the choices.
     * @return Shape
     * Student Work: Update with your own shape.
     */
    public static Shape randomShape()
    {
        Random rand = new Random();
        int x = rand.nextInt(4);

        switch (x) 
        {
            case 0:
                return new Circle(rand.nextInt(100) +1);
            case 1:
                return new Rectangle(rand.nextInt(50) +1, rand.nextInt(50) +1);
            case 2:
                return new Square(rand.nextInt(50) +1);
            case 3:
                return new Triangle(rand.nextInt(50) +1 ,rand.nextInt(50) +1 ,rand.nextInt(50) +1);
            default:
                return new Circle(rand.nextInt(100) +1);
        }
    }
    
    /**
     * adds up the area of all the shapes in the array
     * @param shapes
     * @return double
     */
    public static double sumArea(Shape [] shapes)
    {
		double result = 0;
		for (int i = 0; i < shapes.length; i ++) {
			result += shapes[i].calculateArea();
		}
		return result;
    }

    /**
     * adds up the perimeter of all the shapes in the array
     * @param shapes
     * @return double
     */
    public static double sumPerimeter(Shape[] shapes)
    {
		double result = 0;
		for (int i = 0; i < shapes.length; i ++) {
			result += shapes[i].calculatePerimeter();
		}
		return result;
    }

}
