import java.util.*;
class Demo
{
	//swap two numbers using third variable
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Bafore Swap");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
}