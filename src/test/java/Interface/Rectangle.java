package Interface;

public class Rectangle 
{
private double length;
private double width;
public Rectangle(double length,double width)
{
	this.length = length;
	this.width = width;
}
public void draw() {
	System.out.println("DRawing rect");
}
public double getArea() {
	return 10.5*15.5;
}
}

