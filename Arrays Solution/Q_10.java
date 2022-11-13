import java.util.Scanner;
class Q_10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		int a[] = new int[n];		
		
		System.out.println("Enter Elements: ");
		for(int i=0; i<n; i++)
		{
			int num = sc.nextInt();
			a[i] = num;
		}
		System.out.println("Given array is: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		System.out.println();	
		
		System.out.println("The array's order is: ");
		int asc =0, dsc=0;
		for(int i=0; i<n-1; i++)
		{
			if( a[i]<a[i+1] )
			{
				asc++;				
			}
			else if( a[i]>a[i+1] )
			{
				dsc++;				
			}	
		}	
		if(asc == n-1)
			System.out.println(" Ascending ");
		else if(dsc == n-1)
			System.out.println(" Descending ");
		else
			System.out.println(" Random ");
		
	}	
}