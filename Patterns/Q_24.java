class Q_24
{
	public static void main(String args[])
	{
		int j1=1;
		int j2=6;
		int j3=10;
		int j4=13;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(j1);
					j1++;
				}
				else if(j==2)
				{
					System.out.print(j2);
					j2++;
				}
				else if(j==3)
				{
					System.out.print(j3);
					j3++;
				}
				else if(j==4)
				{
					System.out.print(j4);
					j4++;
				}
				else
				{
					System.out.print(j4++);
				}
			}
			System.out.println();
		}
	}
}