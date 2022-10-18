import java.util.*;

interface IShape
{
	
	Scanner sc=new Scanner(System.in);
	public void getData();
	public void calArea();
	public void showArea();
}

class Rectangle implements IShape
{
	double length,breadth,area;
	public void getData()
	{
		System.out.print(" Enter Length & Breadth :");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	public void calArea()
	{
		area=length*breadth;
	}
	
	public void showArea()
	{
		System.out.println(" Area of Rectangle = "+area);
	}
}

class Square implements IShape
{
	double side,area;
	public void getData()
	{
		System.out.print(" Enter Side :");
		side=sc.nextDouble();
	}
	public void calArea()
	{
		area=side*side;
	}
	
	public void showArea()
	{
		System.out.println(" Area of Square = "+area);
	}
}

class Circle implements IShape
{
	double radius,area ;
	
	public void getData()
	{
		System.out.print(" Enter Radius :");
		radius=sc.nextDouble();
	}
	public void calArea()
	{
		area=3.14*radius*radius;
	}
	
	public void showArea()
	{
		System.out.println(" Area Circle = "+area);
	}
}

class IShapeHandler
{
	public static void main(String[] args)
	{
		
		Rectangle r=new Rectangle();
		r.getData();
		r.calArea();
		r.showArea();
		
		Square s=new Square();
		s.getData();
		s.calArea();
		s.showArea();
		
		Circle c=new Circle();
		c.getData();
		c.calArea();
		c.showArea();
	}
}