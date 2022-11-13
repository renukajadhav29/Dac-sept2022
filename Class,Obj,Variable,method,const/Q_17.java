//Java Program to Illustrate Use of Constructor
class Triangle
{
	int height,base,area,hypotenus_sqr;
	Triangle()
	{
		//temperary default values
		height = 0;
		base = 0;
		area = 0;
		hypotenus_sqr = 0;
	}

	Triangle(int height,int base)
	{
		this.height = height;
		this.base = base;
		area = (height * base)/2;
		hypotenus_sqr = (height * height) + (base * base);

	}

	void display()
	{
		System.out.println("Height : "+height);
		System.out.println("Base : "+base);
		System.out.println("Hypotenus_sqr of Triangle : "+hypotenus_sqr);
		System.out.println("Area of Triangle : "+area);
	}

}
class Q_17
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		t1.display();
		Triangle t2 = new Triangle(10,12);
		t2.display();
	}
}