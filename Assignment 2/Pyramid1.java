class Pyramid1
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int s=i;s<=8;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
