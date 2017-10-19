package shapes;

public class Parallelogram implements Shape {
	
	private double a;
	private double base;
	private double height;
	
	public Parallelogram(double a, double base, double height) {
		this.a = a;
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return base * height;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (a+base);
	}
	
    public String toString()
    {
        return "Parallelogram Side Length: " + a + "Parallelogram Base: " + base + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }

}
