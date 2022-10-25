class Shape
{
	double height,width;
	
	public void setValue(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getHeight(){
		return height;
	}
	public double getWidth()
	{
		return width;
	}
}
class Rectangle extends Shape
{
	double getArea()
	{
		return height*width;
	}
}
class Triangle extends Shape
{
	double getArea(){
		return (height*width)/2;
	}
	
}
class ShapeDemo
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.setValue(12.0,13.0);
		System.out.println("Height -> "+r1.getHeight());
		System.out.println("width -> "+r1.getWidth());
		System.out.println("Area of rectangle -> "+r1.getArea());
		System.out.println("--------------------------------");
		
		Triangle t1 = new Triangle();
		t1.setValue(4.4,6.6);
		System.out.println("Height of Triangle -> "+t1.getHeight());
		System.out.println("Base of Triangle -> "+t1.getWidth());
		System.out.println("Area of Triangle -> "+t1.getArea());
	}
}
