package Interface;

public class Circle implements Shape
{
private double radius;
public Circle (double radius)
{
	this.radius =radius;
}
public void draw() 
{
	System.out.println("Drawaing Circle");
}
public double getArea() {
	return pi*radius*radius;
}

}

