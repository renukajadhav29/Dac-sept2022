import java.util.*;
class Q_19
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("Sum of array element = "+sum);
	}
}
/*

Enter Array Size :5
Enter Array Elements :12
23
4
21
6
Sum of array element = 66

*/
