class Q_4
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=i;s<=5;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j)
					System.out.print("1 ");
				else if(i==4 && j==2)
					System.out.print("3 ");
				else if((i==5 && j==2) || (i==5 && j==4))
					System.out.print("4 ");
				else if(i==5 && j==3)
					System.out.print("6 ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}