package Shape;

public class Circle implements Shape{
	private double radius;
	public static double pi = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * pi * radius;
	}
	public double area() {
		return pi * radius * radius;
	}
    @Override
    public String toString()
    {
        //to be implemented by student
    }
}
