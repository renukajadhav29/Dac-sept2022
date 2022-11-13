//Java Program to Illustrate Use of Methods in a Class
import java.util.Scanner;
class Q_11
{	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int sub(int a,int b)
	{
		return a-b;
	}
	
	static int multiplication(int a,int b)
	{
		return a*b;
	}
	
	static int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		b=sc.nextInt();
		
		System.out.println("Addition : "+add(a,b));
		System.out.println("Substraction : "+sub(a,b));
		System.out.println("Multiplication : "+multiplication(a,b));
		System.out.println("Division : "+division(a,b));
	}
}