class Q_5
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int s=4;s>i;s--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			
			for(int j=1+1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			
			for(int j=1+1;j<=i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}