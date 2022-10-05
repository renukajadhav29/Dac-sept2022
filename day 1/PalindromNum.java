import java.util.*;
class PalindromNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.print(temp+" is a Palingrom Number\n");
		else
			System.out.print(temp+ "is not a Palindrom Number");
	}
}