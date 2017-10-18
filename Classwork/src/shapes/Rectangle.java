package shapes;
/**
 * @author Mr Levin
 * Created 10/16/2017
 * Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape{
	
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
		return length * width;
    }

    @Override
    public double calculatePerimeter() {
		return 2 * (length + width);
    }

    @Override
    public String toString()
    {
        return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }
}

