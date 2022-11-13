//Java Program to Illustrates Use of Instance Inner Class
class Outer
{
	private int i = 100;
	
	class Inner
	{
		void print()
		{
			System.out.println("I => "+i);
		}
	}
}
class Q_3
{
	public static void main(String args[])
	{
		Outer o2 = new Outer();
		Outer.Inner o1 = o2.new Inner();//can access outer class data in inner class but not able to access inner class data directly.
		
		//Outer o2 = new Inner();
		o1.print();
	}
}