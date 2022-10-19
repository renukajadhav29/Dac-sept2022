import java.util.*;
import java.lang.Math;
class Operations
{
	static int sum,sub,mult;
	static double pow1;
	
	static void add(int num1,int num2)
	{
		sum=num1+num2;
		System.out.println("Addition=> "+sum);
		System.out.println("=========================================");
	}
	
	static void diff(int num1,int num2)
	{
		sub=num1-num2;
		System.out.println("Substraction=>"+sub);
		System.out.println("=========================================");
	}
	
	static void prod(int num1,int num2)
	{
		mult=num1*num2;
		System.out.println("Multiplication =>"+mult);
		System.out.println("=========================================");
	}
	
	static void power(int num1,int num2)
	{
		pow1=Math.pow(num1,num2);
		System.out.println("Power="+pow1);
		System.out.println("*********************************************");
	}
}
public class MathOperation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();

		Operations.add(n1,n2);
		Operations.diff(n1,n2);
		Operations.prod(n1,n2);
		Operations.power(n1,n2);
		
		
		
	}
}