class Q_12
{
	public static void main(String args[])
	{
		for(char i=65;i<=70;i++)
		{
			for(int s=i;s<70;s++)
				System.out.print(" ");
			for(char j=65;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}