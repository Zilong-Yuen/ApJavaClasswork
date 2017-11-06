package shape;

public class Triangle implements Shape
{	
	private double side1;
	private double side2;
	private double side3;

public double Perimeter()
{
	return (side1 + side2 + side3);
}

public double Area()
{
	double s=0;
	s = (side1 + side2 + side3)/2;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}

public String toString()
{
	return "Perimeter: " + this.Perimeter() + " Area: " + this.Area();
}
}