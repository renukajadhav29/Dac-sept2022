//WAP in java to display Fibonacci series using command line argument
class Fibonacci
{
	public static void main(String args[])
	{
		int range=Integer.parseInt(args[0]);
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		System.out.println(num2+"\n"+num3);
		for(int i=3;i<=range;i++)
		{
			num1=num2;
			num2=num3;
			num3=num1+num2;
			System.out.println(num3);
		}
	}
}