import java.lang.Math;
import java.util.*;
class RandomNo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(" "+n+" Random Numbers-> ");
		for(int i=0;i<n;i++)
		{
			System.out.println(Math.random());
		}
	}
}