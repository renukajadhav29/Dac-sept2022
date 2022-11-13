import java.util.*;

class Q_3
{
	public static void main(String[] args)
	{
		System.out.print("Enter Size of Array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Sum value :");
		int sum=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if((arr[i]+arr[j])==sum)
				{
					System.out.print("["+arr[i]+","+arr[j]+"]");
				}
			}

		}
	}
}
		

/* 				
Enter Array Size :4
Enter Array Elements :2 4 6 8
Enter Sum value :8
[2,6][4,4][6,2]
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */