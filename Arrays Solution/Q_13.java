import java.util.Scanner;
class Q_13
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
		for (int i=0;i<size;i++)   
		{  
			for (int j=i+1;j<size;j++)   
			{  
				int temp = 0;  
				if(arr[i]>arr[j])   
				{  
					temp=arr[i];  
					arr[i]=arr[j];  
					arr[j]=temp;  
				}  
			}
		}  
		System.out.print("Sorted Array Elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
	}
}