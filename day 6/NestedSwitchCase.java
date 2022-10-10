class NestedSwitchCase
{
	public static void main(String args[])
	{
		int choice=2;
		//outer switch(choice)
		switch(choice)
		{
			case 1:
				System.out.println("Choice 1");
				char ch='y';
				switch(ch)
				{
					case 'x':
						System.out.println("Inner Switch case x");
						break;
					case 'y':
						System.out.println("Inner Switch case y");
						//break outer
						break;
					default:
						System.out.println("Default inner switch");
						break;
				}
				System.out.println("Out of inner Switch");
				break;
			case 2:
				ch='e';   // ch is not limited for inner switch it is accessible outer switch also bt have to initialies the value to "ch"
				System.out.println("CH="+ch);
				System.out.println("Choice 2");
				break;
			case 3:
				System.out.println("Choice 3");
				break;
			default:
				System.out.println("default");
				break;
				
				
		
		}
	}
}