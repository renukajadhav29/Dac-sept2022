//Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method
import java.util.Scanner;
class Q_22
{
	static int a,b;
	int c;
	static int d;
	
	void add()
	{
		c = a + b;
		d = a + b;
	}	
	static void display()
	{
		//System.out.println("Addition : "+c);//we cant access instance variable in static methods
		System.out.println("Addition : "+d);//can access only static variables
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		Q_22 q1 = new Q_22();
		q1.add();
		display();
	}
}