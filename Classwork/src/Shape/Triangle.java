package Shape;

public class Triangle implements Shape{
	private double a;
	private double base;
	private double c;
	private double height;
	
	public Triangle(double a, double base, double c, double height) {
		this.a = a;
		this.base = base;
		this.c = c;
		this.height = height;
	}
	
	public double perimeter() {
		return a + base + c;
	}
	public double area() {
		return (base * height)/2;
	}

}
