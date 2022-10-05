import java.util.*;
class PrimeNum
{
	//swap two numbers without using third variable
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{	
				flag++;
			}
		}
		if(flag==0)
			System.out.println(n+" is Prime Number");
		else
			System.out.println("Not Prime Number");
	}
}