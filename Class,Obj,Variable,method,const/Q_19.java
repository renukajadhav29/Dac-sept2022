/*
Java Program to Create an Object for Class and Assign Value in the Object 
using Constructor
*/
class DefaultConstructor
{
	static String Name,address;
	
	DefaultConstructor()
	{
		Name = "Renuka";
		address = "Latur";
	}
	static void display()
	{
		System.out.print("Name : "+Name);
		System.out.print("\nAddress : "+address);
	}
}
class Q_19
{
	public static void main(String args[])
	{
		DefaultConstructor d1 = new DefaultConstructor();
		DefaultConstructor.display();
	}
}