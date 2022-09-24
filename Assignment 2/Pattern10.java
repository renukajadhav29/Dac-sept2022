class Pattern10
{
	public static void main(String args[])
	{
		
		for(char i=69;i>=65;i--)
		{
			for(char s=65;s<i;s++)
			{
				System.out.print(" ");
			}
			for(char j=i;j<=69;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
/*
    E
   D E
  C D E
 B C D E  
A B C D E



*/