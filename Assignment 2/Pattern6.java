class Pattern6
{
	public static void main(String args[])
	{
		
		for(int i=65;i<=69;i++)
		{
			for(int s=i;s<=69;s++)
			{
				System.out.print(" ");
			}
			for(char j=65;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
