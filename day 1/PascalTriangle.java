import java.util.*;
import java.lang.Math;
class PascalTriangle
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i; j<n;j++)
			{
				System.out.print(" ");
			}
			n1=(int)(Math.pow(11,i));
			System.out.println(n1);
			
		}
	}
}