class GCDUsingRecursion
{
	static String GCD(int num)
	{
		if(num == 1)
		{
			return "int";
		}
		return "GCD(int "+GCD(num-1)+")";
	}
	public static void main(String args[])
	{
		int num=5;
		System.out.println(GCD(num));
	}
}
/*
Output:->

GCD(int GCD(int GCD(int GCD(int int))))







n=3
gcd(int,gcd(int,int))
gcd(a,gcd(a,a))

if(n==1)
	return "int";
return gcd("int",gcd(n-1))



Write a menu driven program for array implementation.
-Insert
-Delete
-Access
-Search
-exit

Find Duplicate in an array.

Removeing punctuations from given String
eg:->
input: %Welcome' to @cdac
output: Welcome to cdac



program to find initials of a name
input: Kal Ho na Ho
output: K H n H

*/