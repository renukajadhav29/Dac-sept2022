import java.util.Scanner;
class Q_9
{
	public static void main(String[] args)
	{
		System.out.print("Enter Number upto which you want to print series :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			if(i%2==1)
				System.out.print((i*i*i)+"  ");
			else
				System.out.print((i*i)+"  ");
		}
	}
}