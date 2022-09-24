class Pyramid6
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for(int s=i;s<=8;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
