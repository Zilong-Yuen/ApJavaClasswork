package shape;

import Shape.Shape;

public class Rectangle implements Shape
{
	private double length;
	private double width;
	
	public double Perimeter()
	{
		return(length * 2 + width * 2);
	}
	
	public Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	
	public double Area()
	{
		return(length * width);
	}
	
	public String toString() 
	{	
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.Area() + " Perimeter: "
				+ this.Perimeter();
	}
}
