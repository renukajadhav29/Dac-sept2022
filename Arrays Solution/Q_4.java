import java.util.Scanner;
class Q_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:-> ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter 5 elements of an array :-> ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse array -> ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+", ");
		}
	}
}