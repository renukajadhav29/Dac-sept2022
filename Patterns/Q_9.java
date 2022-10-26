class Q_9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int s =1;s<i;s++)
				System.out.print(" ");
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=5;i>1;i--)
		{
			for(int s =1;s<i-1;s++)
				System.out.print(" ");
			for(int j=i-1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}