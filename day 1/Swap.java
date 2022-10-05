import java.util.*;
class Swap
{
	//swap two numbers without using third variable
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Bafore Swap");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
}