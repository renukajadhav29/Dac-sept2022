//Java Program to Illustrates Use of Chaining Constructor
class Q_18
{
	Q_18()
	{
		System.out.print("Zero argument constructor here");
	}
	Q_18(int lpa)
	{
		this();
		System.out.println("\nOne argument constructor");
	}
	Q_18(String str1,String str2)
	{
		this(35);
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static void main(String args[])
	{
		Q_18 q1 = new Q_18("Hello","FutureSDM2");
	}
}