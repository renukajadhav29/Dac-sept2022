class TwoDExample
{
	public static void main(String args[])
	{
		//int myarr[][]=new int[2][3];
		int myarr[][]={{5,10,15,20},    //here we are directly assign the array elements so no need of new keyword
					{25,30,35}};
		for(int i=0;i<myarr.length;i++)
		{
			for(int j=0;j<myarr[i].length;j++)
			{
				System.out.print(myarr[i][j]+" ");
			}
			System.out.println();
		}
	}
}