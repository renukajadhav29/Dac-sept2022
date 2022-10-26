class Q_13
{
	public static void main(String args[])
	{
		for(char i=65;i<=70;i++)
		{
			for(int s=i;s<70;s++)
				System.out.print(" ");
			for(char j=65;j<=i;j++)
			{
				if(j==65 || i==j)
				{
					System.out.print(i+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(char i=70;i>=65;i--)
		{
			for(int s=i;s<70;s++)
				System.out.print(" ");
			for(char j=65;j<=i;j++)
			{
				if(j==65 || i==j)
				{
					System.out.print(i+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}