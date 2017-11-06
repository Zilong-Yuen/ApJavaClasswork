package shape;

import shape.Shape;

public class Circle implements Shape
{
	private double radius;
	private static double pi = 3.14;
	public Circle(double rad)
	{
		this.radius = rad;
	}
	
	public double Perimeter()
	{
		return((radius * 2) * pi);
	}
	
	public double Area()
	{
		return((radius * radius) * pi);
	}
	
	public String toString() 
	{	
		return "Radius: " + radius + " Area: " + this.Area() + " Circumfrence: "
				+ this.Perimeter();
	}
}
