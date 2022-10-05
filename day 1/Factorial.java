import java.util.*;
class Factorial
{
	//swap two numbers without using third variable
	public static void main(String args[])
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is=> "+fact);
	}
}