import java.util.*;

class Array_Q_12
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		System.out.println("1. Right Shift ");
		System.out.println("2. Left Shift ");
		System.out.println("Enter your choice 1/2");
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.print("Enter Shifting position :");
			int shift=sc.nextInt();
			
			int[] temp=new int[size];
			int k=0;
			for(int i=shift;i<size;i++)
			{
				temp[k]=arr[i];
				k++;
			}
			for(int i=0;i<shift;i++)
			{
				temp[k]=arr[i];
				k++;
			}
			for(int i=0;i<size;i++)
			{
				arr[i]=temp[i];
			}
			System.out.print("Array Elements After Shifting are :");
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]+"   ");
			}
		}
		else if(ch==2)
		{
			System.out.print("Enter Shifting position :");
			int shift=sc.nextInt();
			
			int[] temp=new int[size];
			int k=0;
			for(int i=size-shift;i<size;i++)
			{
				temp[k]=arr[i];
				k++;
			}
			for(int i=0;i<size-shift;i++)
			{
				temp[k]=arr[i];
				k++;
			}
			
			for(int i=0;i<size;i++)
			{
				arr[i]=temp[i];
			}
			System.out.print("Array Elements After Shifting are :");
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]+"   ");
			}
		}
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array12
Enter Array Size :5
Enter Array Elements :1 2 3 4 5
1. Right Shift
2. Left Shift
Enter your choice 1/2
1
Enter Shifting position :3
Array Elements After Shifting are :4   5   1   2   3
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array12
Enter Array Size :5
Enter Array Elements :1 2 3 4 5
1. Right Shift
2. Left Shift
Enter your choice 1/2
2
Enter Shifting position :3
Array Elements After Shifting are :3   4   5   1   2
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>

 */