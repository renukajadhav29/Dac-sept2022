public class MyMergeSort		//time complexity:-> 
{
	public static void mergeSort(int arr[],int startidx,int mid,int endidx)
	{
		int merged[] = new int[endidx-startidx+1];//taken a new array to store sorted elements
		int index1 = startidx;
		int index2 = mid+1;
		int x = 0;
		while(index1 <= mid && index2 <= endidx)
		{
			if(arr[index1] <= arr[index2])
			{
				merged[x] = arr[index1];
				x++;
				index1++;
				/*
				
				or
				
				merged[x++] = arr[index1++];
				
				*/
			}
			else
			{
				merged[x++] = arr[index2++];
			}
		}
		
		while(index1 <= mid)
		{
			merged[x++] = arr[index1++];
		}
		
		while(index2 <= endidx)
		{
			merged[x++] = arr[index2++];
		}
		
		for(int i=0,j=startidx; i<merged.length; i++, j++)
		{
			arr[j] = merged[i];
		}
	}
	public static void divide(int arr[],int startidx,int endidx)
	{
		if(startidx >= endidx)
		{
			return;
		}
		int mid = startidx+(endidx-startidx)/2;
		divide(arr,startidx,mid);
		divide(arr,mid+1,endidx);
		
		mergeSort(arr,startidx,mid,endidx);
	}
	public static void main(String args[])
	{
		int arr[] = {3,6,9,2,5,16,7,1};
		int n = arr.length;
		
		System.out.println("Before sorting:-> ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		divide(arr,0,n-1);
		
		System.out.println("\nAfter sorting:-> ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}