class PatternS13
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int s=i;s<5;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int s=5;s>i+1;s--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
