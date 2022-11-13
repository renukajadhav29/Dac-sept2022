import java.util.Scanner;
import java.util.Arrays;
class Q_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays :-> ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("enter five elements of an array :-> ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Smallest element in an array is :-> "+arr[0]);
		System.out.println("Greatest element in an array is :-> "+arr[n-1]);
	}
}