import java.util.Arrays;
class Q_2
{
	public static void main(String args[])
	{
		int arr1[] = new int[] {1,3,4,11,5,43,7};
		int arr2[] = new int[] {1,3,4,11,5,43,7};
		int arr3[] = {21,3,4,11,55,43,17};
		int arr4[] = {12,24,36,48,60,72,84};
		
		boolean res1 = Arrays.equals(arr1,arr2);
		if(res1 == true)
			System.out.println("arr1 and arr2 are equal...");
		else
			System.out.println("arr1 and arr2 are not equal...");
		
		boolean res2 = Arrays.equals(arr3,arr4);
		if(res2 == true)
			System.out.println("arr3 and arr4 are equal...");
		else
			System.out.println("arr3 and arr4 are not equal...");
	}
}