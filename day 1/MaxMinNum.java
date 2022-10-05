import java.util.*;
class MaxMinNum
{
	//swap two numbers without using third variable
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Max number is:- "+a);
			System.out.println("Min number is:- "+b);
		}
		else
		{
			System.out.println("Max number is:- "+b);
			System.out.println("Min number is:- "+a);
		}
	}
}