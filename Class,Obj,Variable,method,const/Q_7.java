import java.util.*;
interface Shape
{
	void findArea();
}
class Circle implements Shape
{
	double radius;
	double circlearea;
	Circle(double radius)
	{
		this.radius = radius;
	}
	public void findArea(){
		circlearea = 3.14 * radius * radius;
		System.out.println("Area of Circle=> "+circlearea);
	}
}
class Rectangle implements Shape
{
	int length,breadth;
	int rectarea;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void findArea(){
		rectarea = length * breadth;
		System.out.println("Area of Rectangle is => "+rectarea);
	}
}
class Square implements Shape
{
	int side;
	int sqrarea;
	
	Square(int side)
	{
		this.side = side;
	}
	public void findArea()
	{
		sqrarea = side * side;
		System.out.println("Area of Square is=> "+ sqrarea);
	}
}
public class Q_7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double radius;
		int length,breadth;
		int side;
		System.out.println("Enter the radius of Circle=> ");
		radius = sc.nextDouble();
		Circle c1 = new Circle(radius);
		c1.findArea();
		
		System.out.println("Enter the Length and Breadth of Rectangle=> ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		Rectangle r1 = new Rectangle(length, breadth);
		r1.findArea();
		
		System.out.println("Enter the side of Square=> ");
		side = sc.nextInt();
		Square s1 = new Square(side);
		s1.findArea();
		
	}
}