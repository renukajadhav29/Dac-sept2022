class Q_25
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=i;j<=7;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<i;k++)
				System.out.print(k);
			System.out.println();
		}
	}
}