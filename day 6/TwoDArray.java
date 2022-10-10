class TwoDArray
{
	public static void main(String args[])
	{
		int arr[][];
		arr=new int [2][3];
		arr[0][0]=31;
		arr[0][1]=33;
		arr[0][2]=35;
		arr[1][0]=37;
		arr[1][1]=39;
		arr[1][2]=3;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
	}
}