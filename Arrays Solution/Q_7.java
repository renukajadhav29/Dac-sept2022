import java.util.Scanner;
class Q_7
{
	public static void main(String args[])
	{
		System.out.print("Enter First Array Size :");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.print("Enter First Array Elements :");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		System.out.print("Enter Second Array Size :");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int merge=size1+size2;
        int arr3[] = new int[merge];
       	int i=0;
		int j=0;
		int k=0;
		
		while (i<size1 && j<size2)
        {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
		
        while (i<size1)
            arr3[k++] = arr1[i++];
		
		while (j<size2)
            arr3[k++] = arr2[j++];   
		 
     
        System.out.println("Array after merging");
        for (i=0;i<merge;i++)
            System.out.print(arr3[i] + " ");
	}
}

/*

output:
Enter First Array Size :4
Enter First Array Elements :12
12
12
12
Enter Second Array Size :5
Enter Array Elements :1
2
3
4
5
Array after merging
12 1 12 2 12 3 12 4 5

*/