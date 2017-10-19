package shapes;

/**
 * @author Raymond Cheung
 * Created 10/16/2017
 * Lab 2.1 shapes
 *
 */

public class Square extends Rectangle {
	
    double side;

    public Square(int side)
    {
        super(side,side);
        this.side = side;
    }

    @Override
    public String toString()
    {
        return "Square side length: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }

}
