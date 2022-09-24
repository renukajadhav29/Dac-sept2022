class PatternS10
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
