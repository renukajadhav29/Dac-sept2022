import java.util.Scanner;
class Q_20
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		int[] op=new int[size];
		int k=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				op[k]=arr[i];
				k++;
			}
		}
		System.out.print("Array Elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		System.out.print("After seperation array element are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(op[i]+"   ");
		}
	}
}